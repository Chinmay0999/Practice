package util;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	public static void captureScreenshot(WebDriver driver  , String testID) throws IOException
	
	{    
		 File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File dest = new File("test-output\\Screenshot\\Errorpic"+testID+".jpeg");
		  
		  FileHandler.copy(source, dest);
	}
	
//	public static String getDataFromExcel ()
//	{
//		
//		return result ; 
//	}
	  
	 
	  
	
}
	
	
	
	  
	




