package Amazon;



import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Anotaion2 {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\b\\eclipse-workspace\\ARpanaTestNG\\drv\\chromedriver.exe");
		
	WebDriver driver;
	driver = new ChromeDriver();
	
	@Test
	public void test1() {
		System.out.println("test1");
		driver.get("http://www.google.com");
	}
	@Test
    public void test2() {
	System.out.println("test2");
	}
}
