package Test;

import org.testng.annotations.Test;


import page.repository_page;

public class repository_test 
{
	repository_page ob=new repository_page();
	
	@Test(priority = 1,enabled = true)
	public void fillrepository_vrfy()
	{
		ob.fillrepository_vrfy();
	}
	
	@Test(priority = 2,enabled = true)
	public void clickoncreaterepo()
	{
		ob.clickoncreaterepo();
	}
	@Test(priority = 3,enabled = true)
	public void clickonissue()
	{
		ob.clickonissue();
	}
	

}
