package testingbaba_tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import testingbaba_pages.Radiobttn_page;

public class Radiobttn_test extends BaseLibrary
{
	Radiobttn_page ob;
	@BeforeTest
	public void getLaunchurl()
	{
		
		getLaunchUrl("url");
		ob =new Radiobttn_page();
	}
	@Test(priority =0 )
	public void clickonclosebtn()
	{
		ob.clickonClosebtn();
	}
	
	@Test(priority =1 )
	public void clickonpractice()
	{
		ob.clickonPractice();
	}
	@Test(priority = 2)
	public void clickOnElements()
	{
		ob.clickonElements();
	}
	
	@Test(priority =3 )
	public void clickOnRadiobtn()
	{
	ob.clickonRadiobuttn();	
	}
	@Test(priority = 4)
	public void clickOncondition()
	{
		ob.clickonCondition();
	}
	
}
