package OrangeHRM;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC18_AddCompanystructure {

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

		// -------------------------------------------------------------------------------------------------------------------------------
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

		// -----------------------------------------------------------------------------------------------------------------------------------
		// Mouse Over 2nd Time

		Thread.sleep(2000);
		Act.moveToElement(Admin).perform();
		Act.moveToElement(CompanyInfo).perform();

		// ------------------------------------------------------------------------------------------------------------------------------------

		WebElement General = Driver.findElement(By.linkText("General"));
		Act.moveToElement(General).perform();
		String Gen = Admin.getText();
		if (Gen.contains("General")) {
			System.out.println("General displayed");
			System.out.println("----------------------------------------------------");
		} else {
			System.out.println("General Location not displayed");
		}

		WebElement Locations = Driver.findElement(By.linkText("Locations"));
		Act.moveToElement(Locations).perform();
		String loctns = Admin.getText();
		if (loctns.contains("Locations")) {
			System.out.println("Locations displayed");
			System.out.println("----------------------------------------------------");
		} else {
			System.out.println("Locations not displayed");
		}

		WebElement CompanyStructure = Driver.findElement(By.linkText("Company Structure"));
		Act.moveToElement(CompanyStructure).perform();
		String CS = Admin.getText();
		if (CS.contains("Company Structure")) {
			System.out.println("Company Structure displayed");
			System.out.println("----------------------------------------------------");
		} else {
			System.out.println("Company Structure not displayed");
		}

		WebElement CompanyProperty = Driver.findElement(By.linkText("Company Property"));
		Act.moveToElement(CompanyProperty).perform();
		String CP = Admin.getText();
		if (CP.contains("Company Property")) {
			System.out.println("Company Property displayed");
			System.out.println("----------------------------------------------------");
		} else {
			System.out.println("Company Property not displayed");
		}
		// --------------------------------------------------------------------------------------------------------------------------
		// Mouse Over 3rd Time

		Thread.sleep(2000);
		Act.moveToElement(Admin).perform();
		Act.moveToElement(CompanyInfo).perform();
		CompanyStructure.click();
		// --------------------------------------------------------------------------------------------------------------------------

		Driver.switchTo().frame("rightMenu");
		WebElement btnAdd = Driver.findElement(By.className("add"));
		String CompanyStructuretext = Driver.findElement(By.xpath("//table[@id='tblCompStruct']/tbody/tr/td")).getText();
		if (btnAdd.isDisplayed() && CompanyStructuretext.equals("QA Planet")) {
			System.out.println("Company Structure text displayed");
			System.out.println("----------------------------------------------------");
		}
		// ---------------------------------------------------------------------------------------------------------------------------
		
        btnAdd.click(); 
		String AddaSubDiv = Driver.findElement(By.xpath("//h3[@id='parnt']")).getText();
		if (AddaSubDiv.equals("Add a sub-division to QA Planet")) {
			System.out.println("Add a sub-division to QA Planet displayed");
			System.out.println("----------------------------------------------------");
		}
		WebElement DepartmentID = Driver.findElement(By.id("txtDeptId"));
		WebElement Name = Driver.findElement(By.id("txtTitle"));
		WebElement Type = Driver.findElement(By.id("cmbType"));
		WebElement Location = Driver.findElement(By.id("cmbLocation"));
		WebElement Description = Driver.findElement(By.id("txtDesc"));
		WebElement AddaSubDivSave = Driver.findElement(By.className("savebutton"));
		WebElement AddaSubDivReset = Driver.findElement(By.className("clearbutton"));
		WebElement AddaSubDivHide = Driver.findElement(By.xpath("//input[@value='Hide']"));
		
		if (Name.isDisplayed() && DepartmentID.isDisplayed() && Type.isDisplayed() && Location.isDisplayed()
				&& Description.isDisplayed() && AddaSubDivSave.isDisplayed() && AddaSubDivReset.isDisplayed()
				&& AddaSubDivHide.isDisplayed()) {
			System.out.println("All AddaSubDiv fields are displayed");
			System.out.println("----------------------------------------------------");
		}   
		
		// -----------------------------------------------------------------------------------------------------------------------------
		
		AddaSubDivSave.click();
		Thread.sleep(1000);
		
		// -----------------------------------------------------------------------------------------------------------------------------
		Alert alertA = Driver.switchTo().alert();
		String alert1 = alertA.getText();
		if (alertA.getText().equals(alert1)) {
			System.out.println("Following errors were found:" + 
					"- Sub-division Name cannot be empty." + 
					"- Please select a Type or define a custom type. ====>> ====>> POPUP IS DISPLAYED");
			System.out.println("----------------------------------------------------");
			alertA.accept();
		} else {
			System.out.println("Following errors were found" + 
					"- Sub-division Name cannot be empty"+ 
					"- Please select a Type or define a custom type. ====>> ====>> POPUP IS NOT DISPLAYED");
		}
		// ------------------------------------------------------------------------------------------------------------------------------
		
		Timestamp t = new Timestamp(System.currentTimeMillis());
		Date d = new Date(t.getTime());
		System.out.println(d);
		System.out.println("----------------------------------------------------");
		// --------------------------------------------------------------------------------

		//String AddaSubDepID = "Time of";
		String AddaSubName = "QAPlanet1";
		String AddaSubDescription = "QA Planet Ammerpet Hyderabad Telangana 500001";

		// -------------------------------------------------------------------------------------------------------------------------------

		//DepartmentID.sendKeys(AddaSubDepID);
		Name.sendKeys(AddaSubName);
		AddaSubDivSave.click();
		Alert alertB = Driver.switchTo().alert();
		String alert2 = alertB.getText();
		if (alertB.getText().equals(alert2)) {
			System.out.println("Following errors were found:" + 
					"- Please select a Type or define a custom type. ====>> POPUP IS DISPLAYED");
			alertB.accept();
		} else {
			System.out.println("Following errors were found:" + 
		"- Please select a Type or define a custom type. ====>> POPUP NOT DISPLAYED");
		}
		System.out.println("----------------------------------------------------");
		// --------------------------------------------------------------------------------------------------------------------------------
	
		Select Addasubtype = new Select(Type);
		int size = Addasubtype.getOptions().size();
		System.out.println("Addasubtype drop down size is " + size);
		System.out.println("----------------------------------------------------");
		Addasubtype.selectByVisibleText("Division");
		Thread.sleep(1000);
	
		Select Addasubloc = new Select(Location);
		int size1 = Addasubloc.getOptions().size();
		System.out.println("Addasubloc drop down size is " + size1);
		System.out.println("----------------------------------------------------");
		Addasubloc.selectByVisibleText("Hyderabad");
		Description.sendKeys(AddaSubDescription);
		AddaSubDivSave.click();
		Thread.sleep(1000);
		
		//---------------------------------------------------------------------------------------------------------------------------------
		
		List<WebElement> table = Driver.findElements(By.xpath("//table/tbody/tr"));
		int ts = table.size();
		System.out.println("Table size is  "+ts);
		System.out.println("----------------------------------------------------");

		for (int i = 1; i <= ts; i++) {
			WebElement CompanyInfoCompanyStructure= Driver.findElement(By.xpath("//tbody/tr["+i+"]/td[1]"));
			String CICS=CompanyInfoCompanyStructure.getText();

			if (CICS.contains(AddaSubName)) {
				Driver.findElement(By.xpath("//tbody/tr["+i+"]/td[2]")).click();
				
			}
		}
		

//		Driver.switchTo().defaultContent();
//		Driver.close();
//		Driver.quit();

	}
}