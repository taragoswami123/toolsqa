package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLibrary.BaseLibrary;
import Propertyutility.Propertyutility;

public class geethubtextbox_page extends BaseLibrary
{
	public geethubtextbox_page() 
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@id=\"login_field\"]")
	private WebElement Email;
	
	@FindBy(xpath = "//*[@id=\"password\"]")
	private WebElement Password;
	
	@FindBy(xpath = "//*[@id=\"login\"]/div[4]/form/div/input[12]")
	private WebElement signbtn;

	public void filldetails()
	{
	try
	{
		String email = Propertyutility.getpropertypage("email");
		String password = Propertyutility.getpropertypage("password");
		Email.sendKeys(email);
		Password.sendKeys(password);
		signbtn.click();
	} 
	catch (Exception e) 
	{
		System.out.println("issue in filldetails method"+e);
	}
	
	}
	
}
