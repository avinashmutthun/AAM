package Practise;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
//-------------------------------------------------
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//---------------------------------------------------------
public class AbstractWindowToolkit {

	public static WebDriver Driver;

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bobby\\Desktop\\webdrivers\\chromedriver.exe");
		ChromeDriver Driver = new ChromeDriver();

		Driver.manage().window().maximize();
		WebDriverWait wt = new WebDriverWait(Driver,30);
		Actions act = new Actions(Driver);		
		Driver.get("http://apps.qaplanet.in/qahrm/login.php");		
        wt.until(ExpectedConditions.titleIs("OrangeHRM - New Level of HR Management"));		
		WebElement objUN = Driver.findElement(By.name("txtUserName"));
		WebElement objPWD = Driver.findElement(By.name("txtPassword"));
		WebElement objLogin = Driver.findElement(By.name("Submit"));
		
		objUN.sendKeys("qaplanet1");
		objPWD.sendKeys("lab1");
		objLogin.click();
		wt.until(ExpectedConditions.titleIs("OrangeHRM"));
		WebElement objPIM = Driver.findElement(By.xpath("//*[@id='pim']/a"));
		
		act.moveToElement(objPIM).perform();
		
		for(int k=1;k<3;k++)
		{
			WebElement m1 = Driver.findElement(By.xpath("//*[@id='pim']/ul/li["+k+"]/a"));
			String st = m1.getText();
			System.out.println(st);	
			System.out.println("--------------------------------------------");
		}
		//Click on objAddemp
		WebElement objAddemp = Driver.findElement(By.xpath("//*[@id='pim']/ul/li[2]/a"));
		objAddemp.click();
		//wait for frame and switch to it
		wt.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("rightMenu"));
		Thread.sleep(5000);
		//***************************************************
		//Create object for robot class
		Robot rt = new Robot();	
		//click on photo file
		WebElement objBrowse = Driver.findElement(By.name("photofile"));		
		objBrowse.click();
		//Load image path/ any file 
	  StringSelection ss = new StringSelection("C:\\Users\\bobby\\Desktop\\csgo\\825902.jpg");
	  //Set image path to default window
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	  rt.delay(1000);

	//rt.keyPress(keycode);
	   rt.keyPress(KeyEvent.VK_CONTROL);    
	   rt.keyPress(KeyEvent.VK_V);
	   
	   rt.keyRelease(KeyEvent.VK_V); 
	  
	   rt.keyRelease(KeyEvent.VK_CONTROL);
	   rt.delay(2000);
	   rt.keyPress(KeyEvent.VK_ENTER);
	   rt.delay(1000);
	   rt.keyRelease(KeyEvent.VK_ENTER);
	   rt.delay(1000);
	   //**************************************************************
  
	}
}