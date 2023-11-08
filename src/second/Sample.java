package second;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Sample {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver","C:\\Users\\Sayeed Khan\\Downloads\\edgedriver_win32\\msedgedriver.exe");
	WebDriver driver =new EdgeDriver();
	//Launch the webpage
	driver.get("https://demo.actitime.com/login.do");
	//Enter user name
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	//Enter the Pwd
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
	//Click on login btn
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	
	
}
}
