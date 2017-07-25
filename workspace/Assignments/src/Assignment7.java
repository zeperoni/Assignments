
	//**************************************************************************
	// FILE: Assignment7.java
	// Name: Colin Bruzas
	// Student ID: 	1212619562
	// Description: Driver program used to test and check BoatRideManager.java
	// Course: ASU CSE110 Principles of Programming with Java
	//***************************************************************************

	import java.util.Scanner;

	class Assignment7
	{
	   public static void main(String[] args)
	   {
	      Scanner console = new Scanner(System.in);

	      //Create a BoatRideManager object call 'LuluBoatRide'
	      BoatRideManager LuluBoatRide = new BoatRideManager();
	      String choice; 	// User's menu choice
	      int numSeats;		// Number of seats wanted
	      int row;			// Desired row
	      int startSeat;	// Desired starting seat number

	      //Used to check whether requested tickets available for sale or not
	      boolean  ticketRequestOK = true;

	      do
	      {
			  //call the relevant method to display the menu on screen
			  displayMenu();

	         // ask the user to choose a command
	         System.out.print("\nPlease enter a command: ");
	         choice = console.next().toUpperCase();
	         switch(choice)
	         {
	            case "D":
	            	//Display the seat map of LuluBoatRide
	            	LuluBoatRide.displaySeats();
	                break;
	            case "P":	//reserve tickets
	            	
	            	System.out.print("\nNumber of seats desired (1 - 6): ");
	                numSeats = console.nextInt();

	               //input validation loop. Need to make sure customer can
	               //order up to 6 seats only.i.e. numSeats must be in range [1,6]
	               while(numSeats <1 || numSeats >6)
	               {
	                   System.out.print("\nWrong, you can only book up to 6 seats");
		               System.out.print("\nRe-enter desired numbers of seats (1 - 6): ");
		               numSeats = console.nextInt();
	               }

	               System.out.print("\nDesired row (1-8): ");
	               row = console.nextInt();

	               //input validation loop. Need to make sure the row number
	               //must be within range [1, 8]
	               while(row<1 || row>8)
	               {
	            	   System.out.print("\nWrong, row number must between 1 to 8\nRe-enter desired row number (1 - 8): ");
		               row = console.nextInt();
	               }

	               System.out.print("\nDesired starting seat number in the row (1 - 6): ");
	               startSeat = console.nextInt();

	               //input validation loop
	               while(startSeat < 1 || startSeat >6)
	               {
	                  System.out.print("\nWrong, start seat number must between 1 to 6");
	                  System.out.print("\nRe-enter desired start seat number(1 - 6): ");
	                  startSeat = console.nextInt();
	               }

	               //With all above info. check the requested seats availability,
	               //save the result inside variable ticketRequestOK
	               ticketRequestOK = LuluBoatRide.checkAvailability(numSeats, row, startSeat);

	               if (ticketRequestOK)
	               {
	            	   //Asking if client wish to buy ticket
	                	  System.out.print("\nThe seats you have requested are available for purchase."
	      								+ "\nThe total purchase price will be: " + numSeats + " seats X $35.0 = $ " + (numSeats*35.0));
	                	  
	                  System.out.print("\n\nDo you wish to purchase these tickets (Yes/No)? ");
	                  if(console.next().toUpperCase().equals("YES"))
	                  {
	               
  		         		System.out.print("\nThe seats you have requested are available for purchase."
  		         						+ "\nThe total purchase price will be: " + numSeats +" seats X $35.0 = $" + (numSeats*35.0));
  		         		
  		         		System.out.print("\nPlease input amount paid: $");
  		         		int payment = console.nextInt();
	      		         			
  		         			if(payment >= (numSeats*35.0))
  		         			{
  		         				//call the relevant method in BoatRideManager to purchase these tickets
  		         				LuluBoatRide.purchaseTickets(numSeats, row, startSeat); 
  		         				
  		         				System.out.println("Tickets purchased : " + numSeats
  		         									+ "\nPayment\t\t  : $" + payment
  		         									+ "\nTotal ticket price: $" + (numSeats*35.0)
  		         									+ "\nChange due    \t  : $" + (payment-(numSeats*35.0)));
	      		         	}
  		         			else
  		         			{
  		         				System.out.print("\nInsufficient payment." 
  		         									+ "\nThe sale has been cancelled and your money is being returned.");
  		         			}
	      		         }
	               }
	               
	               
	               break;
	            case "S":
	               //call the relevant method in BoatRideManager to display a sales report
	            	LuluBoatRide.displaySalesReport();
	               break;
	            case "?":
	               displayMenu();
	               break;
	            case "Q":
	               break;
	            default:
	               System.out.print("\nInvalid input");
	         }// end switch
	      } while (!choice.equals("Q"));
	   }// end main

	   public static void displayMenu()
	   {
	      System.out.print("\n\nLulu Boat Ride Online Purchase System\n");
	      System.out.print("\n      Choose an Action\n"
	         	   + "------------------------------\n"
	         	   + "D: Display Seats Map\n"
	         	   + "P: Purchase Boat Ride Ticket\n"
	         	   + "S: Display Sales Report\n"
	           	   + "?: Display the menu again\n"
	         	   + "Q: Quit this program\n\n");
	   }//end display menu method
	}//end class
	
