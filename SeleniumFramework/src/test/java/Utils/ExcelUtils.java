package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static String projectpath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	//creating constructor for reference
	public ExcelUtils(String excelPath, String sheetName){
		try {
		projectpath = System.getProperty("user.dir");
		workbook = new XSSFWorkbook(excelPath);
		sheet = workbook.getSheet(sheetName);
		}catch(Exception exp)
		{
			exp.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		getRowCount();
		getColCount();
		getCellDataString(0,0);
		getCellDataNumber(1,1);

	}
	
	public static int getRowCount()
	{
		int rowCount = 0;
		try
		{
			rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("Number of row count:  "+rowCount);
			
		}catch(Exception exp)
		{
			exp.getMessage();
			exp.getCause();
		}
		return rowCount;
	}
	
	public static int getColCount()
	{
		int colCount = 0;
		try
		{
			colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("Number of col count:  "+colCount);
			
		}catch(Exception exp)
		{
			exp.getMessage();
			exp.getCause();
		}
		return colCount;
	}
	public static String getCellDataString(int rownum, int colnum)
	{
		String cellData = null;
		try {
		cellData = sheet.getRow(rownum).getCell(colnum).getStringCellValue();
		System.out.println("cellData is :  "+cellData);
		
		}catch(Exception exp)
		{
			exp.getMessage();
			exp.getCause();
			exp.printStackTrace();
		}
		return cellData;
	}
		
	public static void getCellDataNumber(int rowNum, int colNum)
	{
		try {
			Double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println("cellData for numeric is :  "+cellData);
			
			}catch(Exception exp)
			{
				exp.getMessage();
				exp.getCause();
				exp.printStackTrace();
			}
	}
	

}
