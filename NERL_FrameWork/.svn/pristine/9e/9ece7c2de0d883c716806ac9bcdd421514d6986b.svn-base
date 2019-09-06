package withdrawal_pkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//import com.gargoylesoftware.htmlunit.javascript.host.Iterator;

public class ReadExcel {
	static XSSFRow row;
	public static void main(String[] args) throws IOException{
 //I have placed an excel file 'Test.xlsx' 
					FileInputStream fis = new FileInputStream("C:/Users/pavank/Desktop/selenium/Test.xlsx");
					XSSFWorkbook workbook = new XSSFWorkbook(fis);
					XSSFSheet sheet = workbook.getSheetAt(0);
					
					
		                      
					String FirstCell=sheet.getRow(1).getCell(0).getStringCellValue();
					String SecondCell=sheet.getRow(1).getCell(1).getStringCellValue();
					
					 String ThirdCell=sheet.getRow(2).getCell(0).getStringCellValue();
					 String ThirdCell1=sheet.getRow(2).getCell(1).getStringCellValue();
					 String FourthCell=sheet.getRow(3).getCell(0).getStringCellValue();
					 String FourthCell1=sheet.getRow(3).getCell(1).getStringCellValue();
					String FifthCell=sheet.getRow(4).getCell(0).getStringCellValue();
					 String FifthCell1=sheet.getRow(4).getCell(1).getStringCellValue();
					
					System.out.println(FirstCell+" "+SecondCell+" "+ThirdCell+" "+ThirdCell1+" "+ FourthCell+" "+FourthCell1+" "+FifthCell+" "+FifthCell1+" ");
										
			}		
		
	}
