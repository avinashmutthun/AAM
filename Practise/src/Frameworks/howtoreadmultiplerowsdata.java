package Frameworks;

import java.io.File;

import jxl.Sheet;
import jxl.Workbook;

public class howtoreadmultiplerowsdata {

	public static void main(String[] args) throws Exception {
		
		File excelsheet = new File(
				"C:\\Users\\bobby\\Desktop\\selenium dump\\PractiseExcel.xls");
		Workbook wb = Workbook.getWorkbook(excelsheet);
		Sheet s1 = wb.getSheet(1);
		
		int sheetrows=s1.getRows();
		System.out.println(sheetrows);
		
		for (int i=1;i<sheetrows;i++) 
		{
			String un=s1.getCell(0, i).getContents();
			String pwd=s1.getCell(1, i).getContents();
			System.out.println(un+" "+pwd);

		}
	}
}