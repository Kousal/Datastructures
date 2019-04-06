package ds;

public class BTtoBST {
	public static void main(String[] args)
	{
		BSTNode root = new BSTNode();
		root.setValue(3);
		BSTNode node = new BSTNode();
		node.setValue(5);
		root.setLeft(node);
		node = new BSTNode();
		node.setValue(2);
		root.setRight(node);
		node = new BSTNode();
		node.setValue(1);
		root.getLeft().setLeft(node);
		node = new BSTNode();
		node.setValue(4);
		root.getLeft().setRight(node);
		node = new BSTNode();
		node.setValue(6);
		root.getRight().setLeft(node);
		
		BinarySearchTree bst = new BinarySearchTree();
		bst.setRoot(root);
		
		bst = convert(bst);
		
	}
	
	public static BinarySearchTree convert(BinarySearchTree bt)
	{
		bt.inOrderPrint(bt.getRoot());
		return bt;
	}
}
