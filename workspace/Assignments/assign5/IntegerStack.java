package assign5;
// Colin Bruzas
// Stack creates an ArrayList of Integers
// They can only be added to the top and taken from top of the array
import java.util.ArrayList;

public class IntegerStack {
	private ArrayList<Integer> stack;
	private int size = 0;
	
	//initialize 
	public IntegerStack()
	{
		stack = new ArrayList<Integer>(); 
	}
	
	// Adds a number to the top of the stack increments size
	public void push(int num)
	{
		stack.add(num);
		size++;
	}
	
	// Removes top element of the stack, decrements size
	public void pop ()
	{
		stack.remove(size-1);
		size--;
	}
	
	// Returns top element of the stack
	public int peek()
	{
		return stack.get(size-1);
	}
	
	// Returns boolean true if the stack has no contents
	public boolean isEmpty()
	{
		boolean empty = false;
		if(size == 0)
			empty = true;
		return empty;
	}
	
	// Checks how large the stack is, -1 if empty
	public int size()
	{
		return size;
	}
}
