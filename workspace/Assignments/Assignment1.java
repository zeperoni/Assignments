//**************************************************************************
// FILE: Assignment1.java
// Name: Colin Bruzas
// Student ID: 1212619562
// Description:
// Course: ASU CSE110 Principles of Programming with Java
//***************************************************************************

// Import tools: Scanner and DecimalFormat
import java.util.Scanner;
import java.text.DecimalFormat;

//Name of Class
public class Assignment1

{ public static void main(String []args)
 {

	 //Variable Declaration
	 String movieName=" ";
	 int numAdlt, numChld;
	 double grossBox, payDistr, netOffice;
	 final double ticketAdlt = 9.50, ticketChld = 6.50;


	 //Scanner Creation
	 Scanner scan = new Scanner(System.in);

	 //Decimal Format set up for calculations
	 DecimalFormat fmt1 = new DecimalFormat("$ 0.00");

	     //User input for the movie name
	     System.out.println("Name of the movie: ");
	     movieName= scan.nextLine();

	     //User input for the number of adult tickets
	     System.out.println("Number of adult tickets sold: ");
	     numAdlt= scan.nextInt();

	 	 //User input for the number of adult tickets
	 	 System.out.println("Number of adult tickets sold: ");
	     numChld= scan.nextInt();


	         //Calculating Gross Box Office Profits
	         grossBox= (ticketAdlt*numAdlt)+(ticketChld*numChld);

	         //Calculating Amount Paid to the distributor
	         payDistr = grossBox*.8;

	         //Calculating Net Box Office Profits
	         netOffice = grossBox * .2;



 //Final Revenue Report
 System.out.println("Revenue Report\n\n" + "Movie Name:\t\t\t" + movieName + "\nAdult Tickets Sold:\t\t" + numAdlt +"\nChild Tickets Sold:\t\t"  +numChld + "\nGross Box Office Profit \t" + fmt1.format(grossBox) +"\nAmount Paid to Distributor: \t" + fmt1.format(payDistr) + "\nNet Box Office Profit: \t\t" + fmt1.format(netOffice));



 }
}

