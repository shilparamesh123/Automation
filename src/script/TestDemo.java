package script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaceTest;

public class TestDemo extends BaceTest{
	@Test
	public void TestA() {
		Reporter.log("test...",true);
	}
	

}
