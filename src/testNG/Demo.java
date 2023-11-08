package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
@Test
public void t1() {
	Reporter.log("Hii",true);
}
}
