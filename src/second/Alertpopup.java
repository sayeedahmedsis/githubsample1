package second;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alertpopup {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver","C:\\Users\\Sayeed Khan\\Downloads\\edgedriver_win32\\msedgedriver.exe");
	WebDriver driver =new EdgeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	//Give the customer id
	driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("23456");
	//Click on submit button
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	//use alert intertface method
	Alert alt = driver.switchTo().alert();
	//Click on cancel button
	alt.accept();
}
}
