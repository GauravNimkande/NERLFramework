package library;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldataconfig {
	private XSSFWorkbook workbook;
	private XSSFSheet sheet;
	private String excelPath;
	private int sheetId;
	

	public XSSFWorkbook getWorkbook() throws IOException {
		FileInputStream fis = new FileInputStream(excelPath);
		workbook = new XSSFWorkbook(fis);
		return workbook;
	}

	public XSSFSheet getSheet() throws IOException {
		sheet  = getWorkbook().getSheetAt(sheetId);
		
		return sheet;
	}
	
	public String getExcelPath() {
		return excelPath;
	}
	public void setExcelPath(String excelPath) {
		this.excelPath = excelPath;
	}
	
	public int getSheetId() {
		return sheetId;
	}
	public void setSheetId(int sheetId) {
		this.sheetId = sheetId;
	}

	public Object getdata(int sheetnumber,int row,int column){
		
		 String USer=null;
		 if(sheet.getRow(row).getCell(column).getCellTypeEnum()==CellType.STRING){
			 USer=sheet.getRow(row).getCell(column).getStringCellValue();
		 }else if(sheet.getRow(row).getCell(column).getCellTypeEnum()==CellType.NUMERIC){
			 USer=String.valueOf((int)sheet.getRow(row).getCell(column).getNumericCellValue());
		 }
		  return USer; 
		 }
	 
		 
	public int  getrowcount(int sheetindex) throws IOException{
		 int row = getSheet().getLastRowNum(); 
		row=row+1;
		return row;
		
	 }
	 
	 public int  getcolumn(int sheetindex) throws IOException{
		 int row = getSheet().getLastRowNum();
		 int Column=sheet.getRow(row).getLastCellNum();	 
		 
		 System.out.println("Column index is: "+Column);
		 
		return Column;
		
	 }
	 
	 
	public void WriteExcel(String EWR_Number,int Record_Number,int Cell_No) throws IOException{
		
		
		//Exceldataconfig AB=new Exceldataconfig();
		
		int Benf_Row=getrowcount(1);
//		FileInputStream fis = new FileInputStream(excelPath);
//		XSSFWorkbook workbook = new XSSFWorkbook(fis);
//		XSSFSheet sheet  = workbook.getSheetAt(sheetId);
//		int Benf_Row = sheet.getLastRowNum();
		sheet.getRow(Record_Number).createCell(Cell_No).setCellValue(EWR_Number);
		      
		      FileOutputStream Fout=new FileOutputStream("D:/TestData.xlsx");
		     
	   workbook.write(Fout);
	   workbook.close();
	 }
	
	
	public Object[][] Excel_Data_Reader(int SheetID) throws IOException{
		setExcelPath("D:/TestData.xlsx");
		setSheetId(SheetID);
		int rows=getrowcount(SheetID);
		int Column=getcolumn(SheetID);
		
		 Object[][] data=new Object[rows-1][Column+1];
		  
		    for(int i=1; i< rows;i++){
		    	
		    	for(int j=0; j<Column;j++)
		    	{	
		    		data[i-1][j]=getdata(SheetID,i, j);
		    		System.out.print(data[i-1][j]+" : ");
		    		
		    	}

		    	data[i-1][Column]=i; 
		    	System.out.println();
	}
		    return data; 
}
	
	
	public Object[][] Excel_ExchangeData_Reader(int SheetID) throws IOException{
		setExcelPath("D:/TestDataExchange.xlsx");
		setSheetId(SheetID);
		int rows=getrowcount(SheetID);
		int Column=getcolumn(SheetID);
		
		 Object[][] data=new Object[rows-1][Column+1];
		  
		    for(int i=1; i< rows;i++){
		    	
		    	for(int j=0; j<Column;j++)
		    	{
		    		data[i-1][j]=getdata(SheetID, i, j);
		    		System.out.print(data[i-1][j]+" : ");
		    		
		    	}
		    	data[i-1][Column]=i; 
		    	System.out.println();
	}
		    return data; 
}
	
}