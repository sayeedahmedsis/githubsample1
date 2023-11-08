package second;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class Particular_screenshot {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.edge.driver","C:\\Users\\Sayeed Khan\\Downloads\\edgedriver_win32\\msedgedriver.exe");
	WebDriver driver= new EdgeDriver();
	driver.get("https://www.google.com");
	//inspect particular element
	WebElement ref = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
	 File src = ref.getScreenshotAs(OutputType.FILE);
	 File dest = new File("C:\\Users\\Sayeed Khan\\Desktop\\Screenshot\\GGPHOTO.png");
	 Files.copy(src,dest);
	 
	
}
}
