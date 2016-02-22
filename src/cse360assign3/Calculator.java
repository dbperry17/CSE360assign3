package cse360assign3;

import static org.junit.Assert.assertEquals;

/**
 * Creates a calculator that allows for adding, subtracting, multiplying, and dividing.
 *  
 * @author	Denise Perry
 * @version	02/17/2016
 */

public class Calculator
{
	private int total;
	private String history = "0";
	
	
	/**
	 * Creates a calculator object
	 */
	public Calculator ()
	{
		total = 0;  // not needed - included for clarity
	}

	
	/**
	 * getTotal - gets the total 
	 * 
	 * @return The total (NOTE TO SELF: edit this as well)
	 */
	public int getTotal ()
	{
		return total;
	}
	
	
	/**
	 * add - adds an integer to the current total 
	 * 
	 * @param value	The term to be added
	 */
	public void add (int value)
	{
		total += value;
		history += " + " + value;
	}
	
	
	/**
	 * subtract - subtracts an integer from the current total
	 * 
	 * @param value	The term to be subtracted from the total
	 */
	public void subtract (int value)
	{
		total -= value;
		history += " - " + value;
	}
	
	
	/**
	 * multiply - multiplies an integer with the current total
	 * 
	 * @param value	The number to be multiplied with the total
	 */
	public void multiply (int value)
	{
		total *= value;
		history += " * " + value;
	}
	
	
	/**
	 * divide - divides the total by an integer. If a zero is passed in,
	 * 			the total is reset to 0. 
	 * 
	 * @param value	The divisor
	 */
	public void divide (int value)
	{
		if(value == 0)
			total = 0;
		else
			total /= value;
		history += " / " + value;
	}
	
	
	/**
	 * getHistory - Shows prior operations done by the user
	 * 
	 * @return	A string showing operations done by the user
	 */
	public String getHistory ()
	{
		return history;
	}
}