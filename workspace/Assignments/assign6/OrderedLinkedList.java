// Colin Bruzas testing commit
// OrderLinkedList creates a linked list of integers in ascending order
// Contains insert and delete methods which keep nodes in ascending order
// Also contains recursive toString and get method to find position of specific Int

package assign6;

public class OrderedLinkedList 
{
		//Inner Class
		private class IntNode 
		{
			
		public int info;
		public IntNode next;
		IntNode (int num, IntNode ptr) 
		{
		info = num;
		next = ptr;
		}
		}
		
	// Start public class
	// Variables
	private IntNode list;
	private int count;

	//Constructor
	public OrderedLinkedList()
	{
		IntNode list;
		count = 0;
	}
	
	public int NumEntries()
	{
		return count;
	}
	
	public void insert(int num)
	{
		IntNode numNode = new IntNode(num, null);
		IntNode temp = list;
		boolean run = false;
		int runCount = 0;
		
		// Create first node if Linked List is empty
		if(count == 0)
		{
			list = numNode;
			count++;
			run = true;
		}
		
		// Scan linked list for duplicates
		while(temp != null && count > 0 && run == false)
		{
			if(num == temp.info)
				run = true;
			temp = temp.next;
		}
			// Reset temp variable
			temp = list;
		
		// Check for ordered place in list
		while(runCount < count && run == false)
		{
			
			// If at end of list. Add new node to the end of the last 
			if(runCount == count-1 )
			{
				if(temp.info < num)
				{
					temp.next = numNode;
				}
				else
				{
					numNode.next = temp;
					list.next = numNode;
				}
				
				run = true;
				count++;
			}
				
			// Insert Node at beginning if it's smaller than list
			if(list.info > num )
			{
				numNode.next = list;
				list = numNode;
				run = true;
				count++;
			}
			
			// Insert node in between larger elements
			if(num > temp.info && temp.next.info > num && run == false)
			{
				numNode.next = temp.next;
				temp.next = numNode;
				run = true;
				count++;
			}
		// Increment elements of the loop	
		 temp = temp.next;
		 runCount++;
		}
	}
	
	// Remove node from list, if not found throw Exception
	public void delete(int num) throws NullPointerException
	{
		IntNode front = list;
		IntNode back = list.next;
		boolean run = false;
		
				
		try
		{	
			//Check if it's the first num
			if(front.info == num && count > 0)
			{
				list = front.next;
				run = true;
			}
			
			//Use back to check the rest of the elements
			while(run == false)
				{
					// Remove pointer to 'removed element'
					if(back.info == num)
					{
						front.next = back.next;
						run = true;
					}
					// Increment if not found
					else 
					{
						front = front.next;
						back = back.next;
					}
				}
					
			count--;
		}
		catch(NullPointerException e)
		{
			// Catch prints out error
			String result = num + " Delete not succesful";
			System.out.println(result);
		}
	}
	//Initializes result Calls String recursion
	public String toString()
	{
		String result = "";
		return stringRecurse(list , result);
		
	}
	// Recursive Method putting contents of list into a String
	private String stringRecurse(IntNode temp, String result)
	{
		if(temp.next == null)
			return result += temp.info;
		else
			return result += temp.info + " " + stringRecurse(temp.next, result); 	
	}
	
	// Calls recursive method, sets up exception
	public int get(int num) throws NullPointerException
	{
		int position = 0;
		try
		{
			position =  runGet(num, position, list);;
		}
		catch(NullPointerException e)
		{
			// Catch Message
			System.out.println("Get not succesful");
		}
		return position;
	}	
	// Recursive method for get, searches for match to int input
	public int runGet(int num, int position, IntNode temp)
	{
		if(temp.info == num)
			return position;
		else
		{
			return runGet(num, position+1 , temp.next);
		}
	}
 }	

