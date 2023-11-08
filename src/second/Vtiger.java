package second;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Vtiger {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver","C:\\Users\\Sayeed Khan\\Downloads\\edgedriver_win32\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("http://localhost:8888/");
	//Enter the vaild un
	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
	//Enter the pwd
	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
	//Click on login button
	driver.findElement(By.xpath("//input[@id='submitButton']")).click();
	//gettitle
	String tit = driver.getTitle();
	System.out.println(tit);
}
}
