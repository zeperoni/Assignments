
public class BoatRideManager 
{
	
	//Constants
	final int NUM_ROWS = 8;
	final int ROW_SIZE = 6;
	final double SEAT_PRICE = 35.0;
	
	//Non-final variable
	private String[][] seatArray = new String[NUM_ROWS][ROW_SIZE];
	private int seatsSold;
	private double totalRevenue;
	
		//Constructor
		public BoatRideManager()
		{
			seatsSold = 0;
			totalRevenue = 0.0;
			for(int i=0; i < seatArray.length; i++)
			{
				for(int j=0; j < seatArray[i].length; j++)
				{
					seatArray[i][j] = "O ";
				}//end inner for loop
			}//end outer for loop
		}// end constructor

		
			public void displaySeats()
			{
				System.out.print("\n\tSeats\n " + "     1 2 3 4 5 6");
				
				for(int i=0; i < seatArray.length; i++)
				{
					System.out.print("\nRow " + (i+1) + " ");
				
					for(int j=0; j < seatArray[i].length; j++)
					{
						System.out.print(seatArray[i][j]);
					}//end inner for loop
				}//end outer for loop
				System.out.println("\n\nLegend: # = Sold\n\tO = Available");
				
			}
			
			public boolean checkAvailability(int numSeatsRequested, int requestedRow, int startSeat)
			{
				boolean check = true;
				
				if((numSeatsRequested + startSeat - 1) > 6)
				{check=false;
         	     System.out.print("\nOne or more of the seats you have requested do not exist, re-book please.\n");

				return check;
				}
				
				
				for(int i = 0; i<numSeatsRequested;i++)
				{
					
					if (seatArray[requestedRow-1][startSeat-1 + i].equals("# "))	
					{
						check = false;
						System.out.print("\nOne or more of the seats you have requested are already sold.");
						return check;
					}
					
					
					if (seatArray[requestedRow-1][startSeat-1 + i].equals("O "))	
					{
						
					}
						
						 else 
							 {
							  
							  check = false;
							 }
					}    
					
				if (check == false)
				System.out.print("\nOne or more of the seats you have requested do not exist, re-book please.\n");

				return check;
			}
			
			public void purchaseTickets(int numSeats, int requestedRow, int startSeat)		
			{
				
				//Marking Seats as sold
				for(int i = 0; i < numSeats;i++)
				{
					seatArray[requestedRow-1][startSeat-1+i] = "# ";
				}
					
				
					//Call print tickets
					int lastSeat = numSeats+startSeat;
					printTickets(requestedRow, startSeat, lastSeat);
					
						//update seatsSold
						seatsSold +=numSeats;
						
						//update Total Revenue
						totalRevenue += (numSeats*SEAT_PRICE);
					
			}
			
			public void printTickets(int rowNum, int firstSeatNum, int lastSeatNum)		
			{
				
				System.out.print("\n******************************\nLuLu Lobster Boat Ride \n");
			
					for(int i = (firstSeatNum); i<(lastSeatNum); i++)
					{
						System.out.print("\nRow " + rowNum + " ~ " + "seat " + (i));
					}    
				System.out.print("\n******************************\n\n");
				
				
				
			}
			public void displaySalesReport()	
			{
				int seatsAvailable = 48-seatsSold;
				System.out.println("Lulu Lobster Boat Ride Sales Report\n===================================\nSeats sold: \t\t " 
				                   + seatsSold + "\nSeats available: \t " + seatsAvailable  
				                   +"\nTotal revenue to date: $ " + totalRevenue + "\n");
				
			}
		
}
