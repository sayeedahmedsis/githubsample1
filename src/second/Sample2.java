package second;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Sample2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\\\Users\\\\Sayeed Khan\\\\Downloads\\\\edgedriver_win32\\\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		//Launch the webpage
		driver.get("https://www.flipkart.com/");
		//Enter the click on cancel btn
		driver.findElement(By.xpath("//span[@role='button']")).click();
		
		//Search function path
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mobiles under 29k");
		//Click on search button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}
