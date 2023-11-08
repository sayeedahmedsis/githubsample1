package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsonMethodFlag {
@Test
public void login() {
	Reporter.log("Running Login",true);
}
@Test(dependsOnMethods = {"login"})
public void logout() {
	Reporter.log("Running logout",true);
}
}
