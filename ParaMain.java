package para;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class ParaMain extends ParaBasic {
	
	@Test
	public void runLogin() throws InterruptedException {
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("surya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sree");
		
		
		WebElement sour = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dar = new Select(sour);
		dar.selectByVisibleText("Conference");
		
		driver.findElement(By.name("submitButton")).click();
		
		Thread.sleep(3000);
		
		String firstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(firstName);
		
		if(firstName.equals("surya")) {
			System.out.println("its Success");
		} else {
			System.out.println("its Failure");
		}
	}
}
