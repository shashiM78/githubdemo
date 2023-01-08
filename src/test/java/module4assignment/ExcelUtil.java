package module4assignment;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	

		
	public ExcelUtil(String filepath, String sheetName) {
		// TODO Auto-generated constructor stub
		//String filepath  = "./src/test/java/Excelreadingconti/Testdata1.xlsx";
		 try {
			workbook = new XSSFWorkbook(filepath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    sheet = workbook.getSheet("sheet");
	    
	}

	public int  getrowCount() {
		return sheet.getPhysicalNumberOfRows();
	}
	public int  getcolCount() {
		return sheet.getRow(0).getLastCellNum();
	}
	public String  getCellData(int row, int col) {
		return sheet.getRow(row).getCell(col).getStringCellValue();
	}
	public Object[][] getData() {
		Object [][] data = new Object[getrowCount()][ getcolCount()];
		for (int row = 0; row<getrowCount();row++) {
	    	for(int col = 0; col<getcolCount(); col++) {
	    		data[row][col] = getCellData(row,col);
	    	}
	    	}
	    
		 return data;
	    
	}}

