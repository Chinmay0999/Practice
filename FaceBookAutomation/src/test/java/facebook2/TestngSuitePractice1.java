package facebook2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngSuitePractice1 {
	
	@BeforeClass
	
	public void beforeClass()
	{
		System.out.println("beforeClass NEW");
	}
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforeMethod NEW");
	}
	
	@Test
	public void testNew1()
	{
		System.out.println("testNew1");
	}
	
	@Test
	public void testNew2()
	{
		System.out.println("testNew2");
	}
	
	@Test
	public void testNew3()
	{
		System.out.println("testNew3");
	}
	
	@Test
	public void testNew4()
	{
		System.out.println("testNew4");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("afterMethod NEW");
	}
	
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("afterClass");
	}

}
