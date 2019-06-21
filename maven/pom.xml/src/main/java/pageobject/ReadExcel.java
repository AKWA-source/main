package pageobject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	XSSFWorkbook wb;
	XSSFSheet sh ;

	public ReadExcel(String excelpath) throws Exception {
		//File src = new File("./com.maven.selenium/src/main/resources/Data.xlsx");
		
		File src = new File(excelpath);
		
		FileInputStream f = new FileInputStream(src);
		
		 wb = new XSSFWorkbook(f);
		
	
		
	}
	

	public String getData(String sheetName, int row, int coloumn) {
		sh = wb.getSheet(sheetName);
		String data = sh.getRow(row).getCell(coloumn).getStringCellValue();
		
		return data;
	}

	

}
