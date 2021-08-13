package geethup_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class geethub_Test 
{
	public static void  main(String [] args)
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/");
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/div[2]")).click();
	}

}
