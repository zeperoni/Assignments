
/*-------------------------------------------------------------
// AUTHOR: Colin Bruzas
// FILENAME: lab2
// SPECIFICATION: Operating on Strings
// FOR: CSE 110 Lab #2
// TIME SPENT:1 hour
//-----------------------------------------------------------*/

//All imports has to be outside class
import java.util.Scanner;

//class name must match the file's name
public class Lab2
{
    // we must have a main method to run the program
    public static void main(String[] args)
{
    //declare & initialize variables of different types
    String firstName = "";
    String lastName = "";
    String fullName = "";
    int nameLength = 0;

    //create a Scanner object to get user's input from keyboard
    Scanner scan = new Scanner(System.in);

	  //user prompt to get user's first name
      System.out.println("Please enter first name: ");
      firstName = scan.nextLine();


		  //user prompt to get user's last name
		  System.out.println("Please enter last name: ");
		  lastName = scan.nextLine();

		  //Part 1: Concatenation of first and last name
  	   	  fullName = (firstName+ " " + lastName);

          //Part 2:Uppercase conversion
          fullName = fullName.toUpperCase();

          //Part 3: Find the string length and store it
          nameLength = (fullName.length());


          //Part 4: Display Results both UpperCase name and nameLength
          System.out.println("Full name (in capitals): " + fullName);
          System.out.println("Length of full name: " + nameLength);




              // Define two String variables, title1 and title2 using String constructor to initialize them
			  String title1 = new String("java");
			  String title2 = new String("java");

			  // Compare the two strings and print which one of the two ways works. Follow code below:
			  if (title1 == title2)
			  {
			      //Print message "String comparison using "==" sign works" on screen
			      //-->
			      System.out.println("String comparison using \"==\" sign works");
			  }
			  else
			  {
			      //Print message "String comparison using "==" sign does NOT work" on screen
			      //-->
			      System.out.println("String comparison using \"==\" sign does NOT work");

			  }

			  if (title1.equals(title2))
			  {
			      //print message "String comparison using "equals" method works" on screen
			      //-->
			      System.out.println("String comparison using \"equals\" method works");
			  }
			  else
			  {
			      // print message "String comparison using "equals" method does NOT work" on screen
			      //-->
			      System.out.println("String comparison using \"equals\" method does NOT work");

}






	}

}