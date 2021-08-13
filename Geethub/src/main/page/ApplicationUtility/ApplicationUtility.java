package ApplicationUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseLibrary.BaseLibrary;

public class ApplicationUtility extends BaseLibrary
{
	public static void getscrollbyxpath(WebElement ele)
	{
		try 
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true)", ele);
			
		} 
		catch (Exception e) 
		{
			System.out.println("issue in getscrollbyxpath method"+e);
		}
	}
	
}
