package second;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Scroll_Handling {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\Sayeed Khan\\Downloads\\edgedriver_win32\\msedgedriver.exe");
	WebDriver driver =new EdgeDriver();
	driver.get("https://www.amazon.com/");
	//Scroll Down 
	JavascriptExecutor jse =(JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,2000)");
	//Scroll up
	Thread.sleep(3000);
	jse.executeScript("window.scrollBy(0,-1000)");
}
}
