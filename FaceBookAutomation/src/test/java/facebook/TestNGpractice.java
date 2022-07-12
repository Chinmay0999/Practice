package facebook;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGpractice {
	
	@BeforeSuite 
	public void beforeSuite()
	{
		System.out.println("print beforeSuite");
	}
	
	
	@BeforeTest 
	public void beforeTest()
	{
		System.out.println("print beforeTest");
	}
	
	@BeforeClass 
	public void beforeclass()
	{
		System.out.println("print beforeclass");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("print beforemethod");
		
		
	}
	
	
	
	
	@Test 
	
	public void testA() throws InterruptedException
	{
		System.out.println("A");
		
	}
		
	
    @Test
	
	public void testB()
	{
    	System.out.println("B");
		
	}
    
    
      @Test 

public void testC()
{
	System.out.println("C");
}
     
     
     
     

     @Test

public void testD()
{
	System.out.println("D");
}
     
     
     
     

@AfterMethod

public void aftermethod()
{
	System.out.println("aftermethod");
}




@AfterClass

public void afterclass()
{
	System.out.println("afterclass");
}

@AfterTest 
public void afterTest()
{
	System.out.println("print afterTest");
}

@AfterSuite 
public void afterSuite()
{
	System.out.println("print afterSuite");
}

}
