// Colin Bruzas
// Assign5 runs postfix operations using IntegerStack.java class

package assign5;
import java.util.*;

public class Assign5 {
	
	// public method sets up the System inputs
	public static void main (String [] args) {

		Scanner input = new Scanner (System.in);
		String line;
		System.out.println ("Enter an expression: ");
		line = input.nextLine();

		while (line.length() != 0) {
			processLine (line);
			System.out.println ("Enter an expression: ");
			line = input.nextLine();
		}
		System.out.println ("Program complete");
		input.close();
	}

	// Runs postfix operation using the IntegerStack class
	private static void processLine (String line) 
	{
		Scanner tokens = new Scanner (line);
		IntegerStack stack = new IntegerStack();
		boolean error = false;
		String tokenStr;
		String errorStr = "";
		int num, operand1, operand2; 
		int result = 0;

		
		
		while(tokens.hasNext() && error== false)
		{
			//get the token convert to string
			tokenStr = tokens.next();
			
			//check to see if it is an operand, add to the stack if true
			if(Character.isDigit(tokenStr.charAt(0)))
			{
				num = Integer.parseInt(tokenStr);
				stack.push(num);
			}
			
			// otherwise processes operators
			else
			{
				// checks to see if there are enough operands
				if (stack.size() <= 1)
					{
					error = true;
					errorStr = "Error: not enough Operands\n";
					}
				
				// takes last two operands
				// runs operation depending on operator
				// found with ASCII 
				else
					{
					operand1 = stack.peek();
					stack.pop();
					operand2 = stack.peek();
					stack.pop();
					
					if(tokenStr.charAt(0) == 43)
						result = operand1 + operand2;
					
					if(tokenStr.charAt(0) == 42)
						result = operand1 * operand2;
					
					if(tokenStr.charAt(0) == 45)
						result = operand2 - operand1;
					
					if(tokenStr.charAt(0) == 47)
					{
						if(operand1 == 0)
						{
							error = true;
							errorStr = " Error: division by zero\n";
						}
						else
						result = operand2 / operand1;
					}
					// adds result to stack
					if (error == false)
						 stack.push(result);
					}	 
			}
		}//end while
		
		// Check to see if there are too many operators
		if(error == false && stack.size() > 1)
		{
			error = true;
			errorStr = "Error: not enough operators\n";
		}
		//Print results
		System.out.print(line);
		if(error == true)
			System.out.print(errorStr);
		else
			System.out.print(" = " + stack.peek() + "\n");
		tokens.close();
	}	
}
