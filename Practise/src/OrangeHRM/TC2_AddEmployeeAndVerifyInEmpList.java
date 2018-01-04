package OrangeHRM;
import java.awt.Robot;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC2_AddEmployeeAndVerifyInEmpList {

	public static void main(String[] args) throws Exception {
		for (int a = 1; a <= 10; a++) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\bobby\\Desktop\\webdrivers\\chromedriver.exe");
			ChromeDriver Driver = new ChromeDriver();
			// Maximize browser
			Driver.manage().window().maximize();
			// Explict wait object
			WebDriverWait wait = new WebDriverWait(Driver, 60);
			// ----------------------------------------------------
			Actions Act = new Actions(Driver);
			// ----------------------------------------------------------
			// Open HRM web page
			Driver.get("http://apps.qaplanet.in/qahrm/login.php");
			// wait for home page
			if (wait.until(ExpectedConditions.titleIs("OrangeHRM - New Level of HR Management"))) {
				System.out.println("Home page displayed");
				System.out.println("----------------------------------------------------");
			} else {
				System.out.println("Failed to open home page");
				return;
			}
			// -----------------------------------------------------------------
			/*
			 * Naming standards obj -- for objects/elements f --- float value i --- integer
			 * bln--- boolean str --- for strings
			 */
			// --------------------------------------------------------------------
			// Create web element
			WebElement objUN = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("txtUserName")));
			WebElement objPWD = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("txtPassword")));
			WebElement objLogin = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Submit")));
			WebElement objClear = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("clear")));
			
			// ------------------------------------------------------------------
			// Verify usre name
			if (objUN.isDisplayed()) {
				System.out.println("User name displayed");
				System.out.println("----------------------------------------------------");
			}
			// Verify password
			if (objPWD.isDisplayed()) {
				System.out.println("Password displayed");
				System.out.println("----------------------------------------------------");
			}
			// Verify login and clear
			if (objLogin.isDisplayed() && objClear.isDisplayed()) {
				System.out.println("Login and clear buttons are displayed");
				System.out.println("----------------------------------------------------");
			}
			// -----------------------------------------------------------------------
			String strUN = "qaplanet1";
			String strPWD = "lab1";
			// -----------------------------------------------------------------------

			// Login to orangeHRM
			objUN.clear();
			objUN.sendKeys(strUN);
			objPWD.clear();
			objPWD.sendKeys(strPWD);
			objLogin.click();

			// Wait for OrangeHRM page and verify
			if (wait.until(ExpectedConditions.titleIs("OrangeHRM"))) {
				System.out.println("OrangeHRM page displayed");
				System.out.println("----------------------------------------------------");
			} else {
				System.out.println("Failed to login");
				return;
			}

			// Get welcome text
			String welText = Driver.findElement(By.xpath("//ul[@id='option-menu']/li[1]")).getText();

			// Verify welcome text
			if (welText.equals("Welcome " + strUN)) {
				System.out.println("Welcome " + strUN + " displayed");
				System.out.println("----------------------------------------------------");
			}

			// Way 2: Verify only user name
			String[] strArr = welText.split(" ");
			if (strArr[1].equals(strUN)) {
				System.out.println(strUN + " displayed");
				System.out.println("----------------------------------------------------");
			}

			// Create webelements for Change Password & logout
			WebElement objCP = Driver.findElement(By.linkText("Change Password"));
			WebElement objLogout = Driver.findElement(By.linkText("Logout"));

			// Verify Change Password & logout
			if (objCP.isDisplayed() && objLogout.isDisplayed()) {
				System.out.println("Change Password & logout are displayed");
				System.out.println("----------------------------------------------------");
			}

			// Create webelement for PIM
			WebElement objPIM = Driver.findElement(By.id("pim"));

			// Mouse over on PIM
			Act.moveToElement(objPIM).perform();

			// Click on add mployee
			Driver.findElement(By.linkText("Add Employee")).click();

			// wait for frame and switch to it
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("rightMenu"));

			// Verify PIM : Add Employee
			if (Driver.findElement(By.xpath("//div[@class='mainHeading']/h2")).getText().equals("PIM : Add Employee")) {
				System.out.println("PIM : Add Employee displayed");
				System.out.println("----------------------------------------------------");
			}

			// ----------------------------------------------------------------------
			String sFN = "hello";
			String sLN = "everyone";
			// -----------------------------------------------------------------------

			// Get employee code
			String strEmpCode = Driver.findElement(By.name("txtEmployeeId")).getAttribute("value");

			// Create webelement
			WebElement objSave = Driver.findElement(By.id("btnEdit"));

			// Click on save
			objSave.click();

			// wait for alert displayed
			Alert A = wait.until(ExpectedConditions.alertIsPresent());

			// Verfiy Last Name Empty!message
			if (A.getText().equals("Last Name Empty!")) {
				System.out.println("Last Name Empty! displayed");
				System.out.println("----------------------------------------------------");
				A.accept();

				// Enter last name
				Driver.findElement(By.name("txtEmpLastName")).sendKeys(sLN);
			}
			// ---------------------------------------------------------------------------
			Runtime.getRuntime().exec("C:\\Users\\bobby\\Downloads\\File.exe");
			// Click on save
			objSave.click();

			// wait for alert displayed
			Alert A1 = wait.until(ExpectedConditions.alertIsPresent());

			// Verfiy First Name Empty!message
			if (A1.getText().equals("First Name Empty!")) {
				System.out.println("First Name Empty! displayed");
				System.out.println("----------------------------------------------------");
				A1.accept();

				// Enter last name
				Driver.findElement(By.name("txtEmpFirstName")).sendKeys(sFN);
			}
			
			
			// Click on save
			objSave.click();

			// wait for Personal Details and verify
			if (wait.until(ExpectedConditions
					.textToBePresentInElementLocated(By.xpath("//div[@class='mainHeading']/h2"), "Personal Details"))) {
				System.out.println("Personal Details displayed");
				System.out.println("----------------------------------------------------");
			}

			// go to top frame
			Driver.switchTo().parentFrame();
			// ---------------------------------------------------------------------

			// Mouse over on PIM
			Act.moveToElement(objPIM).perform();

			// Click on Employee List
			Driver.findElement(By.linkText("Employee List")).click();

			// wait for frame and switch to it
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("rightMenu"));

			// Verify Employee Information
			if (Driver.findElement(By.xpath("//div[@class='mainHeading']/h2")).getText()
					.equals("Employee Information")) {
				System.out.println("Employee Information");
				System.out.println("----------------------------------------------------");
			}
			// -----------------------------------------------------------------------------

			// Get row count
			int rc = Driver.findElements(By.xpath("//table[@class='data-table']/tbody/tr")).size();
			int i;
			for (i = 1; i <= rc; i++) {

				// Get second column data
				String strEmpID = Driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr[" + i + "]/td"))
						.getText();

				// Get third column data
				String strEmpName = Driver
						.findElement(By.xpath("//table[@class='data-table']/tbody/tr[" + i + "]/td[3]/a")).getText();

				if (strEmpCode.equals(strEmpID) && strEmpName.equals(sFN + " " + sLN)) {
					System.out.println(strEmpCode + " , " + strEmpName + " displayed at: " + i);
					System.out.println("----------------------------------------------------");
					break;
				}
			}
			// ----------------------------------------------------------------------------

			// Way 2:
			String strEmpName_Sibling = Driver
					.findElement(By.xpath("//table[@class='data-table']/descendant::td[contains(text()," + strEmpCode
							+ ")]/following-sibling::td/a"))
					.getText();
			if (strEmpName_Sibling.equals(sFN + " " + sLN)) {
				System.out.println(strEmpName_Sibling + strEmpCode + " displayed");
				System.out.println("----------------------------------------------------");
			}
			// ---------------------------------------------------------------

			// Switch to default content
			Driver.switchTo().defaultContent();
			// -------------------------------------------------------------------

			// Click on logout
			objLogout.click();

			// Verify home page
			if (wait.until(ExpectedConditions.titleIs("OrangeHRM - New Level of HR Management"))) {
				System.out.println("Signoff sucessfull & Home page displayed");
				System.out.println("----------------------------------------------------");
			} else {
				System.out.println("Failed to Signoff");
				return;
			}
			// -----------------------------------------------------------------------------
			Driver.close();
			Driver.quit();
		}
	}
}