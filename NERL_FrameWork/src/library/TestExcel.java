package library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class TestExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:/Users/gauravn/workspace/Test/TestData/TestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet  = workbook.getSheetAt(1);
		int Benf_Row = sheet.getLastRowNum();
		System.out.println("Row count for Benf Exls File is " +Benf_Row);
		
	}

}
