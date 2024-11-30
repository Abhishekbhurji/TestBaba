package testingbaba_tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import testingbaba_pages.TextBox_page;

public class TextBox_Test extends BaseLibrary 
{

	TextBox_page ob;
	@BeforeTest
	public void LaunchTestingBaba_Url()
	{
		getLaunchUrl(getReaddata("url"));
	 ob=new TextBox_page();
	}
	
	@Test(priority = 0)
		
	public void clickonclosebtn() throws InterruptedException
	{
		Thread.sleep(2000);
		ob.clickonCloseBtn();
	}
	
	@Test(priority = 1) 
	public void clickonPractice()
	{
		ob.clickonPractice();
	}
	
	@Test(priority = 2)
	public void clickonElements()
	{
		ob.clickonElements();
	}
	
	@Test(priority = 3)
	public void clickoneTextBox()
	{
		ob.clickonTextBox();
	}
	@Test(priority = 4)
	public void filldetails()
	{
		ob.filldeatials();
	}
	
	@Test(priority = 5)
	public void getDetails()
	{
		ob.getDetails();
	}
	
}






















