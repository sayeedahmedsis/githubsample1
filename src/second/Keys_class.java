package second;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Keys_class {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver","C:\\Users\\Sayeed Khan\\Downloads\\edgedriver_win32\\msedgedriver.exe");
	WebDriver driver =new EdgeDriver();
	driver.get("https://demo.actitime.com/login.do");
	//Enter UN,pwd,click on logoin button
	driver.findElement(By.xpath("")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
}
}
