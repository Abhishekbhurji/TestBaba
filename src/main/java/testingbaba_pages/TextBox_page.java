package testingbaba_pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;
import excelutility.Excelutlity;

public class TextBox_page extends BaseLibrary 
{

	
	public TextBox_page()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"myModal2\"]/div/div/div[1]/button")
	private WebElement closebtn;
	
	@FindBy(xpath="//*[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath="//*[@data-target=\"#elements\"]")
	private WebElement elements;
	
	@FindBy(xpath="//*[@href=\"#tab_1\"]")
	private WebElement TextBox;
	
	@FindBy(xpath = "//*[@id=\"fullname1\"]")
	private WebElement Name;
	
	@FindBy(xpath = "//*[@id=\"fullemail1\"]")
	private WebElement Email;
	
	@FindBy(xpath = "//*[@id=\"fulladdresh1\"]")
	private WebElement c_Add;
	
	@FindBy(xpath = "//*[@id=\"paddresh1\"]")
	private WebElement p_Add;
	
	@FindBy(xpath = "//*[@class=\"btn btn-success\"]")
	private WebElement submbtn;
	
	
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
	public void clickonTextBox()
	{
		TextBox.click();
	}
	public void filldeatials()
	{
	Name.sendKeys(getReadData(path,0, 0, 1));
	Email.sendKeys(getReadData(path,0, 1, 1));
	c_Add.sendKeys(getReadData(path,0, 2, 1));
	p_Add.sendKeys(getReadData(path,0, 3, 1));
		submbtn.click();

	}
	
	public void getDetails()
	{
		List<WebElement> list = driver.findElements(By.xpath("//*[@class=\"col-md-6 mt-5\"]/label"));
		int count=2;
		for(int i=1;i<=list.size()-1;i=i+2)
		{
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equalsIgnoreCase(getReadData(path, 0, count, 1)))
			{
				System.out.println(" Passed");
			}
			else 
			{
				System.out.println("Failed");
		    }
		}
		    count=count+1;
	
		
	}
}
	
	
	
	

