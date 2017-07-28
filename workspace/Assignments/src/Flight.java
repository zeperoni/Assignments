
//Class Flight.java
//Contains flight details which inclides flightnumber, depart and arrival cities, and price


import java.text.DecimalFormat;
class Flight
{
	private int flightNum;
	private String deptCity;
	private String arriCity;
	private double price;

	//constructor for Flight
	public Flight (int newflightNum, String newdepCity, String arriCity, double newPrice)
 {
	flightNum=newflightNum;
	deptCity=newdepCity;
	arriCity=arriCity;
	price=newPrice;
  }//end constructor

	  //accessors below for all instance variables
	  public int getflightNum()
	  {
		  return flightNum;
	  }

	  public String getdeptCity()
	  {
		  return deptCity;
	  }

	  public String getarriCity()
	  {
		  return arriCity;
	  }

	  public double getprice()
	  {
		  return price;
	  }

	    //Mutator Sets
	    public void setflightNum(int newflightNum)
	    {
			flightNum = newflightNum;
		}

		public void setdeptCity(String newdeptCity)
		{
			deptCity= newdeptCity;
		}

		public void setarriCity(String newarriCity)
		{
			arriCity=newarriCity;
		}

			//Price Adjustment Methods
			public void raisePrice(double rate)
			{
				double raiseAmt = price * rate;
				price = price + raiseAmt;
			}


			public void reducePrice(double rate)
			{
				double lowerAmt = price * rate;
				price = price - lowerAmt;

			}




				//toString Method
				public String toString()
				{
					DecimalFormat fmt1 = new DecimalFormat("$0.00");
					String result = "";
					result="\nFlight Number:\t" + flightNum
							+ "\nDeparture:\t" + deptCity
							+ "\nArrival:\t\t" + arriCity
							+ "\nPrice:\t\t" + fmt1.format(price) +\n\n;

					return result;
				}





}//end flight class
