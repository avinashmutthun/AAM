package Practise;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class GetCelldataUsingForEachLoop {

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

		//Get cell 
		List<WebElement> TDS=Driver.findElements(By.xpath("//table[@id='idCourse']/tbody/tr/td"));
		System.out.println("cell count: "+TDS.size());				
		//---------------------------------------------------------
		for(WebElement TD : TDS)
		{
			System.out.println(TD.getText());
		}
		//------------------------------------------------------
		Driver.close();
		Driver.quit();
	}
}

