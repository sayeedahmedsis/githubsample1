package second;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Sample3Facebook {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\Sayeed Khan\\Downloads\\edgedriver_win32\\msedgedriver.exe");
	WebDriver driver= new EdgeDriver();
	//Launch the webpage
	driver.get("https://www.facebook.com/");
	//click on create new account
	driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	//Add first name
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sayeed");
	//Add last Name
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Ahmed");
	//Add mobile number
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("1234567891");
	//Add password
	driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("9985789674");
	//Click on sign function
	driver.findElement(By.xpath("//button[@name='websubmit']")).click();
}
}
