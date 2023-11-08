package second;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_class {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver","C:\\Users\\Sayeed Khan\\Downloads\\edgedriver_win32\\msedgedriver.exe");
	WebDriver driver =new EdgeDriver();
	driver.get("https://www.google.com/");
	//xpath of gmail
	WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
	//Create object of action class
	Actions act = new Actions(driver);
	act.moveToElement(gmail).contextClick().doubleClick().build().perform();
	
	
	
}
}
