package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class verifyqaplanet
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\bobby\\\\Desktop\\\\webdrivers\\\\chromedriver.exe");
		ChromeDriver Driver=new ChromeDriver();
		//Maximize browser
		Driver.manage().window().maximize();
		//----------------------------------------------------------------------------
		//Open application
		Driver.get("http://apps.qaplanet.in/erp");
		//wait 2 sec
		Thread.sleep(2000);
		//Verify home page 
		if(Driver.getTitle().equals("FrontAccounting 2.4.2 - Login"))
		{
			System.out.println("Home Page displayed");
		}
		else
		{
			System.out.println("Failed to display home page");
			return;
		}
		//Create webelements for user name,password,login and clear
		WebElement objUN=Driver.findElement(By.name("user_name_entry_field"));
		WebElement objPWD=Driver.findElement(By.name("password"));
		WebElement objLogin=Driver.findElement(By.name("SubmitUser"));

		//--------------------------------------------------------------------------
		//Verify user name
		if(objUN.isDisplayed())
		{
			System.out.println("user name displayed");
		}
		//Verify password
		if(objPWD.isDisplayed())
		{
			System.out.println("Password displayed");
		}
		//Verify login and clear
		if(objLogin.isDisplayed())
		{
			System.out.println("Login");
		}
		//----------------------------------------------------------------------------------
		String strUN="qaplanet1";
		String strPWD="lab1";
		//--------------------------------------------------------------------------------
		//Enter user name
		objUN.clear();
		objUN.sendKeys(strUN);
		//Enter password
		objPWD.clear();
		objPWD.sendKeys(strPWD);
		//Click on login
		objLogin.click();
		//wait 2 sec
		Thread.sleep(2000);
		//Verify OrangeHRM
		if(Driver.getTitle().equals("Main Menu"))
		{
			System.out.println("Qaplanet displayed");
		}			
		else
		{
			System.out.println("Failed to login");
			return;
		}
		
		
		//------------------------------------------------------------------------------
		//Get Welcome qaplanet1
		String sWelText=Driver.findElement(By.xpath("html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/table/tbody/tr/td/table[2]/tbody/tr[1]/td[1]")).getText();
		//Verify Welcome qaplanet1
		if(sWelText.equals("Welcome "+strUN))
		{
			System.out.println("Welcome "+strUN+" displayed");
		}
		
		
		//Create web elements for change password and logout
		WebElement objCP=Driver.findElement(By.xpath("html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/table/tbody/tr/td/table[2]/tbody/tr[1]/td[1]"));
		WebElement objLogout=Driver.findElement(By.xpath("html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/table/tbody/tr/td/table[2]/tbody/tr[1]/td[3]/a[5]"));
		//Verify change password and logout
		if(objCP.isDisplayed() && objLogout.isDisplayed())
		{
			System.out.println("change password and logout are displayed");
		}
		//------------------------------------------------------------------------------
		//Click on Logout
		objLogout.click();
		Thread.sleep(2000);
		//Verify home page 
		if(Driver.getTitle().equals("FrontAccounting 2.4.2 - Login"))
		{
			System.out.println("Sign off sucessfull & Home Page displayed");
		}
		//-----------------------------------------------------------------------------
		Driver.close();
		Driver.quit();		
	}
}
