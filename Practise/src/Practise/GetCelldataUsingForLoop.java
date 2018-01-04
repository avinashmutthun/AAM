package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class GetCelldataUsingForLoop {


	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bobby\\Desktop\\webdrivers\\chromedriver.exe");
		//Create object and it will launch browser
		ChromeDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(Driver, 60);
		//----------------------------------------------------
		//Open web site
		Driver.get("http://apps.qaplanet.in/WebApp/AssertXPath.html");
		//wait for AssertXPath
		wait.until(ExpectedConditions.titleIs("AssertXPath"));
		//--------------------------------------------------------
		//Get row count
		int rc=Driver.findElements(By.xpath("//table[@id='idCourse']/tbody/tr")).size();
		System.out.println("row count: "+rc);
		//Get column count
		int colc=Driver.findElements(By.xpath("//table[@id='idCourse']/tbody/tr[1]/td")).size();
		System.out.println("column count: "+colc);
		//Get cell count
		int cellc=Driver.findElements(By.xpath("//table[@id='idCourse']/tbody/tr/td")).size();
		System.out.println("cell count: "+cellc);				
		//---------------------------------------------------------
		for(int i=1;i<=rc;i++)
		{
			for(int j=1;j<=colc;j++)
			{
				//Get cell data
				String data=Driver.findElement(By.xpath("//table[@id='idCourse']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println(data);
			}
		}
		//------------------------------------------------------
		Driver.close();
		Driver.quit();
	}
}