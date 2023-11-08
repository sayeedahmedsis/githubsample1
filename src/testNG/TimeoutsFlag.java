package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeoutsFlag {
@Test(timeOut = 10)
public void tc1() {
	Reporter.log("Tc1 is running",true);
}


}
