package dataprovider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Testutil {
	FileInputStream fis;
	Sheet sheet;
	XSSFWorkbook wb;
public Object[][] getData(String filename, String sheetname)
{
	
	try {
		fis = new FileInputStream(filename);
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	try {
		wb = new XSSFWorkbook(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	sheet = wb.getSheet(sheetname);
	Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
	for (int i = 0;i<sheet.getLastRowNum();i++)
	{
		for (int j = 0;j<sheet.getRow(0).getLastCellNum();j++)
		{
			data[i][j] = sheet.getRow(i+1).getCell(j).toString();
		}
	}
	return data;
	
}
}
