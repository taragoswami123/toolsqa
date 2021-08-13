package page;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLibrary.BaseLibrary;

public class geethublogin_page extends BaseLibrary
{
	Logger log = Logger.getLogger("devpinoyLogger");
	public geethublogin_page() 
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "/html/body/div[1]/header/div/div[2]/div[2]/div[2]")
	private WebElement signpage;
	
	public void GetLaunchUrl()
	{
		GetLaunchUrl("https://github.com/");
		log.debug("browser lanuch");
	}
	public void clickonSign()
	{
		signpage.click();
		log.debug("click on sign bttn");
	}

}
