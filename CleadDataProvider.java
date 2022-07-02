package testNG;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class CleadDataProvider extends BbaseClass
{
@Test(dataProvider="fetchData")
	public void exam1(String cName,String fName,String lName)throws Exception
	{

driver.findElement(By.linkText("CRM/SFA")).click();

driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);


WebElement sourc = driver.findElement(By.id("createLeadForm_dataSourceId"));
Select da = new Select(sourc);
da.selectByVisibleText("Conference");

driver.findElement(By.name("submitButton")).click();

Thread.sleep(3000);

String firstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
System.out.println(firstName);


if(firstName.equals("saty")) {
	System.out.println("Success");
} else {
	System.out.println("Fail");
}
	}
@DataProvider
public String[][] fetchData()
{
	String[][] data=new String[2][3];
	data[0][0]="VarunC";
	data[0][1]="saty";
	data[0][2]="sair";
	
	data[1][0]="Quadra";
	data[1][1]="Aarna";
	data[1][2]="Cres";
	return data;
}
}

