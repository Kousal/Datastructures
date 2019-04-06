package ds;

public class LLNode {
	public LLNode() {}
	public LLNode(int n)
	{
		value = n;
	}
	private Integer value;
	private LLNode next;
	public LLNode getNext() {
		return next;
	}
	public void setNext(LLNode next) {
		this.next = next;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	
	
}
