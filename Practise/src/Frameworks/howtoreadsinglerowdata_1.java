package Frameworks;

import java.io.File;

import jxl.Sheet;
import jxl.Workbook;

public class howtoreadsinglerowdata_1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bobby\\Desktop\\webdrivers\\chromedriver.exe");
		
		File Excelsheet=new File("C:\\\\Users\\\\bobby\\\\Desktop\\\\selenium dump\\\\PractiseExcel.xls");
		Workbook wb=Workbook.getWorkbook(Excelsheet);
		Sheet S1=wb.getSheet(0);
		
		int i=1;
		
		String Brow=S1.getCell(0, i).getContents();
		String url=S1.getCell(1, i).getContents();
		
		System.out.println(Brow);
		System.out.println(url);
	}

}
