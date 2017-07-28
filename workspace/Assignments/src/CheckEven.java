//this program reads ina an integer and check whether
// it is even or odd, the program will continue unless
//user picks "N/n" for a question

import java.util.Scanner;

public class CheckEven
{ public static void main(String [] args)

  {
	 //declare variables
	 int num;
	 int counterEven=0, counterOdd=0;
	 char answer;


	 Scanner scan= new Scanner(System.in);// outside the loop

	 do
	 {
		 //user prompt
		 System.out.print("Please enter an integer: ");
		 num = scan.nextInt();
		 if (num %2==0)
		 {
			 counterEven++;
			 System.out.println(num+ " is even");

	     }

	     else
	     {
	         counterOdd++;
			 System.out.println(num+ " is odd");

		 }

		 System.out.println("Want to continue (Y/y): ");
		 answer = (scan.next().charAt(0));

	 } while (answer=='Y' || answer =='y'); //End do while

	 System.out.println("You entered " + counterEven + " even numbers and "
	                     + counterOdd + " odd numbers");









  }//end of main
}// end of the class

