package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import baselibrary.BaseLibrary;

public class Webtable_page extends BaseLibrary
{

	@FindBy(xpath = "//*[@id=\"myModal2\"]/div/div/div[1]/button")
	private WebElement closebtn;

	@FindBy(xpath = "//*[text()='Practice']")
	private WebElement practice;

	@FindBy(xpath = "//*[@data-target=\"#elements\"]")
	private WebElement elements;
	
	@FindBy (xpath = "//*[@href=\"#tab_4\"]")
	private WebElement webtables;
	
	
}
