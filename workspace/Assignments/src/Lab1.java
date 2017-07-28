

/*-------------------------------------------------------------
// AUTHOR: Colin Bruzas
// FILENAME: Lab1
// SPECIFICATION: Finding an Average.
// FOR: CSE 110 Lab #1
// TIME SPENT: 1 hour
//-----------------------------------------------------------*/

import java.util.Scanner;

public class Lab1
{
   public static void main (String[] args)
   {

   //New Scanner set up
    Scanner scan= new Scanner(System.in);

   //Variable Declaration
     int test1, test2, test3;
     double average;
     final int NUM_TESTS =3;


   //Asking user for input. Assigning the first variable.
    System.out.println("Enter the score of the first test");
    test1 =scan.nextInt();


       //Asking user for input. Assigning the second test variable.
	   System.out.println("Enter the score of the second test");
       test2 =scan.nextInt();


           //Asking user for input. Assigning the third test variable.
	       System.out.println("Enter the score of the third test");
           test3 =scan.nextInt();


             // Equation to run averages
             average = (test1 + test2 + test3) / NUM_TESTS;


                //System Ouput using final average
                System.out.println("Your average test score is " + average);

 }
}