/*-------------------------------------------------------------
// AUTHOR: Colin Bruzas
// ASU ID: 	1212619562
// FILENAME: title of the source file
// SPECIFICATION: Use 2d arrays
// TIME SPENT: 
//-----------------------------------------------------------*/

import java.util.Scanner;
import java.text.DecimalFormat;
 
public class Lab9
{ 
    public static void main(String[] args)
    {
        //declare necessary constants and variables here
    	//counters for "for - loops"
    	double monk1Tot = 0.0;
    	double monk2Tot = 0.0;
    	double monk3Tot = 0.0;
    	
    	double mondTotal= 0.0;
    	double mondAvg = 0.0;
    	
    	double satTotal = 0.0;
    	double satAvg = 0.0;
    	
        
    	Scanner scan=new Scanner(System.in);
    	DecimalFormat fmt1 = new DecimalFormat("0.00");

        //Create a 2D array to hold the pounds of food consumed
        //by each monkey on each day of the week
    	double[][]  food = new double[3][7];


        //Use nested for loop to get data and fill in the 2D array
    	for (int row=1; row <= food.length; row++) 
    	{
    	    System.out.print("\nEnter pounds of food eaten by monkey #" + row + " on \n");
    	    for (int day=1; day <= food[row-1].length; day++)
    	        {
    	        System.out.print( "day " + day + ": \n");
    	        //use Scanner object to get user input and store it inside 2D array 'food'
    	        food[row-1][day-1] = scan.nextDouble();
    	        }//end inner for loop
    	}//end outer for loop  

        	//call the findGroupTotal() method and compute 
    		//the average amount of food the 3 monkeys ate per day
    		System.out.println("\n\nAverage amount of food eaten per day by the entire family of monkeys " + fmt1.format(findGroupTotal(food)) + " pounds.\n\n");

	    		//call the findLeastAmtFood() method and compute 
	    		//the least amount of food eaten all week by any one monkey
    			System.out.println("Least amount of food eaten all week by any monkeys is: "+ fmt1.format(findLeastAmtFood(food)) + " pounds.\n");
	    	 	

         //Find Monkey #1 total consumption of food during the week
        for(int monk1=0; monk1 <food[0].length;monk1++)
        {
        	monk1Tot+= food[0][monk1];
        }
        	System.out.println("Monkey #1 eat total of "+ fmt1.format(monk1Tot) + " pounds of food in this week.\n");

        
        //Find Monkey #2 total consumption of food during the week
        	 //Find Monkey #1 total consumption of food during the week
            for(int monk2=0; monk2 <food[1].length;monk2++)
            {
            	monk2Tot+= food[1][monk2];
            }
            	System.out.println("Monkey #2 eat total of "+ fmt1.format(monk2Tot) + " pounds of food in this week.\n");

        //Find Monkey #3 total consumption of food during the week
            	for(int monk3=0; monk3 <food[2].length;monk3++)
                {
                	monk3Tot+= food[2][monk3];
                }
                	System.out.println("Monkey #3 eat total of "+ fmt1.format(monk3Tot) + " pounds of food in this week.\n");

        //Find the average of food the 3 monkeys eat on Monday
                	
                	for(int mon = 0; mon < food.length; mon++)
                	{
                		mondTotal+=food[mon][0];
                	}
                	mondAvg = mondTotal / 3;
                	
                	System.out.println("The 3 monkeys eat an average " + fmt1.format(mondAvg) +" pounds of food on Monday.");
                	

        //Find the average of food the 3 monkeys eat on Saturday
                	for(int Sat = 0; Sat < food.length; Sat++)
                	{
                		satTotal+=food[Sat][5];
                	}
                	satAvg = satTotal / 3;
                	
                	System.out.println("The 3 monkeys eat an average " + fmt1.format(satAvg) +" pounds of food on Saturday.");

    } //end main()

		    //This method takes a 2D array as input parameter and returns
		    //the sum of all elements inside
		    public static double findGroupTotal(double[][] a2DArray)
		    { 
		    	double totalDays =7.0;
		    	double totalFood=0;
		    	double total=0;
		        for(int row=0; row<a2DArray.length ; row++)
		        {
		        	for(int col=0; col < a2DArray[row].length ; col++)
		        		{;
		        		totalFood+= a2DArray[row][col]; 
		        		}
		        }
		        total= totalFood / totalDays;
		        return total;
		    }

				//This method takes a 2D array as input parameter and returns
				//the smallest element inside
				public static double findLeastAmtFood(double[][] a2DArray)
				{
					double lowest = 10.0;
				    for(int row = 0; row < a2DArray.length; row++)
					    {for(int col = 0; col < a2DArray[row].length; col++)
					    	{
					    		if(a2DArray[row][col] < lowest)
					    		lowest = a2DArray[row][col];
					    	}
					    }	
				    //return least smallest double
				    return lowest;
				} 

} //end of class
