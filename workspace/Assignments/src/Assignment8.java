//**************************************************************************
// FILE: Assignment8.java
// Name: Colin Bruzas
// Student ID: 1212619562
// Description:
// Course: ASU CSE110 Principles of Programming with Java
//***************************************************************************

import java.io.*;
import java.io.File;
import java.io.PrintWriter;


public class Assignment8 {
	
	public static void main(String[]args)
	{
		
	//Variable Declaration
	double balance =0.0, totDep=0.0, totWithdrawal=0.0, totInterest=0.0;
	double tempDep, tempWithdrawal, tempInt =0.0, startBal, intRate;
	String tempStr;
	double avgBalance;
	
	
	try
    {
	// Object Creations
	// Input objects
	InputStreamReader ir = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(ir);
	
	//Output objects
	File outputFile = new File("result.txt");
	PrintWriter pr = new PrintWriter(outputFile);
	
	
	 //Initial system user prompt
	
	 System.out.print("Enter the starting balance on the account$:  ");
  		//read in the string first
        tempStr = br.readLine();
		//convert it into a double
		startBal= Double.parseDouble(tempStr);
		balance = startBal;
		
    System.out.print("Enter the annual interest rate on the account (e.g. .04): ");
  		tempStr = br.readLine();
  		intRate = (Double.parseDouble(tempStr)/12);
    
    	
  		
    		for(int i=1; i<4; i++)
    		{
    			//User prompt for deposit
    			System.out.print("\nMonth " + i);
    			System.out.print("\nTotal deposits for this month: $" );
    			tempStr = br.readLine();
    	  		tempDep = Double.parseDouble(tempStr);
    	  		
    	  		//User prompt for Withdrawal
    			System.out.print("Total withdrawals for this month: $");
    			tempStr = br.readLine();
    	  		tempWithdrawal = Double.parseDouble(tempStr);
    	  		while (tempWithdrawal > (balance+tempDep))
    	  		 {
    	  			System.out.print("Withdrawal is too large. Please enter another amount: $");
        			tempStr = br.readLine();
        	  		tempWithdrawal = Double.parseDouble(tempStr);
    	  		 }
		   		
		    	  	//Balance
		    	    avgBalance = ((balance+(balance+tempDep-tempWithdrawal))/2);
    	  		    tempInt= (avgBalance* intRate);
		    	  	balance = (balance+tempDep-tempWithdrawal);
		    	  	totInterest += tempInt;
		    	  	balance += tempInt;
		    	  	
    	  		 
	    	  		//Adding up totals
	    	  		totDep += tempDep;
	    	  		totWithdrawal +=tempWithdrawal;
    		}
    		
    		
    		//Output
    		pr.printf("%s", "Quarterly Savings Account Statement");
    		pr.println();
    		pr.println();
    		pr.printf("%20s %6.2f", "Starting balance:    $", startBal);
    		pr.println();
    		pr.printf("%20s %6.2f", "Total deposits:    + $", totDep);
    		pr.println();
    		pr.printf("%20s %6.2f", "Total withdrawals: - $", totWithdrawal);
    		pr.println();
    		pr.printf("%20s %7.2f", "Total interest:    + $", totInterest);
    		pr.println();
    		pr.printf("%15s", "                    ----------- ");
    		pr.println();
    		pr.printf("%s %.2f", "Ending balance:      $", balance);
    		
    pr.close();
    }
		catch (IOException ex)
		{
	   			System.out.println("Wrong! catched " + ex);
		}
}
}
