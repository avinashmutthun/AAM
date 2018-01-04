package practise1;


import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


public class keys {
    
	public static void main(String[] args)throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\bobby\\Desktop\\webdrivers\\geckodriver.exe");
		FirefoxDriver x=new FirefoxDriver();
		x.manage().window().maximize();
		x.get("http://apps.qaplanet.in/erp");
		WebElement a=x.findElement(By.name("user_name_entry_field"));
		a.sendKeys("avinash");
		a.click();
		//************************************
		a.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		Thread.sleep(2000);
		//************************************
		a.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		a.sendKeys("qaplanet1");
		Thread.sleep(2000);
		x.findElement(By.name("password")).sendKeys("lab1");
		x.findElement(By.name("SubmitUser")).click();
		Thread.sleep(2000);
		x.findElementByXPath("html/body/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table[2]/tbody/tr/td[3]/a[5]").click();
		Thread.sleep(2000);
		x.close();
		x.quit();
		}

}
