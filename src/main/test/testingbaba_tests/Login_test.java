package testingbaba_tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import testingbaba_pages.Login_page;

public class Login_test extends BaseLibrary
{
	Login_page ob;
	@BeforeTest
	public void getLaunchUrl_testingbaba()
	{
		getLaunchUrl("https://www.testingbaba.com/old/");
		ob = new Login_page();
	}
	@Test
	public void getTitle_testingbaba() 
	{
		ob.getTitle_testingbaba();
	}
	
}
