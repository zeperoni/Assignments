/*-------------------------------------------------------------
// AUTHOR: Colin Bruzas
// ASU ID:
// FILENAME: Lab4
// SPECIFICATION: description of the program
// TIME SPENT: how long it took you to complete the lab
//-----------------------------------------------------------*/

// All "import" lines must be before class
import java.util.Scanner;

// class name should match the file name
public class Lab4
{
    // we must have a main method to run the program
    public static void main(String[] args)
        {
        // declaring variables:
        double finalexamGrade = 50.0;
        double midtermGrade = 50.0;
        double homeworkGrade;
        double finalGrade;

        // a character called letterGrade
        char letterGrade;

        // create a Scanner object
        Scanner scan = new Scanner(System.in);


         // User prompt for student's homework grade (i.e. print a message on screen)
         System.out.println("Please enter your homework grade");

         // Use the Scanner object created above to get user's input and store it in 'homeworkGrade'
         homeworkGrade = scan.nextInt();

            if(homeworkGrade>=0 && homeworkGrade<=100)
			{
			    //write the formula to calculate the final grade and store the result in the finalGrade variable
			     finalGrade= ((finalexamGrade*0.50)+(midtermGrade*0.25)+(homeworkGrade*0.25));


			       // New If Statement
			       if(finalGrade >= 60)
			             {
					 	 letterGrade='P';
					     }
			       else
			             {
						  letterGrade='F';
						 }

			             switch(letterGrade)
			             {  //start switch
						     case 'P':
						             // Tell user that student have passed - look at sample output
						             System.out.println("Student Passed the class");
						             break;
						     case 'F':
						             // Tell user that student have failed - look at sample output
						             System.out.println("Student Failed the class");
						             break;
					      }//end switch



			}
			else
			{//Use System.out. println to explain what happened to the user. Make sure your output looks similar to sample output below
 			System.out.println("Invalid input. Homework Grade should be between 0 and 100");
             }// end of else statement

       }// end of main() method
}// end of class