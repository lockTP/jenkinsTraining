package cn.gov.nsccsz;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	public static Calculator calculator;
	
	@BeforeClass
	public static void setUp(){
		calculator = new Calculator();
	}
	
	@Test
	public void testAdd() {
		long ret = calculator.add(3, 4);
		assertEquals(7, ret);
	}
	
	@Test
	public void testMinus(){
		long ret = calculator.minus(12, 3);
		assertEquals(9, ret);
	}
	
	@Test
	public void testMultiply(){
		long ret = calculator.multiply(3, 4);
		assertEquals(12, ret);
	}
	
	@Test
	public void testDivide(){
		long ret = 0;
		try {
			ret = calculator.divide(12, 0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(4, ret);
	}

}
