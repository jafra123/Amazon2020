package Amazon;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class Test5SuiteListener implements ISuiteListener {

	
	public void onStart(ISuite suite) {
		System.out.println("TestNG suite default output directory = "+suite.getOutputDirectory());
		}

	
	public void onFinish(ISuite suite) {
		System.out.println("TestNG invoked methods = " +suite.getAllInvokedMethods());
	}

}
