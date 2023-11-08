package second;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ClassG {
	public static void main(String[] args) {
	System.getProperty("webdriver.edge.driver","C:\\Users\\Sayeed Khan\\Downloads\\edgedriver_win32\\msedgedriver.exe");
	WebDriver d=new EdgeDriver();
	d.get("https://www.flipkart.com");
	
	}
}
