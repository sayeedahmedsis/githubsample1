package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
@Test(priority = 3)
public void tc1() {
	Reporter.log("This is running tc1",true);
}
@Test(priority = 2)
public void tc2() {
	Reporter.log("This is running tc2",true);
}
@Test(priority = 1)
public void tc3() {
	Reporter.log("This is runing tc3",true);
}
}
