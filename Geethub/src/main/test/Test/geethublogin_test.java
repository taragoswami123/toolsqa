package Test;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

import page.geethublogin_page;

public class geethublogin_test 
{
	geethublogin_page ob =new geethublogin_page();
	
	@Test(priority = 1,enabled = true)
	public void GetLaunchUrl()
	{
		ob.GetLaunchUrl();
	}
	
	@Test(priority = 2,enabled = true)
	public void clickonSign()
	{
		ob.clickonSign();
	}
	
}
