package ds;
public class LinkedList {
	private LLNode head;
	public LinkedList()
	{
		head = null;
	}
	public LinkedList(LLNode head)
	{
		this.head = head;
	}
	public void add(int val) {
		if(head == null)
		{
			head = new LLNode();
			head.setValue(val);
			head.setNext(null);
		}
		else
		{
			LLNode iter = head;
			while(iter.getNext() != null)
			{
				iter = iter.getNext();
			}
			LLNode insertNode = new LLNode();
			insertNode.setValue(val);
			insertNode.setNext(null);
			iter.setNext(insertNode);
		}
		System.out.println("\n Added - "+val);
		print();
	}
	
	public void print() {
		LLNode iter = head;
		while(iter != null)
		{
			System.out.print(iter.getValue() + "-->");
			iter = iter.getNext();
		}
		System.out.print("null");
	}
	
	public static void main(String[] a)
	{
		LinkedList ll = new LinkedList();
		ll.add(1);
		ll.add(2);
		ll.add(4);
		ll.add(3);
		ll.print();
	}
	
	public void add(LLNode ll) {
		if(head == null)
		{
			head = ll;
		}
		else
		{
			LLNode iter = head;
			while(iter.getNext() != null)
			{
				iter = iter.getNext();
			}
			
			iter.setNext(ll);
		}
		System.out.println("\n Added new node");
		//print();
	}
	public LLNode getHead() {
		return head;
	}
	public void setHead(LLNode head) {
		this.head = head;
	}
	
}
