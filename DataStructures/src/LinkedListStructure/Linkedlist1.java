package LinkedListStructure;

public class Linkedlist1 {

	Node head=null;
	int length=0;
	boolean vistited=false;
	public Node getHead() {
		return head;
	}
	public void setHead(Node head) {
		this.head = head;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public boolean isVistited() {
		return vistited;
	}
	public void setVistited(boolean vistited) {
		this.vistited = vistited;
	}
	public Linkedlist1(Node head, int length, boolean vistited) {
		super();
		this.head = head;
		this.length = length;
		this.vistited = vistited;
	}
	public Linkedlist1() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Linkedlist1 [head=" + head + ", length=" + length + ", vistited=" + vistited + "]";
	}
	
	 public void addAtFirst(Node dataNode)
	 {
		 if(dataNode==null)
		 {
			 return;
		 }
		 if(head==null)
		 {
			 head=dataNode;
			 return;
		 }
		 Node temp=head;
		
		 while(temp.next!=null)
		 {
			temp=temp.next;
			//System.out.println( "is My DS"+temp.data);
		 }
		 temp.next=dataNode;
		 this.length=this.length+1;
	 }
	 public void diplayData()
	 {
		 Node n=this.getHead();
			
			while(n.getNext()!=null)
			{
				System.out.print("  " + n.getData());
				n=n.getNext();
				
			}
			System.out.print(" "+n.getData()+"\n");
	 }
	 
	 
	 public Node getNthNode(int n)
	 {
		 if(n>length)
		 {
			 return null;
		 }
		 if(n<0)
		 {
			 return null;
		 }
		 if(n==0)
		 {
			 return this.getHead();
		 }
		 
		 Node data=this.getHead();
		 while(n>0)
		 {
			 data=data.next;
			 n--;
		 }
		 return data;
	 }
	 
	 
	public void deleteNthNode(int n)
	{
		n=n-1;
		 Node data=this.getHead();
		 while(n>0)
		 {
			 data=data.next;
			 n--;
			
		 }
		 
		 data.next=data.next.next;
		 this.length=this.length-1;
		 
	}
	
	
	public void insertNthNode(Node temp,int n)
	{
		n=n-1;
		Node var=null;
		 Node data=this.getHead();
		 while(n>0)
		 {
			 
			 data=data.next;
			 n--;
		 }
		 var=data.next;
		 data.next=temp;
		 temp.next=var;
		 
	}
	
	
	public void reverseList()
	{
	
		Node prev=null;
		Node current=this.getHead();
		Node next=this.getHead();
	    while(current!=null)
	    {
	    	
	    		next=current.next;
	    		
	    		current.next=prev;
	    		
	    		prev=current;
	    		
	    		current=next;
	    }
	    this.setHead(prev);
	   
	}
	
	

	public boolean swapTwoNodes(int data1,int data2)
	{
		Node prev1=null;
		Node hold1=null;
		Node node1=null;
		
		
		Node next=this.getHead();
		
		
		Node node2=null;
		Node prev2=null;
		Node hold2=null;
		boolean flag=false;
		
		
		while(next.getNext()!=null)
		{
			
			if(next.getNext().getData()==data1)
			{
				node1=next.getNext();
				if(next!=null)
				prev1=next;
				if(node1.getNext()!=null)
				hold1=node1.getNext();
				flag=true;
			}
			if(flag)
			{
				break;
			}
			next=next.getNext();
		}
		if(!flag)
		{
			System.out.println("Not found :"+data1);
			return false;
		}
	//	System.out.println("prev "+prev1.data+" hold "+hold1.data+" node::"+node1.data);
		next=this.getHead();
		flag=false;
		while(next.getNext()!=null)
		{
			
			if(next.getNext().getData()==data2)
			{
				node2=next.getNext();
				if(next!=null)
				prev2=next;
				if(node2.getNext()!=null)
				hold2=node2.getNext();
				flag=true;
			}
			if(flag)
			{
				break;
			}
			next=next.getNext();
		}
		if(!flag)
		{
			System.out.println("Not found :"+data2);
			return false;
		}
		//System.out.println("prev "+prev2+" hold "+hold2+" node::"+node2);
		
		prev1.setNext(node2);
		node1.setNext(hold2);
		prev2.setNext(node1);
		node2.setNext(hold1);
		return true;
	}
	public Boolean contains(int data)
	{

		Node next=this.getHead();
		
		while(next.getNext()!=null)
		{
			
			if(next.getNext().getData()==data)
			{
			
				return true;
			}
			next=next.getNext();
			}
		return false;
	}
	
	
	public Integer getOccrances(int data)
	{
      Node next=this.getHead();
		int count=0;
		while(next.getNext()!=null)
		{
			if(next.getNext().getData()==data)
			{
				++count;
			}
			next=next.getNext();
		}
		
		return count;
	}
	
}
