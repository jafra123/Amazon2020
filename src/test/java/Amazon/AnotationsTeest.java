package Amazon;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class AnotationsTeest {

	@BeforeSuite
	public void SampleClass1tes1BeforeSuite() {
		System.out.println("@BeforeSuite: The annotated method will be run before all tests in this suite have run.");
	}
	@BeforeTest
	public void SampleClass1tes1BeforeTest() {
		System.out.println("@BeforeTest: The annotated method will be run before any test method belonging to the classes inside the <test> tag is run.");
	}
	@BeforeGroups
	public void SampleClass1tes1BeforeGroup() {
		System.out.println("@BeforeGroups: The list of groups that this configuration method will run before. This method is guaranteed to run shortly before the first test method that belongs to any of these groups is invoked.");
	}
	@BeforeClass
	public void SampleClass1tes1BeforeClass() {
		System.out.println("@BeforeClass:The annotated method will be run before the first test method in the current class is invoked.");
	}
	@BeforeMethod
	public void SampleClass1tes1BeforeMethod() {
		System.out.println("@BeforeMethod: The annotated method will be run before each test method.");
	}
	
	@Parameters({ "first-name" })
	@Test(priority=1,description="-description", enabled=true)
	public void SampleClass1tes1(String fname) {
		System.out.println("SampleClass1test1");
		System.out.println("From TestNg.xml:"+fname);
	//	Assert.assertEquals("Manmohan", fname);
		
	}
	
	@Test(priority=2, invocationCount=2 )	
	public void SampleClass1tes2() {
		System.out.println("SampleClass1test2");
		int a=1;
		int b=10;
		int c=a+b;
		Assert.assertEquals(c, a);
		
	}
	
	
	@Test(priority=3, dependsOnMethods="SampleClass1tes2")
	
	public void SampleClass1tes3() {
		System.out.println("SampleClass1test3");
	}
	
	@AfterTest
	public void SampleClass1tes4AfterTest() {
		System.out.println("@AfterTest: The annotated method will be run after all the test methods belonging to the classes inside the <test> tag have run.");
	}
	
	@AfterSuite
	public void SampleClass1tes1AfterSuite() {
		System.out.println("@AfterSuitThe annotated method will be run after all tests in this suite have run.");
	}
	
	@AfterGroups
	public void SampleClass1tes1AfterGroup() {
		System.out.println("@AfterGroups: The list of groups that this configuration method will run after. This method is guaranteed to run shortly after the last test method that belongs to any of these groups is invoked.");
	}
	@AfterClass
	public void SampleClass1tes1AfterClass() {
		System.out.println("@AfterClass: The annotated method will be run after all the test methods in the current class have been run.");
	}
	@AfterMethod
	public void SampleClass1tes1AfterMethod() {
		System.out.println("@AfterMethod: The annotated method will be run after each test method");
	}
	
	
}

	
	