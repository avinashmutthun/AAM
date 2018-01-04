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

public class TC7_DeleteLocation {


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
		Locations.click();
		// --------------------------------------------------------------------------------------------------------------------------

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
		// ---------------------------------------------------------------------------------------------------------------------------
		btnadd.click();
		WebElement Name = Driver.findElement(By.id("txtLocDescription"));
		WebElement Contry = Driver.findElement(By.id("cmbCountry"));
		WebElement StateProvince = Driver.findElement(By.className("formInputText"));
		WebElement City = Driver.findElement(By.id("cmbDistrict"));
		WebElement Address = Driver.findElement(By.id("txtAddress"));
		WebElement ZIPCode = Driver.findElement(By.id("txtZIP"));
		WebElement Phone = Driver.findElement(By.id("txtPhone"));
		WebElement Fax = Driver.findElement(By.id("txtFax"));
		WebElement Comments = Driver.findElement(By.id("txtComments"));
		if (Name.isDisplayed() && Contry.isDisplayed() && StateProvince.isDisplayed() && City.isDisplayed()
				&& Address.isDisplayed() && ZIPCode.isDisplayed() && Phone.isDisplayed() && Fax.isDisplayed()
				&& Comments.isDisplayed()) {
			System.out.println("All Addjob title fields are displayed");
			System.out.println("----------------------------------------------------");
		}
		// -----------------------------------------------------------------------------------------------------------------------------
		WebElement AddSave = Driver.findElement(By.xpath("//input[@value='Save']"));
		AddSave.click();
		Thread.sleep(1000);
		// -----------------------------------------------------------------------------------------------------------------------------
		Alert alertA = Driver.switchTo().alert();
		String alert1 = alertA.getText();
		if (alertA.getText().equals(alert1)) {
			System.out.println(" - Location Name has to be specified\r\n" + " - Country should be selected!\r\n"
					+ " - Address should be specified\r\n" + " - Zip Code should be specified are displayed "
							+ "====>> ====>> POPUP IS DISPLAYED");
			System.out.println("----------------------------------------------------");
			alertA.accept();
		} else {
			System.out.println(" - Location Name has to be specified\r\n" + " - Country should be selected!\r\n"
					+ " - Address should be specified\r\n" + " - Zip Code should be specified not displayed"
							+ "====>> ====>> POPUP NOT DISPLAYED");
		}
		// -------------------------------------------------------------------------------------------------------------------------------
		Timestamp t = new Timestamp(System.currentTimeMillis());
		Date d = new Date(t.getTime());
		//--------------------------------------------------------------------------------------------------------------------------------
		String Nme = "QA Planet "+d;
		//String State = "Telangana";
		String cty = "Hyderabad";
		String Addres = "Ammerpet";
		String zipcod = "500001";
		String phne = "987654321";
		String Fx = "123456789";
		String Cmnts = "Selenium Coaching centre";

		// -------------------------------------------------------------------------------------------------------------------------------

		Name.sendKeys(Nme);
		AddSave.click();
		Alert alertB = Driver.switchTo().alert();
		String alert2 = alertB.getText();
		if (alertB.getText().equals(alert2)) {
			System.out.println("Job Description should be specified ====>> POPUP IS DISPLAYED");
			alertB.accept();
		} else {
			System.out.println("Job Description should be specified ====>> POPUP NOT DISPLAYED");
		}
		System.out.println("----------------------------------------------------");
		// --------------------------------------------------------------------------------------------------------------------------------
		WebElement Country = Driver.findElement(By.id("cmbCountry"));
		Select Cntry = new Select(Country);
		int size = Cntry.getOptions().size();
		System.out.println("Country drop down size is " + size);
		Cntry.selectByVisibleText("India");
		Thread.sleep(3000);
		AddSave.click();
		//---------------------------------------------------------------------------------------------------------------------------------
		Alert alertC = Driver.switchTo().alert();
		String alert3 = alertC.getText();
		if (alertC.getText().equals(alert3)) {
			System.out.println("----------------------------------------------------");
			System.out.println(
					"- Address should be specified\r\n" + "- Zip Code should be specified ====>> ====>> POPUP IS DISPLAYED ");
			System.out.println("----------------------------------------------------");
			alertC.accept();
		} else {
			System.out.println("- Address should be specified\r\n" + "- Zip Code should be SSpecified ====>> ====>> POPUP NOT DISPLAYED");
		}
		// --------------------------------------------------------------------------------------------------------------------------------
		Address.sendKeys(Addres);
		AddSave.click();
		Alert alertD = Driver.switchTo().alert();
		String alert4 = alertD.getText();
		if (alertD.getText().equals(alert4)) {
			System.out.println("- Zip Code should be displayed ====>> ====>> POPUP IS DISPLAYED");
			System.out.println("----------------------------------------------------");
			alertD.accept();
		} else {
			System.out.println("- Zip Code should be specified ====>> ====>> POPUP NOT DISPLAYED");
		}

		// --------------------------------------------------------------------------------------------------------------------------------

		City.sendKeys(cty);
		//StateProvince.sendKeys(State);
		ZIPCode.sendKeys(zipcod);
		Phone.sendKeys(phne);
		Fax.sendKeys(Fx);
		Comments.sendKeys(Cmnts);
		AddSave.click();

		String succesfullyAdded = Driver.findElement(By.xpath("//span[@class='success']")).getText();
		if (succesfullyAdded.equals("Successfully Added")) {
			System.out.println("Given Locations details is Successfully displayed and Added");
			System.out.println("----------------------------------------------------");
		} else {
			return;
		}
		
		// --------------------------------------------------------------------------------------------------------------------------------
        
		List<WebElement> table = Driver.findElements(By.xpath("//table[@class='data-table']/tbody/tr"));
		int ts = table.size();
		System.out.println("Table size is  "+ts);
		System.out.println("----------------------------------------------------");

		for (int i = 1; i <= ts; i++) {
			String CompanyInfoLoc = Driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr[" + i + "]/td[3]/a")).getText();
			
			if (CompanyInfoLoc.equals(Nme)) {
				System.out.println(CompanyInfoLoc);
				System.out.println("----------------------------------------------------");
				Driver.findElement(By.xpath("//html/body/div/div[2]/form/table/tbody/tr[" + i + "]/td[1]/input")).click();
				break;
			}
		}
		
		// --------------------------------------------------------------------------------------------------------------------------------
		
		Driver.findElement(By.xpath("//input[@value='Delete']")).click();
		Thread.sleep(1000);
		Alert DeleteAlert= Driver.switchTo().alert();
		DeleteAlert.accept();
		System.out.println("Given Input is Deleted");
		System.out.println("----------------------------------------------------");
		
		// --------------------------------------------------------------------------------------------------------------------------------
		
		Driver.switchTo().defaultContent();
		Driver.close();
		Driver.quit();

	}
}