package propertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDataFetching {
public static void main(String[] args) throws Throwable {
	//Create object for fis class
	FileInputStream fis = new FileInputStream("C:\\Users\\Sayeed Khan\\eclipse-workspace\\Hero\\src\\Drivers\\Details.xlsx");
	//Use creata method
	Workbook wb = WorkbookFactory.create(fis);
	//print sayeed
	String data = wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println(data);
	//print Ahmed
	String data1 = wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
	System.out.println(data1);
	
}
}
