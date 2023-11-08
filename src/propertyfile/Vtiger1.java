package propertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Vtiger1 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.edge.driver","C:\\Users\\Sayeed Khan\\Downloads\\edgedriver_win32\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	//driver.get("http://localhost:8888/");
	//Fetch the url from property file
	FileInputStream fis = new FileInputStream("C:\\Users\\Sayeed Khan\\eclipse-workspace\\Hero\\src\\Drivers\\Advance_selenium.txt");
	Properties p = new Properties();
	p.load(fis);
	String URL = p.getProperty("url");
	driver.get(URL);
}
}
