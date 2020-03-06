package Amazon;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Anotaion2 {
	WebDriver driver;
	@Test
	public void test1() {
		System.out.println("test1");
		driver.get("http://www.google.com");
		// chaged
	}
	@Test
    public void test2() {
	System.out.println("test2");
	}
}
