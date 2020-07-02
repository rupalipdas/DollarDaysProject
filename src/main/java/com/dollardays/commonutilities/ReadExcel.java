package com.dollardays.commonutilities;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	static XSSFWorkbook wb; // this is POI library reference to a work book
	static XSSFSheet sheet; // this is POI library reference to a sheet

	public static String getURL(String filePath, int Row, int Column, String Sheet) throws IOException {
		File src = new File(filePath);
		FileInputStream fis = new FileInputStream(src);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet(Sheet);
		String data = sheet.getRow(Row).getCell(Column).getStringCellValue();
		System.out.println("Value= " + data);
		return data;
	}

	public static void writeresult(String filePath, int Row, int Column, int Sheet, String Value) throws IOException {
		File src = new File(filePath);
		FileInputStream fis = new FileInputStream(src);
		wb = new XSSFWorkbook(fis);

		sheet = wb.getSheetAt(Sheet);
		// if(Sheet!=0)
		//sheet.createRow(Row);
		sheet.getRow(Row).createCell(Column).setCellValue(Value);
		// System.out.println("ROW###"+sheet.getRow(Row));

		FileOutputStream fout = new FileOutputStream(new File(filePath));
		wb.write(fout);
		System.out.println("Test Case Passed");

	}

	public static String getData(String filepath, int sheetnumber, int rownumber, int colnum) throws IOException {
		// System.out.println("Inside getData method");
		File src = new File(filepath);
		FileInputStream fis = new FileInputStream(src);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheetAt(sheetnumber);
		System.out.println("Column###" + colnum);
		String data = sheet.getRow(rownumber).getCell(colnum).getStringCellValue();
		
		List<List<String>> excelList = new ArrayList<>();
		for(int currentRow = 0; currentRow < 10; currentRow++) {
			List<String> tempList = new ArrayList<String>();
			for(int currentColumn = 0; currentColumn < 10; currentColumn++) {
				tempList.add(sheet.getRow(currentRow).getCell(currentColumn).getStringCellValue());
			}
			excelList.add(tempList);
		}
		return data;
	}

	public int getRowCount(int sheetIndex) {
		System.out.println("Inside getRowsCount method");
		int rowcount = wb.getSheetAt(sheetIndex).getLastRowNum();
		return rowcount;
	}

}
