package Test;

import org.testng.annotations.Test;

import page.geethubtextbox_page;

public class geethubtestbox_test 
{
	geethubtextbox_page ob=new geethubtextbox_page();
	@Test(priority = 1,enabled = true)
	public void filldetails()
	{
		ob.filldetails();
	}

}
