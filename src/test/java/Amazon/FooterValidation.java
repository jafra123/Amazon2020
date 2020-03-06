package Amazon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FooterValidation extends BaseClass{
	
	String new1;	
	@Test(priority=1)
	public void TestAustralia() throws InterruptedException {
	WebElement australia =driver.findElement(By.xpath("//a[text()='Australia']"));
	String australiatext=australia.getText();
	System.out.println("australiatext:"+australiatext);
	australia.click();
	Thread.sleep(2000);
	WebElement a= driver.findElement(By.xpath("//a[@aria-label='Amazon.com.au']"));		
	String name1=a.getAttribute("aria-label");
	System.out.println("name1:"+name1);
	if(name1.equalsIgnoreCase("Amazon.com.au")) {
		new1= name1.replace(name1, "Australia");		
	}	
	Assert.assertEquals(australiatext, new1);	
	}
	
	@Test(priority=2)
	public void TestBrazil() throws InterruptedException {
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
	WebElement brazil1 =driver.findElement(By.xpath("//a[text()='Brazil']"));
	String brazil=brazil1.getText();
	System.out.println("brazil:"+brazil);
	brazil1.click();
	Thread.sleep(5000);
	WebElement a= driver.findElement(By.xpath("//a[@aria-label='Amazon.com.br']"));		
	String name1=a.getAttribute("aria-label");
	System.out.println("name1:"+name1);
	if(name1.equalsIgnoreCase("Amazon.com.br")) {
		new1= name1.replace(name1, "Brazil");		
	}	
	Assert.assertEquals(brazil, new1);	
	}	
}