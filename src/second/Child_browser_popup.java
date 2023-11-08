package second;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Child_browser_popup {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.edge.driver","C:\\Users\\Sayeed Khan\\Downloads\\edgedriver_win32\\msedgedriver.exe");
	WebDriver driver =new EdgeDriver();
	driver.get("https://www.flipkart.com/");
	//Click on cancel buttton
	driver.findElement(By.xpath("//span[text()='✕']")).click();
	//search for mobliles
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobiles");
	//Click on search bar
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	//Click on first mobile
	driver.findElement(By.xpath("(//div[@class='_4rR01T'][1])")).click();
	//Wait
	Thread.sleep(4000);
	Set<String> allwins = driver.getWindowHandles();
	for(String win1:allwins) {
		driver.switchTo().window(win1);
	}
	String t1 = driver.getTitle();
	System.out.println(t1);
}
}
