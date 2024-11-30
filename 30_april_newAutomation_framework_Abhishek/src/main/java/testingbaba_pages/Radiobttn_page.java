package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class Radiobttn_page extends BaseLibrary {

	public Radiobttn_page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"myModal2\"]/div/div/div[1]/button")
	private WebElement closebtn;

	@FindBy(xpath = "//*[text()='Practice']")
	private WebElement practice;

	@FindBy(xpath = "//*[@data-target=\"#elements\"]")
	private WebElement elements;

	@FindBy(xpath = "//*[@href=\"#tab_3\"]")
	private WebElement radiobuttn;

	@FindBy(xpath = "//*[@id='yes']")
	private WebElement clickonyes;

	@FindBy(xpath = "//*[@id='impressive']")
	private WebElement clickonimpressive;

	@FindBy(xpath = "//*[@id='no']")
	private WebElement clickonno;

	public void clickonClosebtn() {
		closebtn.click();
	}

	public void clickonPractice() {
		practice.click();
	}

	public void clickonElements() {
		elements.click();
	}

	public void clickonRadiobuttn() {
		radiobuttn.click();
	}

	public void clickonCondition() {
		 
	System.out.println(getReadData(path, 2, 1, 1));
		if (getReadData(path, 2, 1, 1).equals("true"))

		{
			clickonyes.click();
    System.out.println(getReadData(path, 2, 1, 2));
		}
		if (getReadData(path, 2, 1, 2).equals("true")) {
			clickonimpressive.click();
		} 
//		if (getReadData(path, 2, 1, 3).equals("true")) {
//			clickonno.click();
//		}
	}

}
