package second;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Xyz {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Sayeed Khan\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().to("https://www.amazon.in/");
		driver.close();
	}

}
