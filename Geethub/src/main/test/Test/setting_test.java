package Test;

import org.testng.annotations.Test;

import page.setting_page;

public class setting_test 
{
	setting_page ob=new setting_page();
	
	@Test(priority = 1,enabled = true)
	public void clickonsetting()
	{
		ob.clickonsetting();
	}
	@Test(priority = 2,enabled = true)
	public void clickondeleterepo()
	{
		ob.clickondeleterepo();
	}
	@Test(priority = 3,enabled = true)
	public void clickondeletetext()
	{
		ob.clickondeletetext();
	}
	
}
