package para;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

//import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParaBasic {
	 
	public ChromeDriver driver ;
	@Parameters({"url","user","pass"})
	@BeforeTest
	public void preCon(String url,String uName,String pawd)
	{
	WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
WebElement eleUserName = driver.findElement(By.id("username"));
	eleUserName.sendKeys(uName);
	driver.findElement(By.id("password")).sendKeys(pawd);

	driver.findElement(By.className("decorativeSubmit")).click();
	}
	@AfterMethod
	public void posCon()
	{
		driver.close();
	}
}
