package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	
	/*
	 * Global Test Variables
	 */
	SimpleCalculator calc;
	
	@Before
	public void setUp()
	{
		calc=new SimpleCalculator();
	}
	
	@After
	public void tearDown()
	{
		calc=null;
	}
	
	
	@Test
	public void testAdd() {
		assertEquals(calc.add(1, 1), 2);
	}
	
	@Test
	public void testMinus()
	{
		assertEquals(calc.minus(5, 3), 2);
	}
	
	@Test
	public void testMultiply()
	{
		assertEquals(calc.multiply(5, 3), 15);
	}
	
	@Test
	public void testDivide()
	{
		assertEquals(calc.divide(15, 3), 5)
	}
	
}
