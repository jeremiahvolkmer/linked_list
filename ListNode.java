//list node class for storing a single node in a linked list 
//this node stores intriguer values 
public class ListNode 
{
	//fields
	//data stored in node 
	public int data;
	//link to the next node in the list
	public ListNode next;
	
	//constructors
	public ListNode()
	{
		this(0,null);
	}

	public ListNode(int data)
	{
		this(data,null);
	}
	
	public ListNode(int data, ListNode next)
	{
		this.data=data;
		this.next=next;
	}
	
	
	
}
