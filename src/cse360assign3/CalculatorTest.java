package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest
{

	@Test
	public void testCalculator()
	{
		Calculator calc = new Calculator();
		assertNotNull(calc);
	}

	@Test
	public void testGetTotal()
	{
		Calculator calc = new Calculator();
		assertEquals(0, calc.getTotal());
	}

	@Test
	public void testAdd()
	{
		Calculator calc = new Calculator();
		calc.add(5);
		assertEquals(5, calc.getTotal());
	}

	@Test
	public void testSubtract()
	{
		Calculator calc = new Calculator();
		calc.subtract(5);
		assertEquals(-5, calc.getTotal());
	}

	@Test
	public void testMultiply()
	{
		Calculator calc = new Calculator();
		calc.add(4);
		calc.multiply(5);
		assertEquals(20, calc.getTotal());
	}

	@Test
	public void testDivide()
	{
		Calculator calc = new Calculator();
		calc.add(15);
		calc.divide(3);
		assertEquals(5, calc.getTotal());
	}
	
	@Test
	public void testDivideByZero()
	{
		Calculator calc = new Calculator();
		calc.add(5);
		calc.divide(0);
		assertEquals(0, calc.getTotal());
	}

	@Test
	public void testGetHistory()
	{
		fail("Not yet implemented");
	}

}
