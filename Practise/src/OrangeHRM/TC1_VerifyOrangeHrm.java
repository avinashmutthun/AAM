package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1_VerifyOrangeHrm {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\bobby\\\\Desktop\\\\webdrivers\\\\chromedriver.exe");
		ChromeDriver Driver = new ChromeDriver();
		// Maximize browser
		Driver.manage().window().maximize();
		// ----------------------------------------------------------------------------
		// Open application
		Driver.get("http://apps.qaplanet.in/qahrm/login.php");
		// wait 2 sec
		Thread.sleep(2000);
		// Verify home page
		if (Driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
			System.out.println("Home Page displayed");
			System.out.println("----------------------------------------------------");
		} else {
			System.out.println("Failed to display home page");
			return;
		}
		// Create webelements for user name,password,login and clear
		WebElement objUN = Driver.findElement(By.name("txtUserName"));
		WebElement objPWD = Driver.findElement(By.name("txtPassword"));
		WebElement objLogin = Driver.findElement(By.name("Submit"));
		WebElement objClear = Driver.findElement(By.name("clear"));
		// --------------------------------------------------------------------------
		// Verify user name
		if (objUN.isDisplayed()) {
			System.out.println("user name displayed");
			System.out.println("----------------------------------------------------");
		} else {
			System.out.println("un not displayed");

		}
		// Verify password
		if (objPWD.isDisplayed()) {
			System.out.println("Password displayed");
			System.out.println("----------------------------------------------------");
		}
		// Verify login and clear
		if (objLogin.isDisplayed() && objClear.isDisplayed()) {
			System.out.println("Logoin and clear");
			System.out.println("----------------------------------------------------");
		}
		// ----------------------------------------------------------------------------------
		String strUN = "qaplanet1";
		String strPWD = "lab1";
		// --------------------------------------------------------------------------------
		// Enter user name
		objUN.clear();
		objUN.sendKeys(strUN);
		// Enter password
		objPWD.clear();
		objPWD.sendKeys(strPWD);
		// Click on login
		objLogin.click();
		// wait 2 sec
		Thread.sleep(2000);
		// Verify OrangeHRM
		if (Driver.getTitle().equals("OrangeHRM")) {
			System.out.println("OrangeHRM displayed");
			System.out.println("----------------------------------------------------");
		} else {
			System.out.println("Failed to login");
			return;
		}
		// ------------------------------------------------------------------------------
		// Get Welcome qaplanet1
		String sWelText = Driver.findElement(By.xpath("//ul[@id='option-menu']/li[1]")).getText();
		// Verify Welcome qaplanet1
		if (sWelText.equals("Welcome " + strUN)) {
			System.out.println("Welcome " + strUN + " displayed");
			System.out.println("----------------------------------------------------");
		}
		// Create web elements for change password and logout
		WebElement objCP = Driver.findElement(By.linkText("Change Password"));
		WebElement objLogout = Driver.findElement(By.linkText("Logout"));
		// Verify change password and logout
		if (objCP.isDisplayed() && objLogout.isDisplayed()) {
			System.out.println("change password and logout are displayed");
			System.out.println("----------------------------------------------------");
		}
		// ------------------------------------------------------------------------------
		// Click on Logout
		objLogout.click();
		Thread.sleep(2000);
		// Verify home page
		if (Driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
			System.out.println("Sign off sucessfull & Home Page displayed");
			System.out.println("----------------------------------------------------");
		}
		// -----------------------------------------------------------------------------
		Driver.close();
		Driver.quit();
	}
}
