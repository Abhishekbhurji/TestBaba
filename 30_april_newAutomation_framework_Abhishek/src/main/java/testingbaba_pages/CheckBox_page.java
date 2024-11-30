package testingbaba_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class CheckBox_page extends BaseLibrary 
{
	
	public CheckBox_page()
	{
		PageFactory.initElements(driver, this);
	}	
		
		@FindBy(xpath="//*[@id=\"myModal2\"]/div/div/div[1]/button")
		private WebElement closebtn;
		
		@FindBy(xpath="//*[text()='Practice']")
		private WebElement practice;
		
		@FindBy(xpath="//*[@data-target=\"#elements\"]")
		private WebElement elements;

		@FindBy(xpath="//*[@href=\"#tab_2\"]")
		private WebElement checkBox;
		
	
		@FindBy(xpath="//*[@id='myCheck']")
		private WebElement clickonmobile;
		
		@FindBy(xpath="//*[@id='mylaptop']")
		private WebElement clickonlaptop;
		
		@FindBy(xpath="//*[@id='mydesktop']")
		private WebElement clickondestop;
		
      
		public void clickonCloseBtn()
		{
			closebtn.click();
		}
		public void clickonPractice()
		{
			practice.click();
		}
		public void clickonElements()
		{
			elements.click();
		}
		public void clickonCheckBox() 
		{
			checkBox.click();
		}
		
		public void clickonproducts()
		{
			 WebElement checkboxframe =driver.findElement(By.xpath("//*[@src=\"Checkbox.html\"]"));
		     driver.switchTo().frame(checkboxframe);
		   
		     if(getReadData(path, 1, 1, 1).equals("yes"))
		     {
             clickonmobile.click();
		     }
		     
		     if(getReadData(path, 1, 1, 2).equals("yes"))
		     {
		    	 clickonlaptop.click();
		     }
		    	 
		     if(getReadData(path, 1, 1, 3).equals("yes"))
		     {
		    	 clickondestop.click();
		     }
		    	 
		    	
	    
	
	}

}
