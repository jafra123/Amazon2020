package Amazon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClickOnLeftArrowRightArrow {
	String Xpath_previousAndForrword="//i[@class='a-icon a-icon-xpathruntime-rounded']";
	
	@Test(priority=1)
	public void alllinksTest() throws InterruptedException {
	WebDriver driver;
	//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\chromedriverwin.exe");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\b\\eclipse-workspace\\ARpanaTestNG\\drv\\chromedriver.exe");
		driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	
	for(int i=0; i<10; i++) {   
		String newxpath =Xpath_previousAndForrword.replace("xpathruntime", "next");	    
	driver.findElement(By.xpath(newxpath)).click();
	}
	
	for(int i=0; i<10; i++) {   
		String newxpath1 =Xpath_previousAndForrword.replace("xpathruntime", "previous");	    
	driver.findElement(By.xpath(newxpath1)).click();
	}
	
	}
	}
