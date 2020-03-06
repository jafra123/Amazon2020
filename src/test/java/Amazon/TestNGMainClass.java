package Amazon;

import org.testng.TestNG;

public class TestNGMainClass {
	public static void main(String[] args) {
		TestNG testSuite = new TestNG();
		testSuite.setTestClasses(new Class[] { FooterValidation.class });
		testSuite.setTestClasses(new Class[] { ClickOnLeftArrowRightArrow.class });
		testSuite.addListener(new Test5SuiteListener());
		testSuite.setDefaultSuiteName("My Test Suite");
		testSuite.setDefaultTestName("My Test");
		//testSuite.setOutputDirectory("/Users/pankaj/temp/testng-output");
		testSuite.run();
	}
}
