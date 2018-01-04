package OrangeHRM;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC13_EditJobSpecification {
	public static void main(String[] args) throws InterruptedException {

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

		// -----------------------------------------------------------
		// Mouse Over 1st Time

		WebElement Admin = Driver.findElement(By.id("admin"));
		Act.moveToElement(Admin).perform();
		String Al = Admin.getText();
		if (Al.contains("Admin")) {
			System.out.println("admin displayed");
			System.out.println("----------------------------------------------------");
		} else {
			System.out.println("admin not displayed");
		}

		WebElement CompanyInfo = Driver.findElement(By.linkText("Company Info"));
		Act.moveToElement(CompanyInfo).perform();
		String CI = Admin.getText();
		if (CI.contains("Company")) {
			System.out.println("Company Info displayed");
			System.out.println("----------------------------------------------------");
		} else {
			System.out.println("Company Info not displayed");
		}

		WebElement Job = Driver.findElement(By.linkText("Job"));
		Act.moveToElement(Job).perform();
		String Jo = Admin.getText();
		if (Jo.contains("Job")) {
			System.out.println("Job displayed");
			System.out.println("----------------------------------------------------");
		} else {
			System.out.println("Job not displayed");
		}

		WebElement Qualification = Driver.findElement(By.linkText("Qualification"));
		Act.moveToElement(Qualification).perform();
		String Qual = Admin.getText();
		if (Qual.contains("Qual")) {
			System.out.println("Qualification displayed");
			System.out.println("----------------------------------------------------");
		} else {
			System.out.println("Qualification not displayed");
		}

		WebElement Skills = Driver.findElement(By.linkText("Skills"));
		Act.moveToElement(Skills).perform();
		String Skill = Admin.getText();
		if (Skill.contains("Ski")) {
			System.out.println("Skills displayed");
			System.out.println("----------------------------------------------------");
		} else {
			System.out.println("Skills not displayed");
		}

		WebElement Memberships = Driver.findElement(By.linkText("Memberships"));
		Act.moveToElement(Memberships).perform();
		String Mem = Admin.getText();
		if (Mem.contains("Member")) {
			System.out.println("Memberships displayed");
			System.out.println("----------------------------------------------------");
		} else {
			System.out.println("Memberships not displayed");
		}

		WebElement NationalityRace = Driver.findElement(By.linkText("Nationality & Race"));
		Act.moveToElement(NationalityRace).perform();
		String NR = Admin.getText();
		if (NR.contains("Nationa")) {
			System.out.println("Nationality & Race displayed");
			System.out.println("----------------------------------------------------");
		} else {
			System.out.println("Nationality & Race not displayed");
		}

		WebElement Users = Driver.findElement(By.linkText("Users"));
		Act.moveToElement(Users).perform();
		String User = Admin.getText();
		if (User.contains("Users")) {
			System.out.println("Users displayed");
			System.out.println("----------------------------------------------------");
		} else {
			System.out.println("Users not displayed");
		}

		WebElement EmailNotifications = Driver.findElement(By.linkText("Email Notifications"));
		Act.moveToElement(EmailNotifications).perform();
		String EN = Admin.getText();
		if (EN.contains("Email")) {
			System.out.println("Email Notifications displayed");
			System.out.println("----------------------------------------------------");
		} else {
			System.out.println("Email Notifications not displayed");
		}

		WebElement ProjectInfo = Driver.findElement(By.linkText("Project Info"));
		Act.moveToElement(ProjectInfo).perform();
		String PI = Admin.getText();
		if (PI.contains("Project")) {
			System.out.println("Project Info displayed");
			System.out.println("----------------------------------------------------");
		} else {
			System.out.println("Project Info not displayed");
		}

		WebElement DataIE = Driver.findElement(By.linkText("Data Import/Export"));
		Act.moveToElement(DataIE).perform();
		String DIE = Admin.getText();
		if (DIE.contains("Data")) {
			System.out.println("Data Import/Export displayed");
			System.out.println("----------------------------------------------------");
		} else {
			System.out.println("Data Import/Export not displayed");
		}

		if (wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Custom Fields"))).isDisplayed()) {
			System.out.println("Custom Fields displayed");
			System.out.println("----------------------------------------------------");
		} else {
			System.out.println("Custom Fields not displayed");
		}

		// ------------------------------------------------------------------------
		// Mouse Over 2nd Time

		Thread.sleep(2000);
		Act.moveToElement(Admin).perform();
		Act.moveToElement(Job).perform();

		// -----------------------------------------------------------------------

		WebElement jobtitles = Driver.findElement(By.linkText("Job Titles"));
		Act.moveToElement(jobtitles).perform();
		String JT = Job.getText();
		if (JT.contains("Job")) {
			System.out.println("Job Titles displayed");
			System.out.println("----------------------------------------------------");
		} else {
			System.out.println("Job Titles not displayed");
		}

		WebElement JobSpec = Driver.findElement(By.linkText("Job Specifications"));
		Act.moveToElement(JobSpec).perform();
		String JS = Job.getText();
		if (JS.contains("Job")) {
			System.out.println("Job Specifications Displayed");
			System.out.println("----------------------------------------------------");
		} else {
			System.out.println("Job Specifications not displayed");
		}

		if (wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Pay Grades"))).isDisplayed()) {
			System.out.println("PayGrades displayed");
			System.out.println("----------------------------------------------------");
		} else {
			System.out.println("PayGrades not displayed");
		}

		if (wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Employment Status"))).isDisplayed()) {
			System.out.println("Employment Status displayed");
			System.out.println("----------------------------------------------------");
		} else {
			System.out.println("Employment Status not displayed");
		}

		WebElement EEOJobCategories = Driver.findElement(By.linkText("EEO Job Categories"));
		Act.moveToElement(EEOJobCategories).perform();
		String EJC = Job.getText();
		if (EJC.contains("Job")) {
			System.out.println("EEO Job Categories");
			System.out.println("----------------------------------------------------");
		} else {
			System.out.println("EEO Job Categories not displayed");
		}

		// --------------------------------------------------------------------------------
		// Mouse Over 3rd Time

		Act.moveToElement(Admin).perform();
		Act.moveToElement(Job).perform();
		// --------------------------------------------------------------------------------

		JobSpec.click();
		Driver.switchTo().frame("rightMenu");
		WebElement btnselect = Driver.findElement(By.name("loc_code"));
		WebElement btnsearch = Driver.findElement(By.xpath("//input[@value='Search']"));
		WebElement btnreset = Driver.findElement(By.xpath("//input[@value='Reset']"));
		WebElement btnadd = Driver.findElement(By.xpath("//input[@value='Add']"));
		WebElement btndelete = Driver.findElement(By.xpath("//input[@value='Delete']"));
		if (btnselect.isDisplayed() && btnsearch.isDisplayed() && btnreset.isDisplayed() && btnadd.isDisplayed()
				&& btndelete.isDisplayed()) {
			System.out.println("All job title fields are displayed");
			System.out.println("----------------------------------------------------");
		}

		// ---------------------------------------------------------------------------------

		btnadd.click();
		WebElement AddJobDescName = Driver.findElement(By.id("txtFieldName"));
		WebElement AddJobDescDesc = Driver.findElement(By.id("txtDesc"));
		WebElement AddJobDescDuties = Driver.findElement(By.id("txtDuties"));
		if (AddJobDescName.isDisplayed() && AddJobDescDesc.isDisplayed() && AddJobDescDuties.isDisplayed()) {
			System.out.println("All Addjob title fields are displayed");
			System.out.println("----------------------------------------------------");
		}

		// --------------------------------------------------------------------------------
		
		WebElement AddSave = Driver.findElement(By.xpath("//input[@value='Save']"));
		AddSave.click();
		Thread.sleep(1000);
		// --------------------------------------------------------------------------------
		Alert alertA = Driver.switchTo().alert();
		String alert1 = alertA.getText();
		if (alertA.getText().equals(alert1)) {
			System.out.println("ALERT Job Desc Name should be specified is displayed");
			System.out.println("----------------------------------------------------");
			alertA.accept();
		} else {
			System.out.println("ALERT Job Desc Name should be specified not displayed");
		}

		// --------------------------------------------------------------------------------
		
		String DescName = "Then there";
		String DescDesc = "Is Selenium";
		String Duties="Automation";
		// --------------------------------------------------------------------------------
		
		AddJobDescName.sendKeys(DescName);
		AddJobDescDesc.sendKeys(DescDesc);
		AddJobDescDuties.sendKeys(Duties);
		AddSave.click();
		// ------------------------------------------------------------------------------------
				List<WebElement> table = Driver.findElements(By.xpath("//table[@class='data-table']/tbody/tr"));
				int ts = table.size();
				System.out.println("Table size is  "+ts);

				for (int i = 1; i <= ts; i++) {
					String JobSpecificationsTable = Driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr[" + i + "]/td[3]"))
							.getText();
					if (JobSpecificationsTable.equals(DescName)) {
						Driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr[" + i + "]/descendant::td[3]/a"))
								.click();
						Thread.sleep(2000);
					}
				}

		// -----------------------------------------------------------------------------------------
		Driver.findElement(By.id("editBtn")).click();
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------
		String DescName1 = "IT";
		Driver.findElement(By.id("txtFieldName")).clear();
		Driver.findElement(By.id("txtFieldName")).sendKeys(DescName1);
		Thread.sleep(1000);
		// -----------------------------------------------------------------------------------------

		Driver.findElement(By.id("editBtn")).click();
		Thread.sleep(1000);
		System.out.println("ADDING JOB TITLE HAS BEEN EDITED AND EXECUTED");
		System.out.println("----------------------------------------------------");
		Thread.sleep(1000);

		Driver.close();
		Driver.quit();

	}
}