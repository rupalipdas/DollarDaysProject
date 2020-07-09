package com.excelutility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
		XSSFWorkbook workbook;
		XSSFSheet sheet;
		XSSFCell cell;
		XSSFRow row;
	   File src;
		
		public Object[][] ReadData(String excelPath, String sheetName) throws IOException {
			//ReadData(string excelpath,String sheetname),so that we can pass that in our testcase.
			Object[][] data = null;
			FileInputStream finput = null; 
			
		    try { 
		     File src=new File(excelPath);
		     finput = new FileInputStream(src);
		     workbook = new XSSFWorkbook(finput);
		     sheet= workbook.getSheet(sheetName);
		    
		     
		    
		   
		    int rowcount = sheet.getLastRowNum();//gets rowcount
		    
			 int cellcount = sheet.getRow(0).getLastCellNum();//gets cellcount
			 data = new Object[rowcount][cellcount] ;
		    	    
		     for(int i=1; i<=rowcount ; i++)
		     {
		    	 for( int j =0 ;j<cellcount ;j++)
		         { 
		    		 cell = sheet.getRow(i).getCell(j); 
		             if(cell.getCellType()==CellType.STRING) {
		            	 data[i-1][j] = cell.getStringCellValue(); 
		             } else if(cell.getCellType()!=CellType.STRING) {
		            	 cell.setCellType(CellType.STRING);
		            	 data[i-1][j] = cell.getStringCellValue(); 
		             }
		    		
		             
		             // create cell  in  the excel.
		             FileOutputStream foutput=new FileOutputStream(src);
		            	 sheet.getRow(i+1).createCell(cellcount).setCellValue("Data imported"); 
		       	         workbook.write(foutput);
		                 finput.close();
		              
		           //foutput.close();   	               
		         }
		    	 }
		     }
		    	 catch(Exception e) {
		    		 e.printStackTrace();
		 	    	System.out.println(e.getMessage());
		 	    }
		    return data; 
		 }

		public Object[][] readData() {
			// TODO Auto-generated method stub
			return null;
		}

}
