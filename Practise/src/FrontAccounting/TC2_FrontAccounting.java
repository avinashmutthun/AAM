package FrontAccounting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC2_FrontAccounting {
	public static void main(String[] args)throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\bobby\\\\Desktop\\\\webdrivers\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,60);
		driver.get("http://apps.qaplanet.in/erp");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		if(wait.until(ExpectedConditions.titleContains("Login")))
		{
			System.out.println("1st Page Displayed");
		}
		else
		{
			System.out.println("1st Page not Displayed");
			return;
		}
WebElement lnktxt=wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("FrontAccounting")));		
WebElement objun=wait.until(ExpectedConditions.presenceOfElementLocated(By.name("user_name_entry_field")));
WebElement objpwd=wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
WebElement objlogin=wait.until(ExpectedConditions.presenceOfElementLocated(By.name("SubmitUser")));

if(lnktxt.isDisplayed())
{
	System.out.println("Front Accounting is Displayed");
}

if(objun.isDisplayed())
{
	System.out.println("un displayed");
}

if(objpwd.isDisplayed() && objlogin.isDisplayed())
{
	System.out.println("pwd and login displayed");
}
	
		String strun="qaplanet1";
		String strpwd="lab1";
		
		objun.clear();
		objun.sendKeys(strun);
		objpwd.clear();
		objpwd.sendKeys(strpwd);
		objlogin.click();
		
		
Thread.sleep(4000);		
driver.close();
driver.quit();				
		
}}
