package ds;

public class BinarySearchTree {
	private BSTNode root;

	public BSTNode getRoot() {
		return root;
	}

	public void setRoot(BSTNode root) {
		this.root = root;
	}
	
	public BSTNode insert(int val, BSTNode node) {
		if(node==null)
		{
			node = new BSTNode();
			node.setValue(val);
			return node;
		}
		else
		{
			if(node.getValue() < val)
				node.setRight(insert(val,node.getRight()));
			else if(node.getValue() > val)
				node.setLeft(insert(val,node.getLeft()));
			else
				return node;
				
		}
		return node;
	}
	public void add(int val)
	{
		root = insert(val, root);
	}
	
	public void inOrderPrint(BSTNode node)
	{
		if(node != null)
		{
		inOrderPrint(node.getLeft());
		System.out.print("-->"+node.getValue());
		inOrderPrint(node.getRight());
		}
	}
	public void preOrderPrint(BSTNode node)
	{
		if(node != null)
		{
		System.out.print("-->"+node.getValue());
		preOrderPrint(node.getLeft());
		preOrderPrint(node.getRight());
		}
	}
	public void postOrderPrint(BSTNode node)
	{
		if(node != null)
		{
		postOrderPrint(node.getLeft());
		postOrderPrint(node.getRight());
		System.out.print("-->"+node.getValue());
		}
	}
	
	public static void main(String args[])
	{
		BinarySearchTree bst = new BinarySearchTree();
		bst.add(8);
		bst.add(3);
		bst.add(10);
		bst.add(1);
		bst.add(6);
		bst.add(14);
		bst.add(4);
		bst.add(7);
		bst.add(13);
		System.out.println("\nInorder");
		bst.inOrderPrint(bst.root);
		System.out.println("\nPreorder");
		bst.preOrderPrint(bst.root);
		System.out.println("\nPostorder");
		bst.postOrderPrint(bst.root);
	}
	
}
