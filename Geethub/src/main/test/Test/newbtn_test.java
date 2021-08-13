package Test;

import org.testng.annotations.Test;

import page.newbtn_page;

public class newbtn_test 
{
	newbtn_page ob=new newbtn_page();
	
	@Test(priority = 1,enabled = true)
	public void clickonnewbtn()
	{
		ob.clickonnewbtn();
	}

}
