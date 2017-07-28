/*-------------------------------------------------------------
// AUTHOR: Colin Bruzas
// ASU ID: 1212619562
// FILENAME: Lab 5
// SPECIFICATION: Demostration of loops and menu's
// TIME SPENT: 1hr
//-----------------------------------------------------------*/

import java.util.Scanner;


public class Lab5
{ public static void main (String []args)
 {

	 int choice; //initialize do-while loop

	 //import scanner object
	 Scanner scan = new Scanner(System.in);


	 do{

		//User prompt for menu choice
	    System.out.println("1) Calculate the sum of integers 1 to m.\n2) Calculate the factorial of given number.\n3) Find the first digit of a given number.\n4) Quit.\n\nPlease choose from above menu: ");
		choice= scan.nextInt();

			 //Switch based on choices
		     switch(choice)
			 {
			     case 1: int m, sum =0;
			     		 int i=0;

			             //Second user input
			     		 System.out.println("Enter the number: ");
			     		 m = scan.nextInt();
			     		 while (i <= m)
						 {
						     sum=sum+i;
						     i++;


						 } /*at the end of each iteration sum will have the value of sum till ith integer*/
						 System.out.println("\nThe sum of 1 to "+ m + " is " + sum + "\n");


			             break;

			     case 2: int n, fact =1; //ensure that initial value of fact is 1.

			     		 //Second user input
						 System.out.println("Enter the number: ");
			     		 n = scan.nextInt();

			     		for (int t = 1; t <= n; t++)
						{
						    fact = fact*t;

					    }
					    System.out.println("\nThe factorial of " + n + " is " + fact +" \n");


			             break;
			     case 3:
			     		int num, rem=0;

			     		System.out.println("Enter the number: ");
			     		num = scan.nextInt();

			     		while(num!=0)
						{
						    rem = num%10;
						    num = num/10;

						}
						System.out.println("The leftmost digit is " + rem + "\n");


			             break;
			     default:
			             break;
                 }//End Switch




        } while(choice!=4);//1st do loop






 }//end method
}//end class