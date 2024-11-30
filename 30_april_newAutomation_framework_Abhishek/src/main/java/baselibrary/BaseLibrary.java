package baselibrary;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

import excelutility.Excelutlity;
import propertyutility.Propertyutility;

public class BaseLibrary implements Excelutlity,Propertyutility
{
    String configpath ="D:\\eclipse-workspace\\30_april_newAutomation_framework_Abhishek\\testdata\\config.properties";
	public static 	String path= "D:\\eclipse-workspace\\30_april_newAutomation_framework_Abhishek\\testdata\\testdata.xlsx" ;
    public static WebDriver driver;
	public void getLaunchUrl(String url)
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\eclipse-workspace\\30_april_newAutomation_framework_Abhishek\\drivers\\chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.get("https://www.testingbaba.com/old/");
		 driver.manage().window().maximize();

	}
	@Override
	public String getReadData(String path, int sheetno, int colno, int rowno) {
		String value ="";
		try {
			FileInputStream fis = new FileInputStream(path);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			  XSSFSheet sheet = wb.getSheetAt(sheetno);
			  value =sheet.getRow(rowno).getCell(colno).getStringCellValue();
		} catch (Exception e) 
		{
			// TODO: handle exception
		}
		return value;
	}
	@Override
	public String getReaddata(String key) {
		String value ="";
		try {
			FileInputStream fis = new FileInputStream(configpath);
			Properties prop = new Properties();
			prop.load(fis);
			value = prop.getProperty(key);
			
		} catch (Exception e)
		{
			System.out.println("Issue in Get Red data "+e);
		}
		return value;
	}
	
//	@AfterTest
//	public void tearDown()
//	{
//		driver.quit();
//	}
}
