package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;
import org.testng.asserts.SoftAssert;

import BaseLibrary.BaseLibrary;
import Propertyutility.Propertyutility;

public class newissue_page extends BaseLibrary
{
	public newissue_page() 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"repo-content-pjax-container\"]/div/div[2]/div[2]/a/span[1]")
	private WebElement newissuebtn;
	
	@FindBy(xpath = "//*[@id=\"issue_title\"]")
	private WebElement title;
	
	@FindBy(xpath = "//*[@id=\"issue_body\"]")
	private WebElement issuebodybox;
	
	@FindBy(xpath = "//*[@id=\"issue_body\"]")
	private WebElement comment1box;
	
	@FindBy(xpath="//*[@id=\"new_issue\"]/div/div/div[1]/div/div[1]/div/div[2]/button")
	private WebElement submit_btn;
	
	public void clickonnewissuebtn()
	{
		try
		{
			Thread.sleep(1000);
			newissuebtn.click();
		}
		catch (Exception e)
		{
			System.out.println("issue in clickonissuebtn method");
		}
	}
	public void filltitlebox()
	{
		try
		{
			Thread.sleep(1000);
			String titlemsg = Propertyutility.getpropertypage("title");
			title.sendKeys(titlemsg);
		}
		catch (Exception e)
		{
			System.out.println("issue in filltitlebox method"+e);
		}
	}
	public void fillissuebox()
	{
		try
		{
			Thread.sleep(1000);
			String issueemsg = Propertyutility.getpropertypage("issue");
			issuebodybox.sendKeys(issueemsg);
			System.out.println(issueemsg);
		}
		catch (Exception e)
		{
			System.out.println("issue in fillissuebox method"+e);
		}
	}
	public void filltitlebox_vrfy()
	{
		SoftAssert soft=new SoftAssert();
		try
		{
			String actual = Propertyutility.getpropertypage("title");
			String expected=title.getText();
			soft.assertEquals(actual, expected);
			System.out.println(expected);
			soft.assertAll();
			
		}
		catch (Exception e)
		{
			System.out.println("issue in filltitlebox_vrfy method"+e);
		}
	}
	public void clickonsubmit_btn()
	{
		try
		{
			submit_btn.click();
		}
		catch (Exception e)
		{
			System.out.println("issue in clickonsubmit_btn method"+e);
		}
	}
	

}
