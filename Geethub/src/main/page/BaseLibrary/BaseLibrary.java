package BaseLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseLibrary
{
	public static WebDriver driver=new ChromeDriver();
	public void GetLaunchUrl(String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	
}
