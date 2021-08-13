package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import ApplicationUtility.ApplicationUtility;
import BaseLibrary.BaseLibrary;
import Propertyutility.Propertyutility;

public class repository_page extends BaseLibrary
{
	public repository_page() 
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@id=\"repository_name\"]")
	private WebElement repository;
	
	@FindBy(xpath = "//*[@id=\"new_repository\"]/div[4]/button")
	private WebElement createrepository;
	
	@FindBy(xpath = "//*[@id=\"issues-tab\"]/span[1]")
	private WebElement issue;
	
	
	public void fillrepository_vrfy()
	{
		//SoftAssert assrt=new SoftAssert();
		try 
		{
			String rep = Propertyutility.getpropertypage("repo");
			repository.sendKeys(rep);
		} 
		catch (Exception e) 
		{
			System.out.println("issue in fillrepository method");
		}
		
		
	}
	
	public void clickoncreaterepo()
	{
		try 
		{
			ApplicationUtility.getscrollbyxpath(createrepository);
			Thread.sleep(2000);
			createrepository.click();
			
			
			
		} 
		catch (Exception e)
		{
			System.out.println("issue in clickoncreaterepo method"+e);
		}
	}
	public void clickonissue()
	{
		try 
		{
			issue.click();
			
		} 
		catch (Exception e) 
		{
			System.out.println("issue in clickonissue method"+e);
			
		}
	}

}
