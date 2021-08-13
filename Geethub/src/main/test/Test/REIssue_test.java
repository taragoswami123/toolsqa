package Test;

import org.testng.annotations.Test;

import page.REIssue_page;

public class REIssue_test 
{
	REIssue_page ob=new REIssue_page();
	
	@Test(priority = 1,enabled = true)
	public void clickonreissuebtn()
	{
		ob.clickonreissuebtn();
	}
	@Test(priority = 2,enabled = true)
	public void fillissuetitle()
	{
		ob.fillissuetitle();
	}
	
	@Test(priority = 3,enabled = true)
	public void fillcommentbox()
	{
		ob.fillcommentbox();
	}
	@Test(priority = 4,enabled = true)
	public void clickonnewissuebtn()
	{
		ob.clickonnewissuebtn();
		
	}

}
