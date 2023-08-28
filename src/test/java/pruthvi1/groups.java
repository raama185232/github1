package pruthvi1;

import org.testng.annotations.Test;

public class groups {
	

	@Test (groups="smoke" )
	public void Test1() {
		System.out.println("This is my first smoke test");
	}
	@Test(groups = "regression")
	public void Test2() {
		System.out.println("This is my first Regression test");
	}
	@Test(groups="smoke" )
	public void Test3() {
		System.out.println("This is my second smoke test");
	}
	@Test(groups = "regression")
	public void Test4() {
		System.out.println("This is my second Regression test");
		
	}
}
