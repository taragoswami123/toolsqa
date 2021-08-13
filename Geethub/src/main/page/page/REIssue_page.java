package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLibrary.BaseLibrary;
import Propertyutility.Propertyutility;

public class REIssue_page extends BaseLibrary
{
	public REIssue_page() 
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@id=\"partial-discussion-header\"]/div[1]/div/div/a")
	private WebElement reissuebtn;
	
	@FindBy(xpath = "//*[@id=\"issue_title\"]")
	private WebElement issuetitle;
	
	@FindBy(xpath = "//*[@id=\"issue_body\"]")
	private WebElement comnt;
	
	@FindBy(xpath = "//*[@id=\"new_issue\"]/div/div/div[1]/div/div[1]/div/div[2]/button")
	private WebElement submitnewissue;
	
	public void clickonreissuebtn()
	{
		try 
		{
			reissuebtn.click();
			Thread.sleep(2000);
			
		} 
		catch (Exception e) 
		{
			System.out.println("issue in clickonissuebtn methdo"+e);
		}
	}
	public void fillissuetitle()
	{
		try 
		{
			String isstitle = Propertyutility.getpropertypage("title1");
			issuetitle.sendKeys(isstitle);
			System.out.println(isstitle);
			Thread.sleep(2000);
			
		} catch (Exception e) 
		{
			System.out.println("issue in fillcommentbox methdo"+e);
		}
	}
	
	public void fillcommentbox()
	{
		try 
		{
			String cmnt = Propertyutility.getpropertypage("comment");
			comnt.sendKeys(cmnt);
			System.out.println(cmnt);
			Thread.sleep(2000);
			
		} catch (Exception e) 
		{
			System.out.println("issue in fillcommentbox methdo"+e);
		}
	}
	public void clickonnewissuebtn()
	{
		try 
		{
			submitnewissue.click();
		}
		catch (Exception e) 
		{
			System.out.println("issue in clickonnewissuebtn methdo"+e);
		}
	}

}
