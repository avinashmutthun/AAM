package OrangeHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC4_deleteMultipleEmployee {

	public static void main(String[] args) throws InterruptedException {
		// int k;
		// for(k=1;k<=100;k++) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bobby\\Desktop\\webdrivers\\chromedriver.exe");
		ChromeDriver Driver = new ChromeDriver();

		Driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(Driver, 60);

		Actions Act = new Actions(Driver);

		Driver.get("http://apps.qaplanet.in/qahrm/login.php");
		WebElement objUN = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("txtUserName")));
		WebElement objPWD = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("txtPassword")));
		WebElement objLogin = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Submit")));

		String strUN = "qaplanet1";
		String strPWD = "lab1";
		objUN.clear();
		objUN.sendKeys(strUN);
		objPWD.clear();
		objPWD.sendKeys(strPWD);
		objLogin.click();

		Thread.sleep(1000);
		WebElement objCP = Driver.findElement(By.linkText("Change Password"));
		WebElement objLogout = Driver.findElement(By.linkText("Logout"));
		if (objCP.isDisplayed() && objLogout.isDisplayed()) {
			System.out.println("Change Password & logout are displayed");
			System.out.println("----------------------------------------------------");
		}

		WebElement objPIM = Driver.findElement(By.id("pim"));
		Act.moveToElement(objPIM).perform();
		Driver.findElement(By.linkText("Add Employee")).click();

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("rightMenu"));

		//String strEmpCode = Driver.findElement(By.name("txtEmployeeId")).getAttribute("value");

		if (Driver.findElement(By.xpath("//div[@class='mainHeading']/h2")).getText().equals("PIM : Add Employee")) {
			System.out.println("PIM : Add Employee displayed");
			System.out.println("----------------------------------------------------");
		}

		String sFN = "hello";
		String sLN = "everyone";

		WebElement objSave = Driver.findElement(By.id("btnEdit"));

		Driver.findElement(By.name("txtEmpLastName")).sendKeys(sLN);
		Driver.findElement(By.name("txtEmpFirstName")).sendKeys(sFN);

		objSave.click();

		Driver.switchTo().defaultContent();

		Act.moveToElement(objPIM).perform();
		Driver.findElement(By.linkText("Employee List")).click();

		Driver.switchTo().frame("rightMenu");

		Thread.sleep(3000);
		try {
			Driver.findElement(By.linkText("Last")).click();
			System.out.println("we are in last page");
			System.out.println("----------------------------------------------------");
		} catch (Exception e) {
			System.out.println("we are in first page");
			System.out.println("----------------------------------------------------");
		}

		List<WebElement> table = Driver.findElements(By.xpath("//table[@class='data-table']/tbody/tr"));
		int ts = table.size();
		System.out.println("Table Size is  "+ts);
		System.out.println("----------------------------------------------------");
		for (int i = 1; i <= ts; i++) {
			String namelist = Driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr[" + i + "]/td[3]"))
					.getText();

			if (namelist.contains("hello")) {
				System.out.println(namelist);
				System.out.println("----------------------------------------------------");
				Driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr[" + i + "]/td[1]/input")).click();
			}
		}

		Driver.findElement(By.xpath("//input[@value='Delete']")).click();
		Thread.sleep(2000);

		Driver.switchTo().defaultContent();
		Driver.close();
		Driver.quit();

	}

}