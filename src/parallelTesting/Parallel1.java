package parallelTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Parallel1 {
@Test
public void m2() {
	System.setProperty("webdriver.edge.driver","C:\\Users\\Sayeed Khan\\Downloads\\edgedriver_win32 (2)\\msedgedriver.exe");
	WebDriver driver =new EdgeDriver();
	driver.get("https://www.facebook.com");
}
}
