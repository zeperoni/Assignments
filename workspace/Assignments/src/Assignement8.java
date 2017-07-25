
//**************************************************************************
// FILE: Assignment6.java
// Name: Colin Bruzas
// Student ID: 	1212619562
// Description:
// Course: ASU CSE110 Principles of Programming with Java
//***************************************************************************

import java.util.*;

public class Assignement8 {

	
	public static void main(String[]args)
	{
		//months Array set up
		String[] months = {"January", "February","March","April", "May","June", "July", "August","September", "October", "November", "December"};
		
		//Rain array set up
		int[] rain = new int[11];
		
		//Scanner object creation
		Scanner scan = new Scanner(System.in);
		
		
		//For loop prompting users for each array element
		for(int index=0; index<months.length; index++)
		{
			System.out.println("Enter "+ months[index] + " rainfall amount: ");
			rain[index]=scan.nextInt();
		}
		
		
	}

		public static double getTotal(double rainArray[])	
		{
			double totalRainFall=0.0;
			
			for(int index=0; index < rainArray.length; index++)
			{
			
				totalRainFall+=rainArray[index];
				
			}
			
			
			return totalRainFall;
	
		}
	
		public static double getAverage(double rainArray[])
		{
		
	
		}
	
		public static int getWettestMonth(double rainArray[])	
		{
		}
	
		
		public static int getDriestMonth(double rainArray[])
			{
				
			}
		
		public static String displayReport()
		{
		}

}
}//end class


