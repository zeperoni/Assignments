//**************************************************************************
// FILE: Assignment3.java
// Name: Colin Bruzas
// Student ID: 1212619562
// Description: Assignment 3 swtich and control flows
// Course: ASU CSE110 Principles of Programming with Java
//***************************************************************************

import java.util.Scanner;


class Assignment3
{
public static void main(String[] args)
{

	//Variable Declaration
	int choice;


	//initialize Scanner object
	Scanner scan = new Scanner(System.in);


	do{

	//User Prompt
	System.out.println("1) Generate a multiplication tabel \n2) Display a triangle shape \n3) Predict organism's population \n4) Quit.\n");
	choice= scan.nextInt();

		 //input validation
         if(choice<=0 || choice>=5)
         System.out.println("Please enter a valid number [1,4].\n\n");

         else

	       switch(choice)// Switch based on user choice
	       {
	          case 1: // multiplication table
	                 //variable declaration

	                 int numChoice, tableChoice;



	           		   //User prompt for number and table size
	                   System.out.println("\nPlease enter a number and the tableSize: ");
	                   numChoice=scan.nextInt();
	                   tableChoice=scan.nextInt();
	                   System.out.println(tableChoice);




	                      //input validation
	                      while (numChoice<=0 || tableChoice<=0)
	                      {System.out.println("Error, number and tableSize must be positive.");
	                      System.out.println("Please enter a number and the tableSize: ");
					   	  numChoice=scan.nextInt();
	                      tableChoice=scan.nextInt();
					      }



					       // multiplacation table
					      for(int i=1; i<=tableChoice; i++)
					      {System.out.println(i + " * " + numChoice + " = " + (i*numChoice) + "\n");

					       }

	                break;
	          case 2:// Star pattern

	          		//Declaration Of Variables
	          		int rowChoice;


	          			//User Input
	          			System.out.println("\nPlease enter a number of rows: ");
	                    rowChoice=scan.nextInt();


	                    //Input Validation Positive
					   	while (rowChoice<=0)
					   {System.out.println("Error, number of rows must be positive");
					    System.out.println("\nPlease enter a number of rows: ");
					   	rowChoice=scan.nextInt();
					    }

 					    //Input Validation For Odd Number
						while (rowChoice % 2 ==0)
					   {System.out.println("Error, number of rows must be odd");
					    System.out.println("\nPlease enter a number of rows: ");
					   	rowChoice=scan.nextInt();
					    }

                        //Triangle Pattern Demonstration
                        //Going up in stars
						for(int row=1;row<=rowChoice;row++)
					     {
					          //columns of stars
					          for(int star=1; star<=row; star++)
					            {
							     System.out.print("* ");
							     }
						   System.out.println();
						  }//end first for

						//Triangle Pattern Demonstration
                        //Going down in stars
						for(int row=rowChoice; row>=1; row--)
					     {
					          //columns of stars
					          for(int star=(row-1); star>=1; star--)
					            {
							     System.out.print("* ");
							     }
						   System.out.println();
						  }//end 2nd for

	                break;
	          case 3: //Organism multiplication

	          		//Declaration Of Variables
	          		int orgChoice, dayChoice;
	          		double rateChoice, amountInc;


	          			//User Input
	          			System.out.println("\nEnter the starting number of organisms (2 or more): ");
	                    orgChoice=scan.nextInt();

	                    //input validation for number of organisms
				  		while (orgChoice<=1)
				  		{System.out.println("Error, starting number must be at least 2. Please re-enter: ");
				  		orgChoice=scan.nextInt();
					    }

					         //User Input for Increase Rate
	                         System.out.println("\nEnter the daily population increase rate as a percentage(e.g 3.5) : ");
			  	             rateChoice=scan.nextDouble();

			  	             //input validation for Increase Rate
			  				 while (rateChoice<=0)
			  				 {System.out.println("Error, increase rate must be positive. Please re-enter: ");
			  				  rateChoice=scan.nextDouble();
					          }

							  //convert to percentage
					          rateChoice= rateChoice*.01;


					              //User Input for Days multiplied
	                              System.out.println("\nEnter the number of days the organisms will be left to multiply: ");
	                              dayChoice=scan.nextInt();




	                 // Multiplication operations
	                 System.out.println("\n\n");
	                 for(int i=1; i<=dayChoice;i++)
	                 {

						 amountInc= rateChoice * orgChoice;

					     //casting to int
						 int incInt = (int)amountInc;
						 System.out.println(incInt);

						 orgChoice=incInt+orgChoice;

						 System.out.println("Population after day "+ i +": " + orgChoice);
					 }
					 System.out.println();

	                break;
	          case 4: break;
	       }// end switch

      }while (choice !=4); //End 2st do loop

 }//end method
}//end class