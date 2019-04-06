package ds;

public class FindLoopInSLL {
	public static void main(String[] ar)
	{
		LinkedList ll = new LinkedList();
		LLNode l1 = new LLNode(1);
		LLNode l2 = new LLNode(2);
		LLNode l3 = new LLNode(3);
		LLNode l4 = new LLNode(4);
		LLNode l5 = new LLNode(5);
		LLNode l6 = new LLNode(6);
		ll.add(l1);
		ll.add(l2);
		ll.add(l3);
		ll.add(l4);
		ll.add(l5);
		ll.add(l6);
		//ll.add(l4);
		System.out.println(findLoop(ll));
	}
	static public boolean findLoop(LinkedList checkLoop)
	{
		int counter = 0;
		LLNode first = checkLoop.getHead();
		LLNode second = checkLoop.getHead().getNext();
		while(first != null && second !=null && second != first)
		{
			counter++;
			System.out.println(counter);
			first = first.getNext();
			second = second.getNext();
			if(second != null)
					second = second.getNext();
			else
				return false;
		}
		
		if(first == second)
			return true;
		return false;
	}
}
