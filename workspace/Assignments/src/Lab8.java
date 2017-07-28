/*-------------------------------------------------------------
// AUTHOR: Colin Bruzas
// ASU ID: 1212619562
// FILENAME: Lab8
// SPECIFICATION: Several array functions
// TIME SPENT: 30 minutes
//-----------------------------------------------------------*/

import java.util.*;
public class Lab8 

{
	public static void main(String[] args)
    {
   //For this lab, put all codes inside the body of main()

		// An integer for the array size. 
		int sizeArray;
		// A double for the current element. 
		double currentElem;
		// A double for the sum of elements. 
		double sumElem= 0;
		// A double for the largest element. 
		double largestElem;
		// An integer for the number of negative elements inside the array. 
		int negElem=0;
		
		//Scanner method
		Scanner scan = new Scanner(System.in);
		
		 //User input
		System.out.println("Enter size of the array: ");
		sizeArray=scan.nextInt();
		
		  //Array Creation
		  double [] array1 = new double[sizeArray];
		  
		    //1st for loop
		   for(int i = 0; i < array1.length; i++)
		   {
				    // Display the message: "\nEnter array element #" + i + ": "
				    // Note: i should change from 0 to 1, 2, ...., size-1.
				    System.out.println("Enter array element #" + i + ": ");
				    // Request the next element (double) from the user using 
				    // the Scanner object declared in Step 2. 
				    // Store this element at the ith position of the array. such as arr[i] = num; 
				    array1[i]=scan.nextDouble();
		   }// end first for loop
		   
		  
		  
		  
		 
		       for( int j=array1.length-1 ; j >-1; j--)
		      {
		       System.out.print(array1[j] + " ");
		       sumElem += array1[j];
		       }
			  
		   
		   
		    //3rd for Loop
		   largestElem = array1[0];
		   for(int k=0; k<array1.length;k++)
		   {
			// Inside the for loop, first check array element at index i < 0 or not
			    // if yes, increase the counter by 1
			    if (array1[k]<0)
			    	negElem++;
			    //next check array element at index i greater than the value inside variable 'largest' or not,
			    //if yes, update 'largest' to be myArray[i]
			    if(array1[k]>largestElem)
			    largestElem = array1[k];
			    }//End 3rd for loop
		   
		   
		   //Final Output
		    System.out.print("\n\nSum of the array elements is " + sumElem + "\n");
		    System.out.print("\n" + negElem + " array elements are negative.\n");
		    System.out.print("\nThe largest array element is " + largestElem + "\n");	
      }//end main method	
}//end class
