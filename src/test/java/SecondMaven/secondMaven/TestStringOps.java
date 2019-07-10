package SecondMaven.secondMaven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestStringOps {
	
	@Test
	public void TestConcat(){
		StringOperation so = new StringOperation();
		String expected = "Joshua Ostroff";
		String actual = so.concats("Joshua ", "Ostroff");
		System.out.println(actual + ", " + expected);
		assertEquals(expected, actual);
	}
	@Test
	public void TestContains(){
		StringOperation so = new StringOperation();
		boolean expected = true;
		boolean actual = so.contains("Joshua", "oshu");
		assertEquals(expected, actual);
	}
	@Test
	public void TestLength(){
		StringOperation so = new StringOperation();
		String str = "Joshua";
		int expected = 6;
		int actual = so.length(str);
		assertEquals(expected, actual);
	}
	
}
