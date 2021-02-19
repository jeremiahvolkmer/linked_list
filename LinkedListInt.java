//class linked list int can store a list of ints
public class LinkedListInt 
{
	//fields 
	//first value in the list
	private ListNode front; 
	
	//constructors
	public LinkedListInt()
	{
		front = null;
	}
	
	//methods 
	//size method ** returns the current number of elements in the list
    public int size()
    {
    	int count = 0;
    	ListNode current = front;
    	while(current != null)
    	{
    		current = current.next;
    		count++;
    	}
    	return count;
    }
    
    //return int in given index of the list
    public int get(int index)
    {
    	return nodeAt(index).data;
    }
    
    private ListNode nodeAt(int index)
    {
    	ListNode current = front;
    	for(int i = 0; i < index; i++)
    	{
    		current = current.next;
    	}
    	return current;
    }
    
    //create a comma separated bracketed version of the list
    public String toString()
    {
    	if(front == null)
    	{
    		return "[]";
    	}
    	else
    	{
    		String result = "[" + front.data;
    		ListNode current = front.next;
    		while(current != null)
    		{
    			result +=  ", " + current.data;
    			current = current.next;
    		}
    		result += "]";
    		return result;
    	}
    		
    }
    
    //if not found -1
    public int indexOf(int value)
    {
    	int index = 0;
    	ListNode current = front;
    	while (current != null)
    		
    	{
    		if (current.data == value)
    		{
    			return index;
    		}
    		index++;
    		current = current.next;
    	}
    	return -1;
    }
    
    //Append the given value to the end of the list
    public void add(int value)
    {
    	if (front == null)
    	{
    		front = new ListNode(value);
    	}
    	else 
    	{
    		ListNode current = front;
    		while(current.next != null)
    		{
    			current = current.next;
    			
    		}
    		current.next = new ListNode(value);
    	}
    }
    //insert value at the given index
    public void add(int index, int value)
    {
    	if(index == 0)
    	{
    		front = new ListNode(value, front);
    	}
    	else
    	{
    		ListNode current = nodeAt(index -1);
    		current.next = new ListNode(value, current.next);
    	}
    }
    
    //remove a value at a given index
    public void remove(int index)
    {
    	if (index == 0)
    	{
    		front = front.next;
    	}
    	else 
    	{
    		ListNode current = nodeAt(index -1);
    		current.next = current.next.next;
    	}
    }
    
    
	
	
}
