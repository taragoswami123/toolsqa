package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLibrary.BaseLibrary;

public class newbtn_page extends BaseLibrary
{
	public newbtn_page() 
	{
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "(//*[@id=\"repos-container\"]/h2/a)[1]")
	private WebElement newbtn;
	
	public void clickonnewbtn()
	{
		try 
		{
			Thread.sleep(1000);
			newbtn.click();
			
		} 
		catch (Exception e) 
		{
			System.out.println("issue in clickonbtn"+e);
		}
	}

}
