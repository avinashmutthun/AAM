package practise1;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class nestedalertshandling 
{
	public static void main(String[] args)throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\bobby\\\\Desktop\\\\webdrivers\\\\geckodriver.exe");
		FirefoxDriver Browser=new FirefoxDriver();
		//Explicit wait
		WebDriverWait wait=new WebDriverWait(Browser, 20);
		Thread.sleep(4000);
		//open web page
		Browser.get("http://apps.qaplanet.in/WebApp/NestedAlerts.html");
		Thread.sleep(4000);
		//wait for element present
		WebElement objSubmit=wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Submit")));
		Thread.sleep(4000);
		//Choose answer
		Browser.findElement(By.xpath("//input[@name='rdoPres'][4]")).click();
		Thread.sleep(4000);
		//click on submit
		objSubmit.click();
		//wait for confirmation message alert
		Thread.sleep(4000);
		Alert A=wait.until(ExpectedConditions.alertIsPresent());		
		if (A.getText().equals("Are you sure you want to submit this answer?"))
		{
			System.out.println("Confirmation displayed");
			
			A.accept();
			Thread.sleep(4000);
			//wait for alert
			Alert A1=wait.until(ExpectedConditions.alertIsPresent());
			if(A1.getText().equals("submitted"))
			{
				System.out.println("submitted displayed");
				
				A1.accept();
			}
		}
		Browser.close();
		Browser.quit();
	}
}
