package second;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class Screenshot_Eg {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.edge.driver","C:\\Users\\Sayeed Khan\\Downloads\\edgedriver_win32\\msedgedriver.exe");
	WebDriver driver =new EdgeDriver();
	driver.get("https://www.google.com");
	//Typecast
	TakesScreenshot ts =(TakesScreenshot)driver;
	File src= ts.getScreenshotAs(OutputType.FILE);
	File dest =new File("C:\\Users\\Sayeed Khan\\Desktop\\Screenshot\\GGPAGE.png");
	Files.copy(src, dest);
	
}
}
