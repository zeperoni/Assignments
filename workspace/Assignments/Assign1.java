
import java.util.Scanner;

public class Assign1class {

	public static void main (String [] args) {
		String line = getInputLine();
		while (!isEmptyLine (line)) 
		{
			System.out.print("a");
			if (isPalindrome (line))
				System.out.println ("\"" + line +
				"\" is a palindrome and a " + getPalType (line));
			else
				System.out.println ("\"" + line + "\" is not a palindrome");
				line = getInputLine();
		}
		System.out.println ("End of program");
		}//End Main

	private static String getInputLine()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a line of input: ");
		String line = scan.nextLine();
		return line;
	}
	
	private static boolean isPalindrome(String phrase)
	{
		int left = 0;
		int right = phrase.length()-1;
		boolean okay = true;
		
		while(okay && left<right)
		{
			char char1 = phrase.charAt(left);
			//testing if char is digit or letter
			if(!(Character.isDigit(char1) || Character.isAlphabetic(char1)))
				left++;	
			else
				{
				char char2 = phrase.charAt(right);
				if(!(Character.isDigit(char2) || Character.isAlphabetic(char2)))
			    	right--;	
			    else
			    	{
			    	char1=Character.toUpperCase(char1);
			    	char2=Character.toUpperCase(char2);
					if(char1==char2)
					{
						left++;
						right--;
					}
						else 
							okay = false;	
			    	}
				}
		}//end while
		return okay;
	}
	
	private static boolean isEmptyLine(String str)
	{
		boolean emptyResult = false;
		if(str.isEmpty())
			emptyResult = true;
		return emptyResult;
	}
	
	
	private static String getPalType(String testPhrase)
	{
		String type = "phrase";
		boolean word = true;
		boolean hasLetter = false;
		boolean hasNumber = false;
		boolean phrase = false;
		int index=0;
		
		while(index< testPhrase.length() && phrase == false)
		{
			//Tests phrase at index for a letter
			// if the char is not a letter, "word" is ruled out
			if(!Character.isAlphabetic(testPhrase.charAt(index)))
				word = false;
			
			if(Character.isAlphabetic(testPhrase.charAt(index)))
				hasLetter = true;
			
			if(Character.isDigit(testPhrase.charAt(index)))
				hasNumber = true;
			
			if(hasNumber == true && hasLetter == true)
				phrase= true;
			index++;
		}
		
		if(word==true)
			type = "word";
		if(hasNumber == true && hasLetter == false)
			type = "number";
		return type;
	}
}//End Class
