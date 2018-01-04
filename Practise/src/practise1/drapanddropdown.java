package practise1;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class drapanddropdown {
	public static void main(String[] args)throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bobby\\Desktop\\webdrivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,30);
		Actions act=new Actions(driver);
		String url=("https://dhtmlx.com/docs/products/dhtmlxTree/");
		driver.get(url);
		wait.until(ExpectedConditions.titleIs("JavaScript Tree Menu - Ajax TreeView - dhtmlxTree"));
		Thread.sleep(3000);
		
	
		//Take xpath of thriller from first box
		WebElement from=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='treebox1']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span")));
		//Take xpath of horror from first box                                        
		WebElement to=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='treebox2']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[3]/td[2]/table/tbody/tr[1]/td[4]/span")));
		                                                                                
		//way 1
		
		//act.clickAndHold(from).perform();
		//act.moveToElement(to).perform();
		//act.click(to).perform();
		//Thread.sleep(4000);
		
		
		//way 2
		//Action dragdrop=act.clickAndHold(from).moveToElement(to).click(to).build();
		//dragdrop.perform();
		//Thread.sleep(4000);
		
		
		//way 3
		//act.dragAndDrop(from,to).perform();
		//Thread.sleep(4000);
		
		//way 4
		
		org.openqa.selenium.Point objfrm=from.getLocation();
		int frmx=objfrm.getX();
		int frmy=objfrm.getY();
		
		
		org.openqa.selenium.Point objto=to.getLocation();
		int tox=objfrm.getX();
		int toy=objfrm.getY();
		
		//act.dragAndHold(from,tox,toy).perform();
		
		act.clickAndHold(from).perform();
		act.moveToElement(to).moveByOffset(tox, toy).perform();
		act.release(to).perform();
		Thread.sleep(6000);
		
		
		
		
		
		
		
		
	}

}
