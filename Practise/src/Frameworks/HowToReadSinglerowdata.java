package Frameworks;


import java.io.File;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
public class HowToReadSinglerowdata {

	public static void main(String args[]) throws Exception
	{
	/*	//To Take files as input, use file 
		File f1=new File("C:\\Users\\bobby\\Desktop\\selenium dump\\PractiseExcel.xls");
		//Load work book
		Workbook WB=Workbook.getWorkbook(f1);
		//Get specific sheet
		Sheet s1= WB.getSheet(0); 
		
		int i=1;
		//sheet.getCell(column index, row index)
		String gBrow=s1.getCell(0, i).getContents();			
		String gURL=s1.getCell(1, i).getContents();
		String gUN=s1.getCell(2, i).getContents();			
		String gPWD=s1.getCell(3, i).getContents();
		String gEMAIL=s1.getCell(4, i).getContents();	
		
		System.out.println(gBrow);		
		System.out.println(gURL);
		System.out.println(gUN);
		System.out.println(gPWD);
		System.out.println(gEMAIL);*/
		
		File File=new File("C:\\\\Users\\\\bobby\\\\Desktop\\\\selenium dump\\\\PractiseExcel.xls");
		Workbook objWB=Workbook.getWorkbook(File); 
		Sheet s1= objWB.getSheet(1); 
		//1- Means second sheet, index start from 0
		
		//Get row count
		int rows=s1.getRows();	
		System.out.println(rows);
		for (int i=0;i<rows;i++)
		{
			String un=s1.getCell(0, i).getContents();	
			String pwd=s1.getCell(1, i).getContents();	
			System.out.println(un+" "+pwd);			
		}
		
		
		
		/*WritableWorkbook wwb=Workbook.createWorkbook(new File("C:\\\\Users\\\\bobby\\\\Desktop\\\\selenium dump\\\\1234.xls"));
		WritableSheet ws=wwb.createSheet("HRM", 0);
		WritableSheet ws1=wwb.createSheet("RES", 1);
		Label l=new Label(0,0,"Username");
		Label l1=new Label(1,0,"password");	
		Label r1=new Label(0,1,"qaplanet");
		Label r2=new Label(1,1,"admin");
		ws.addCell(l);
		ws.addCell(l1);
		ws.addCell(r1);
		ws.addCell(r2);
		wwb.write();
		wwb.close();*/
		
		
		
		
		
		
		
		
		
		
		
		
	}
}