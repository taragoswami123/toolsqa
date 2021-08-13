package Test;

import org.testng.annotations.Test;

import page.newissue_page;

public class newissue_test 
{
	newissue_page ob=new newissue_page();
	
	@Test(priority = 1,enabled = true)
	public void clickonnewissuebtn()
	{
		ob.clickonnewissuebtn();
	}
	
	@Test(priority = 2,enabled = true)
	public void filltitlebox()
	{
		ob.filltitlebox();
	}
	@Test(priority = 3,enabled = true)
	public void fillissuebox() 
	{
		ob.fillissuebox();
	}
	
	@Test(priority = 3,enabled = false)
	public void filltitlebox_vrfy()
	{
		ob.filltitlebox_vrfy();
	}
	
	@Test(priority = 4,enabled = true)
	public void clickonsubmit_btn()
	{
		ob.clickonsubmit_btn();
	}

}
