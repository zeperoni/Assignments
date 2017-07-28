// Colin Bruzas
// Money class stores dollars and cents as integers 
// It's method can add, subtract, and compare to other Money objects
// Corrects over flows and negative inputs
package assign2;

public class Money {	
protected int dollars;
protected int cents;
	
	public Money(int dollarsIn, int centsIn)
	{
		dollars = dollarsIn;
		cents = centsIn;
		this.adjust();
	}
	
	// Overloaded Constructor
	public Money(Money other) 
	{
		dollars = other.dollars;
		cents = other.cents;
	}
	
	// Mutator Set
	// add takes input parameter and adds it into the money object
	public void add(Money moneyIn)
	{
		cents = cents + moneyIn.cents;
		dollars = dollars + moneyIn.dollars;
		this.adjust();
	}
	
	// Takes input parameter and subtracts it from the objects
	public void subtract(Money moneyIn)
	{
		dollars = dollars - moneyIn.dollars;
		cents = cents - moneyIn.cents;
		this.adjust();
	}
	
	// Adjusts for overflows (more than 99 cents) 
	// and resets negative amount to $0.00
	private void adjust()
	{
		while(cents>99)
			{
			cents = cents - 100;
			dollars++;
			}
		while(cents<0)
		{
			cents = cents + 100;
			dollars--;
			
			if(dollars < 0)
				{
				cents = 0;
				dollars = 0;
				}
		}
		if(dollars < 0)
			{
			dollars = 0;
			cents = 0;
			}
	}
	
	// Accessor Set
	// Compares money Objects
	public int compareTo(Money moneyIn)
	{
		int value= 0;
		if(dollars == moneyIn.dollars)
			value = cents - moneyIn.cents;
		else 
			value = dollars - moneyIn.dollars;
		
		return value;
	}
	
	// Class equals method
	public boolean equals(Money moneyIn)
	{
		boolean value = false;
		
		if(dollars == moneyIn.dollars && cents == moneyIn.cents)
				value = true;
		return value; 
	}
	
	// To String 
	public String toString()
	{	
		//DecimalFormat fmt1 = new DecimalFormat(".00");
		String result = " ";
		result = String.format("$%d.%02d", dollars, cents);
		return result;	
	}
}
