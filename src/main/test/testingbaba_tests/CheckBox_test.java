package testingbaba_tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import testingbaba_pages.CheckBox_page;

public class CheckBox_test extends BaseLibrary
{
	CheckBox_page ob ;
    @BeforeTest
	public void LaunchTestingBaba_Url()
	{
		getLaunchUrl("https://www.testingbaba.com/old/");
		ob = new CheckBox_page();
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
		public void clickonCheckBox()
		{
			ob.clickonCheckBox();
		}

		@Test(priority = 4)
		public void clickonCheckBoxFrame()
		{
			ob.clickonproducts();
		}
	}
	

