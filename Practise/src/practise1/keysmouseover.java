package practise1;


import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class keysmouseover {
    
	public static void main(String[] args)throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\bobby\\Desktop\\webdrivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://apps.qaplanet.in/qahrm/login.php");
		WebElement UN=driver.findElement(By.name("txtUserName"));
		UN.sendKeys("avinash");
		UN.click();
		UN.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		Thread.sleep(1000);
		UN.sendKeys(Keys.DELETE);
		Thread.sleep(1000);
		UN.sendKeys("qaplanet1");
		Thread.sleep(1000);
		driver.findElement(By.name("txtPassword")).sendKeys("lab1");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(1000);
		//**********************
		Actions b=new Actions(driver);
		WebElement pim=driver.findElement(By.id("pim"));
		b.moveToElement(pim).perform();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Add Employee")).click();
		Thread.sleep(1000);
	
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.id("txtEmpLastName")).sendKeys("Avinash");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Bobby");
		driver.switchTo().defaultContent();
	
	
	
		driver.findElement(By.xpath("//*[@id='option-menu']/li[3]/a")).click();
		Thread.sleep(1000);
		driver.close();
		driver.quit();
		}

}
