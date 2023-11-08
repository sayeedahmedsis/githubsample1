package second;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownList {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Sayeed Khan\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.facebook.com/");
		//click on create new account
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		//Select day dropdown
		Thread.sleep(5000);
		 WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		 Select s=new Select(day);
		 Thread.sleep(5000);
		 s.selectByVisibleText("7");
		 //select month from dropdown
		 WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		 Select s1=new Select(month);
		 Thread.sleep(5000);
		 s1.selectByVisibleText("Aug");
		 //Select year from dropdown
		 WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		 Select s2 =new Select(year);
		 s2.selectByVisibleText("1995");
		 
		 
				 
		
		
	}

}
