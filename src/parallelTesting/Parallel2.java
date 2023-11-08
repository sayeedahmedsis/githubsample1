package parallelTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Parallel2 {
@Test
public void m1() {
	System.setProperty("webdriver.edge.driver","C:\\Users\\Sayeed Khan\\Downloads\\edgedriver_win32 (2)\\msedgedriver.exe");
	WebDriver driver= new EdgeDriver();
	driver.get("https://www.amazon.com");
}

}
