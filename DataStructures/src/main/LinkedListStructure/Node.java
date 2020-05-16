package LinkedListStructure;
public class Node 
{
	Node next;
	int data;
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node(Node next, int data) {
		super();
		this.next = next;
		this.data = data;
	}
	public Node() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
	
	
	
	
}