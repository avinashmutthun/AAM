package Frameworks;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class DataDrivenFramework 
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bobby\\Desktop\\webdrivers\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,20);
		driver.get("http://apps.qaplanet.in/qahrm/login.php");
		
		//Getting input data from excel sheet
		
		File inputdata=new File("C:\\Users\\bobby\\Desktop\\selenium dump\\InputData.xls");
		Workbook wb=Workbook.getWorkbook(inputdata);
		Sheet s1=wb.getSheet(0);
		
		//Creating excel sheet to see result(pass or fail)
		
		WritableWorkbook outputdata=Workbook.createWorkbook(new File("C:\\Users\\bobby\\Desktop\\selenium dump\\OutputData.xls"));
		WritableSheet Result=outputdata.createSheet("Result", 0);
		
		Label un=new Label(3, 0, "UserName");
		Label pwd=new Label(5, 0, "Password");
		Label result= new Label(7,0, "Result");
		
		Result.addCell(un);
		Result.addCell(pwd);
		Result.addCell(result);
		
		int rc=s1.getRows();
		System.out.println(rc);
		
		
		for(int i=1;i<rc;i++)
		{
			WebElement objun = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("txtUserName")));
			objun.clear();
			objun.sendKeys(s1.getCell(1, i).getContents());
				
			
			WebElement objpwd = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("txtPassword")));
			objpwd.clear();
			objpwd.sendKeys(s1.getCell(4, i).getContents());	
				
			
			WebElement objlogin = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Submit")));
			objlogin.click();
				
				Thread.sleep(1000);
				
				String res = "Passed";
				String res1 = "Failed";
				
				if(driver.getTitle().equals("OrangeHRM"))
				{
					System.out.println("Login Successful");
					Label r1=new Label(3,i,s1.getCell(1,i).getContents());
					Label r2= new Label(5,i,s1.getCell(4,i).getContents());
					Label r3= new Label(7,i,res);
					Result.addCell(r1);
					Result.addCell(r2);
					Result.addCell(r3);
					driver.findElement(By.linkText("Logout")).click();
					Thread.sleep(4000);
				}
				else {
					System.out.println("Login Fail");
					Label r4=new Label(3,i,s1.getCell(1,i).getContents());
					Label r5= new Label(5,i,s1.getCell(4,i).getContents());
					Label r6= new Label(7,i,res1);
					Result.addCell(r4);
					Result.addCell(r5);
					Result.addCell(r6);
					driver.findElement(By.name("clear")).click();
					Thread.sleep(4000);
				}
		}
		outputdata.write();
		outputdata.close();
		driver.close();
		driver.quit();
		
		
		
		
	}

}
