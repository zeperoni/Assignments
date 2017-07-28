
//**************************************************************************
// FILE: Assignment4.java
// Name: Colin Bruzas
// Student ID: 1212619562
// Description:Creating a flight method
// Course: ASU CSE110 Principles of Programming with Java
//***************************************************************************

import java.util.Scanner;
import java.text.DecimalFormat;

class Assignment4
{
   public static void main(String[] args)
   {
      Flight oneFlight;

      //call method getFlightInfo() to get info. for oneFlight
      oneFlight = getFlightInfo();

      //call displayMenu() method to show the menu to user
      displayMenu();

      Scanner scan = new Scanner(System.in);

      //Two DecimalFormat object used to format currency and percentage
      DecimalFormat fmt1 = new DecimalFormat("$0.00");
      DecimalFormat fmt2 = new DecimalFormat("0.00%");

      char choice;
      do {
         System.out.print("\nPlease enter a command: ");
         choice = (scan.next().toUpperCase()).charAt(0);

         if (choice != 'Q' )
         {
            switch (choice)
            {
               case 'D':
                  {	//change oneFlight's departure city
                     String newDeptCity, oldDeptCity;
                     System.out.print("\nEnter the new departure city: ");
                     newDeptCity = scan.next();

                     //call Flight class's accesscor to get its previous
                     //departure city before we change it, save it inside
                     //variable oldDeptCity
                     oldDeptCity = oneFlight.getdeptCity();


                     //call Flight class's relevant mutator to change
                     //oneFlight's departure city
                     oneFlight.setdeptCity(newDeptCity);

                     System.out.print("\nThe departure city has been changed"
                            				+ " from " + oldDeptCity + " to "
                            				+ newDeptCity +"\n");
                  }
                  break;

               case 'A':
                  { //change oneFlight's arrival city
                     String newArriCity, oldArriCity;
                     System.out.print("\nEnter the new arrival city: ");
                     newArriCity = scan.next();

                     //call Flight's relevant accessor to get its current arrival
                     //city and save it inside variable oldArriCity
                     oldArriCity = oneFlight.getarriCity();

                     //call Flight's relevant mutator to change its arrival
                     //city to the newArriCity
                     oneFlight.setarriCity(newArriCity);
                     System.out.print("\nThe arrival city has been changed"
                            				+ " from " + oldArriCity + " to "
                            				+ newArriCity + "\n");
                  }
                  break;
               case 'I':
                  { //increase the ticket price
                     double increaseRate;
                     System.out.print("\nEnter the increase rate (0.08): ");
                     increaseRate = scan.nextDouble();

                     //call Flight class's relevant method to raise the ticket price
                     oneFlight.raisePrice(increaseRate);

                     System.out.print("\nPrice was increased by " + fmt2.format(increaseRate)
                            				+ ", the new price is " + fmt1.format(oneFlight.getPrice()) +"\n");
                  }
                  break;
               case 'R':
                  { //reduce the ticket price
                     double decreaseRate;
                     System.out.print("\nEnter the decrease rate (0.05): ");
                     decreaseRate = scan2.nextDouble();

                     //call Flight class's relevant method to reduce the ticket price
                     oneFlight.decreasePrice(decreaseRate);

                     System.out.print("\nPrice was reduced by " + fmt2.format(decreaseRate)
                            				+ ", the new price is " + fmt1.format(oneFlight.getPrice()) +"\n");
                  }
                  break;
               case 'S':  //call toString() to show the flight's info. and print it on screen
                  toString();
                  break;
               case '?':  //display menu again
                  displayMenu();
                  break;
               default:
                  System.out.print("\nUnknown command\n");
                  break;
            } //end switch
         } //end if
      } while(choice != 'Q');
   } //end of main()

//***************************************************************
// getFlightInfo() method will allow user to enter a specific
// Flight's info. from keyboard, then create and return a Flight
// object accordingly

   public static Flight getFlightInfo()
   {
      Scanner scan2 = new Scanner(System.in);

      //Local variables used to store a Flight's number, departure
      //& arrival city, price info.
      int flightNo;
      String deptCity, arriCity;
      double price;

      System.out.print("\nWelcome to Amercian Airline");
      System.out.print("\n============================");
      System.out.print("\nEnter Flight Number: ");
      //get user's input and store it inside variable flightNo
      flightNo=scan2.nextInt();

      System.out.print("\nEnter Departure City: ");
      //get user's input and store it inside variable deptCity
      deptCity=scan2.next();

      System.out.print("\nEnter Arrival City: ");
      //get user's input and store it inside variable arriCity
      arriCity=scan2.next();

      System.out.print("\nEnter Initial Ticket Price: ");
      //get user's input and store it inside variable price
      price=scan2.nextDouble();

	  //create a Flight object by using above information
      Flight aFlight = flight(flightNo, deptCity, arriCity, price);

      return aFlight;
   }

//****************************************************
// DisplayMenu() method display the menu on screen

   public static void displayMenu()
   {
      System.out.print( "\nChoose an Action\n");
      System.out.print( "-------------------\n");
      System.out.print( "D Change Departure City\n");
      System.out.print( "A Change Arrival City\n");
      System.out.print( "I Increase the Price\n");
      System.out.print( "R Reduce the Price\n");
      System.out.print( "S Show Flight Info.\n");
      System.out.print( "? Display the Menu\n");
      System.out.print( "Q Exit Program\n\n");
   }

} //end of class

