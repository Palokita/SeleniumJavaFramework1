package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataUtils {
	
	static String projectpath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public static void main(String[] args) {
		getRowCount();
		getCellDataString(0,0);
		getCellDataNumber(1,1);

	}
	
	public static void getRowCount()
	{
		try
		{
			projectpath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectpath+"/excel/data.xlsx");
			sheet = workbook.getSheet("Sheet1");
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("Number of row count:  "+rowCount);
			
		}catch(Exception exp)
		{
			exp.printStackTrace();
			}
	}
	public static void getCellDataString(int rownum, int colnum)
	{
		try {
		projectpath = System.getProperty("user.dir");
		workbook = new XSSFWorkbook(projectpath+"/excel/data.xlsx");
		sheet = workbook.getSheet("Sheet1");
		String cellData = sheet.getRow(rownum).getCell(colnum).getStringCellValue();
		System.out.println("cellData is :  "+cellData);
		
		}catch(Exception exp)
		{
			exp.getMessage();
			exp.getCause();
			exp.printStackTrace();
			
		}
	}
		
	public static void getCellDataNumber(int rowNum, int colNum)
	{
		try {
			projectpath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectpath+"/excel/data.xlsx");
			sheet = workbook.getSheet("Sheet1");
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
