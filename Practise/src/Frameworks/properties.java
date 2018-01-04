package Frameworks;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
public class properties {
	public static void main(String[] args)throws Exception
	{
		Properties obj=new Properties();
		obj.load(new FileInputStream("C:\\Users\\bobby\\Desktop\\AAM\\Practise\\src\\Frameworks\\properties"));
		String strurl=obj.getProperty("URL");
		String strUN=obj.getProperty("username");
		String strPWD=obj.getProperty("password");	
		//************************************
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bobby\\Desktop\\webdrivers\\chromedriver.exe");
		
		//*************************************
		ChromeDriver Br=new ChromeDriver();
		Br.navigate().to(strurl);
		Thread.sleep(2000);
		Br.findElement(By.name("txtUserName")).clear();
		Br.findElement(By.name("txtUserName")).sendKeys(strUN);
		Br.findElement(By.name("txtPassword")).sendKeys(strPWD);
		Br.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		Br.findElement(By.linkText("Logout")).click();		
		Br.close();
		Br.quit();		
	}
}