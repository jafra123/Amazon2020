package Amazon;

import org.testng.annotations.Test;

public class SampleClass2 extends BaseClass {

	
	@Test(priority=1)
	public void SampleClass2tes1() {
		System.out.println("SampleClass2test1");
	}
	@Test(priority=2)
	public void SampleClass2tes2() {
		System.out.println("SampleClass2test2");
	}
	@Test(priority=3)
	public void SampleClass2tes3() {
		System.out.println("SampleClass2test3");
	}
	@Test(priority=4)
	public void SampleClass2tes4() {
		System.out.println("SampleClass2test4");
	}
	
}
