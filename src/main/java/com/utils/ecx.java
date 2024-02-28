package com.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.base.TestBase;

public class ecx extends TestBase {
	
public static String[][] setdata(String sheetname) throws Throwable{
		
		File f=new File("C:\\Users\\SRI\\eclipse-workspace\\Hrms\\src\\main\\java\\com\\testdata\\credentials.xlsx");
		FileInputStream stream=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(stream);
		XSSFSheet sh=wb.getSheet(sheetname);
		
		
		int r= sh.getPhysicalNumberOfRows();
		int c=sh.getRow(1).getLastCellNum();
		
		String[][] data= new String[r-1][c];
		
		for(int i=0;i<r-1;i++) {
			for(int j=0;j<c;j++) {
				
				DataFormatter df=new DataFormatter();
				data[i][j] = df.formatCellValue(sh.getRow(i+1).getCell(j));
			}
		}
		
		return data;
	}
	

}
