package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {
@Test(invocationCount = 5)
public void tc1() {
	Reporter.log("running tc1",true);
}
}
