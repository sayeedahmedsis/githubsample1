package second;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Multiple_window_handling {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver","C:\\Users\\Sayeed Khan\\Downloads\\edgedriver_win32\\msedgedriver.exe");
	WebDriver driver= new EdgeDriver();
	int count=0;
	driver.get("https://www.flipkart.com");
	//Click on Cancel btn
	driver.findElement(By.xpath("//span[.='✕']")).click();
	//find the elements
	List<WebElement> allele = driver.findElements(By.xpath("//div"));
	for(WebElement ele:allele) {
		String e = ele.getText();
		System.out.println(e);
		count++;
		
	}
	System.out.println(count);
	
}
}
