/*-------------------------------------------------------------
// AUTHOR: Colin Bruzas
// ASU ID: 1212619562
// FILENAME: Lab3
// SPECIFICATION:Create random numbers and calculate the Volume and Surface Area.
// TIME SPENT:30 minutes
//-----------------------------------------------------------*/

//Imports
import java.text.DecimalFormat;
import java.util.Random;

//Class Name
public class Lab3

{  public static void main(String[] args)
 {


	 //Declaration of Variables
	 int  radius, height;
	 double  Volume, areaSurface;

	     //Creating Random Object
	     Random rand = new Random();

	       //Assigning Random to the variables
	       radius = rand.nextInt(10) +1;
	       height = rand.nextInt(10)+1;

	         //Decimal Formatting
	         DecimalFormat fmt1 = new DecimalFormat("0.000");

	           //Computing the Volume
	           Volume = (Math.pow(radius, 2)* Math.PI *height);     //is equivalent to y = xz

	             //Computing the Surface area
	             areaSurface = (2 * Math.PI * radius *height );


	               //Output results
	               System.out.println("Radius:\t\t" +radius +"\nHeight:\t\t" + height + "\nVolume:\t\t" + fmt1.format(Volume) + "\nSurface Area:\t" + fmt1.format(areaSurface));







 }
}