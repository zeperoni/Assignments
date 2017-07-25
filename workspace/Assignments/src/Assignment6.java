
//**************************************************************************
// FILE: Assignment6.java
// Name: Colin Bruzas
// Student ID: 	1212619562
// Description:
// Course: ASU CSE110 Principles of Programming with Java
//***************************************************************************

import java.util.Scanner;
import java.text.DecimalFormat;

public class Assignment6 {

	
	public static void main(String[]args)
	{
		//months Array set up
		String[] months = {"January", "February","March","April", "May","June", "July", "August","September", "October", "November", "December"};
		
		//Rain array set up
		double[] rain = new double[12];
		
		//Scanner object creation
		Scanner scan = new Scanner(System.in);
		
		//Decimal format creation
		DecimalFormat fmt1 = new DecimalFormat("0.00");
		
		
		//For loop prompting users for each array element
		for(int index=0; index<months.length; index++)
			{
			System.out.println("Enter "+ months[index] + " rainfall amount: ");
			rain[index]=scan.nextDouble();
			}
		
		
				//Report
				System.out.println("=== 2016 Rain Report for Phoenix AZ === \nTotal rainfall: " + fmt1.format(getTotal(rain)) + " inches \nAverage monthly rainfall: " 
						+ fmt1.format(getAverage(rain)) + " inches"
						+ "\nThe least rain fell in " + months[getDriestMonth(rain)] + " with " + rain[getDriestMonth(rain)] +" inches. "
						+ "\nThe most rain fell in " + months[getWettestMonth(rain)] + " with " + rain[getWettestMonth(rain)] +" inches.");
				}//end main

	//Other Methods
	  //Total method
	  public static double getTotal(double rainArray[])	
		{
			double totalRainFall=0.0;
			
			for(int index=0; index < rainArray.length; index++)
			{
				totalRainFall+=rainArray[index];
			}
			return totalRainFall;
		}
	  	//Average method calculating avg of total rainfall
		public static double getAverage(double rainArray[])
		{
			double avg=0;
			
			for(int index=0; index<rainArray.length ; index++)
			{
				avg+=rainArray[index];
			}
			avg = avg/12;
			return avg;
		}
		//Accessor that finds the highest double
		public static int getWettestMonth(double rainArray[])	
		{
			int wettest = 0;
			for(int index=0; index<rainArray.length; index++)
			{
				if (rainArray[index] > rainArray[wettest])
						wettest = index;
			}
			return wettest;
		}   
	
		//Accessor that finds lowest double
		public static int getDriestMonth(double rainArray[])
			{
			int driest = 0;
			for(int index=0; index<rainArray.length; index++)
			{
				if (rainArray[index] < rainArray[driest])
						driest = index;
			}
					return driest;
			}
}
//end class


