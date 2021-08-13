package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ApplicationUtility.ApplicationUtility;
import BaseLibrary.BaseLibrary;
import Propertyutility.Propertyutility;

public class setting_page extends BaseLibrary
{
	public setting_page() 
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@id=\"settings-tab\"]/span[1]")
	private WebElement setting;
	
	@FindBy(xpath = "//*[@id=\"options_bucket\"]/div[10]/ul/li[4]/details/summary")
	private WebElement deleterepo;
	
	@FindBy(xpath="//*[@id=\"options_bucket\"]/div[10]/ul/li[4]/details/details-dialog/div[3]/p[2]/strong")
	private WebElement username_Reponame;

	@FindBy(xpath = "//*[@id=\"options_bucket\"]/div[10]/ul/li[4]/details/details-dialog/div[3]/form/p/input")
	private WebElement deletetext;
	
	@FindBy(xpath = "//*[@id=\"options_bucket\"]/div[10]/ul/li[4]/details/details-dialog/div[3]/form/button/span[1]")
	private WebElement delbtn;
	
	public void clickonsetting()
	{
		try 
		{
			setting.click();
			
			Thread.sleep(2000);
			
		} 
		catch (Exception e) 
		{
			System.out.println("issue in clickonsetting method");
		}
	}
	public void clickondeleterepo()
	{
		try 
		{
			Thread.sleep(1000);
			ApplicationUtility.getscrollbyxpath(delbtn);
			deleterepo.click();
			
		} 
		catch (Exception e) 
		{
			System.out.println("issue in clickonsetting method");
		}
	}
	public void clickondeletetext()
	{
		try 
		{
			String user_repo_name= username_Reponame.getText();
//			Thread.sleep(1000);
			deletetext.sendKeys(user_repo_name);
			Thread.sleep(1000);
			delbtn.click();
			
			
		} 
		catch (Exception e) 
		{
			System.out.println("issue in clickonsetting method");
		}
	}
	

}
