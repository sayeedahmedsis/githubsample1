package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledFlag {
@Test
public void testcase1(){
	Reporter.log("testcase1 is running",true);
}
@Test(enabled = false)
public void testcase2() {
	Reporter.log("testcase2 is running",true);
}
@Test
public void testcase3() {
	Reporter.log("testcase3 is running",true);
}
}
