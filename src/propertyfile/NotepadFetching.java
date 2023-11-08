package propertyfile;

import java.io.FileInputStream;
import java.util.Properties;

public class NotepadFetching {
public static void main(String[] args) throws Throwable {
	//Create object for fis class
	FileInputStream fis =new FileInputStream("C:\\Users\\Sayeed Khan\\eclipse-workspace\\Hero\\src\\Drivers\\Advance_selenium.txt");
	//Create property for object class
	Properties p = new Properties();
	p.load(fis);
	//Print username
	String UN = p.getProperty("un");
	System.out.println(UN);
	//print pwd
	String PWD = p.getProperty("pwd");
	System.out.println(PWD);
	//Print url
	String URL = p.getProperty("url");
	System.out.println(URL);
	//print browser
	String BROWSER = p.getProperty("browser");
	System.out.println(BROWSER);
	
	
}
}
