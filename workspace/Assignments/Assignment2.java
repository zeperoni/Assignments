//**************************************************************************
// FILE: Assignment2.java
// Name: Colin Bruzas
// Student ID: your-ASU-10-digits-ID
// Description: Gas selection by user
// Course: ASU CSE110 Principles of Programming with Java
//***************************************************************************

import java.util.Scanner;
import java.text.DecimalFormat;

public class Assignment2
{
public static void main(String[] args)
 {

	 //Declaring Variables
	 int userGas;
	 double userSec, finalSpd;
	 final double C2BSPD = 258.17, AIRSPD=331.53, HESPD=972.20, HSPD=1270.21;



	 //Creating Scanner object
	 Scanner scan= new Scanner(System.in);
	 DecimalFormat fmt=new DecimalFormat("0.00");


	   //Prompting user for input
	   System.out.println("This program will tell you how far a sound wave traveled in a specified number of seconds through a particular gas.\n\nSelect which gas the sound wave traveled through.\n\n1. Carbon Dioxide\n2. Air\n3. Helium\n4. Hydrogen");
	   userGas = scan.nextInt();

	    //User input validation
	    if(userGas>=1 && userGas<=4)
	    {
			System.out.println("Enter the number of seconds the sound wave traveled (0-30):");
			userSec = scan.nextDouble();

		 	//User input validation number 2
		   	if(userSec>=0 && userSec<=30)
			{
				switch(userGas)
				{
					case 1:
					       //Speed within Carbon Dioxide and response
					       finalSpd=C2BSPD*userSec;
					       System.out.println("\nIn "+ userSec+" seconds the sound wave went " + fmt.format(finalSpd) + " meters through carbon dioxide");
					       break;

				    case 2:
						   //Speed within Air and response
						   finalSpd=AIRSPD*userSec;
						   System.out.println("\nIn "+ userSec+" seconds the sound wave went " + fmt.format(finalSpd) + " meters through air");
					       break;

					 case 3:
			               //Speed within Helium and response
						   finalSpd=HESPD*userSec;
						   System.out.println("\nIn "+ userSec+" seconds the sound wave went " + fmt.format(finalSpd) + " meters through helium");
					       break;

					 case 4:
					 	   //Speed within Hydrogen and response
					 	   finalSpd=HSPD*userSec;
					 	   System.out.println("\nIn "+ userSec+" seconds the sound wave went " + fmt.format(finalSpd) + " meters through hydrogen");
					       break;








				}//end switch










			}//end 2nd if

			else
			{System.out.println("Travel time must be 0 ~ 30 seconds.");
		    }//end 2nd else








		}//end 1st if

		else
		  {System.out.println("You may only enter 1, 2, 3, or 4 for the gas.");
	      } //end 1st else







 }//end method
}//end class