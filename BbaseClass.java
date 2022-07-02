package testNG;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BbaseClass{
public ChromeDriver driver;
public String fileName;
@Parameters({"url","user","pass"})
@BeforeMethod
public void preC(String url,String usern,String pas)throws Exception
{
	
WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	WebElement eleUserName = driver.findElement(By.id("username"));
	eleUserName.sendKeys(usern);
	driver.findElement(By.id("password")).sendKeys(pas);
	driver.findElement(By.className("decorativeSubmit")).click();
}
@AfterMethod
public void postCon()
{
	driver.close();
	}
//@DataProvider(name = "getData")
//public String[][] fetchData() throws IOException
//{
//	return DynamicExcelData.readData(fileName);
//
//}
}

