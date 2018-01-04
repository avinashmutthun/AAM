package Frameworks;

import java.io.File;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class howtocreateExcelsheet {
	
	public static void main(String[] args) throws Exception{
		
		
		File f1=new File("C:\\Users\\bobby\\Desktop\\selenium dump\\CreateExcelSheet.xls");
		WritableWorkbook wb=Workbook.createWorkbook(f1);
		WritableSheet ws=wb.createSheet("Alphabets",0);
		WritableSheet ws1=wb.createSheet("Numbers", 1);
		
		Label l1=new Label(1,2,"LETTERS");
		Label l2=new Label(1,4,"NUMBERS");
		
		Label l3=new Label(1,2,"LET");
		Label l4=new Label(1,4,"NUMB");
		ws1.addCell(l1);
		ws1.addCell(l2);
		
		ws.addCell(l3);
		ws.addCell(l4);
		
		
		
		wb.write();
		wb.close();
		
	}

}
