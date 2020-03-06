package Amazon;

import org.testng.annotations.Test;

public class SampleClass1 extends BaseClass {

	
	@Test(priority=1)
	public void SampleClass1tes1() {
		System.out.println("SampleClass1test1");
	}
	@Test(priority=2)
	public void SampleClass1tes2() {
		System.out.println("SampleClass1test2");
	}
	@Test(priority=3)
	public void SampleClass1tes3() {
		System.out.println("SampleClass1test3");
	}
	@Test(priority=4)
	public void SampleClass1tes4() {
		System.out.println("SampleClass1test4");
	}
	
}
