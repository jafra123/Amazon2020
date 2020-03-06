package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	WebDriver driver;			
	@BeforeTest
	public void alllinksTest() throws InterruptedException {	
	//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\chromedriverwin.exe");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\b\\eclipse-workspace\\ARpanaTestNG\\drv\\chromedriver.exe");
		driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	}	
	@AfterTest
	public void teadown() {
    driver.close();
	driver.quit();	
	}
	
	
	
}
