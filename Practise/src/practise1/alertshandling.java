package practise1;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alertshandling 
{
	public static void main(String[] args)throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\bobby\\\\Desktop\\\\webdrivers\\\\geckodriver.exe");
		FirefoxDriver Driver=new FirefoxDriver();
		WebDriverWait wait=new WebDriverWait(Driver, 60);
		//------------------------------------------------------
		//open application
		Driver.get("http://apps.qaplanet.in/WebApp/AgeProb.html");
		Thread.sleep(4000);
		//wait for home page
		boolean res=wait.until(ExpectedConditions.titleIs("Age Problem"));
		Thread.sleep(4000);
		//verify Age Problem
		if(res)
		{
			System.out.println("Age Problem displayed");
		}
		Thread.sleep(4000);
		//-----------------------------------------------------------
		//Enter age
		Driver.findElement(By.id("idAge")).sendKeys("10");
		Thread.sleep(4000);
		//Click on submit
		Driver.findElement(By.id("idSubGo")).click();
		Thread.sleep(4000);
		//--------------------------------------------------------
		//wait for alert
		wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(4000);
		//Switch to alert
		Alert A=Driver.switchTo().alert();
		//Verify Kid message
		if(A.getText().equals("Kid"))
		{
			System.out.println("Kid alert displayed");
			A.accept();
		}
		Thread.sleep(4000);
		//------------------------------------------------------------
		Driver.close();
		Driver.quit();
	}
}
