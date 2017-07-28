package assign4;

import assign2.Money;

public class Change extends Money
{
	private int quarters = 0;
	private int dimes = 0;
	private int nickels= 0;
	private int pennies = 0;
	private int singles = 0;
	private int fives = 0;
	
	public Change(int dollarsIn, int centsIn)
	{ 
		super(dollarsIn, centsIn);
	}

	/**
	 * MakeChange() creates temporary dollars and cents
	 * Subtracts an amount of currency and increments currency
	 */
	public void makeChange()
	{
		int tempDollars = dollars;
		int tempCents = cents;
		
		while (tempDollars > 4)
		{
			tempDollars = tempDollars - 5;
			fives++;
		}
		
		while(tempDollars > 0)
		{
			tempDollars--;
			singles++;
		}
		
		while(tempCents > 24)
		{
			tempCents = tempCents -25;
			quarters++;
		}
		
		while(tempCents > 9)
		{
			tempCents = tempCents -10;
			dimes++;
		}
		
		while(tempCents > 4)
		{
			tempCents = tempCents -5;
			nickels++;
		}
		while(tempCents > 0)
		{
			tempCents = tempCents-1;
			pennies++;
		}
}
	
	/**
	 * Accessor Methods for all the Change variables
	 * @return
	 */
	public int getQuarters()
	{
		return quarters;
	}
	
	public int getDimes()
	{
		return dimes;
	}
	
	public int getNickels()
	{
		return nickels;
	}
	
	public int getPennies()
	{
		return pennies;
	}
	
	public int getSingles()
	{
		return singles;
	}
	
	public int getFives()
	{
		return fives;
	}
	
}
