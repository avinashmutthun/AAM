package practise1;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class geckodriver {
	public static void main(String[] args)throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\bobby\\Desktop\\webdrivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://apps.qaplanet.in/erp");
		driver.findElement(By.name("user_name_entry_field")).sendKeys("qaplanet1");
		driver.findElement(By.name("password")).sendKeys("lab1");
		driver.findElement(By.name("SubmitUser")).click();
		Thread.sleep(2000);
		driver.findElementByXPath("html/body/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table[2]/tbody/tr/td[3]/a[5]").click();
		driver.quit();
	
		}

}
