package testNG;

	
	import java.io.IOException;

	import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;


	public class ExcelFileName extends ParaBasic{

				@BeforeClass 
				
				public void setData()
				{
					fileName="exceldatas";
				}
				@Test(dataProvider= "getData")
				public void inte(String cName,String fName,String lName) throws InterruptedException {
					driver.findElement(By.linkText("CRM/SFA")).click();
					driver.findElement(By.linkText("Leads")).click();
					driver.findElement(By.linkText("Create Lead")).click();
					driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
					driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
					driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
					
					
					
					driver.findElement(By.name("submitButton")).click();
				}
	
	}

