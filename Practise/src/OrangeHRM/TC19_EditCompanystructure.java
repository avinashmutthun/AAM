package OrangeHRM;




import java.sql.Timestamp;
import java.sql.Date;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC19_EditCompanystructure {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bobby\\Desktop\\webdrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();


		// WebDriverWait wait=new WebDriverWait(driver, 60);

		driver.get("http://apps.qaplanet.in/qahrm/login.php");

		driver.getTitle();

		WebElement username = driver.findElement(By.name("txtUserName"));
		WebElement password = driver.findElement(By.name("txtPassword"));
		WebElement login = driver.findElement(By.name("Submit"));

		username.sendKeys("qaplanet1");
		password.sendKeys("lab1");

		login.click();

		Actions act = new Actions(driver);
		WebElement admin = driver.findElement(By.xpath("//li[@id=\"admin\"]/a/span"));
		act.moveToElement(admin).perform();

		WebElement ci = driver.findElement(By.linkText("Company Info"));
		act.moveToElement(ci).perform();

		WebElement jt = driver.findElement(By.linkText("General"));
		WebElement js = driver.findElement(By.linkText("Locations"));
		WebElement pg = driver.findElement(By.linkText("Company Structure"));


		if (jt.isDisplayed() && js.isDisplayed() && pg.isDisplayed()) {
			System.out.println("all fields are visible");
		} else {
			System.out.println("fields are not visible");
		}

		act.moveToElement(pg).perform();
		pg.click();

		driver.switchTo().frame("rightMenu");

		driver.findElement(By.className("add")).click();

		driver.findElement(By.id("txtTitle")).sendKeys("Sreekanth");
		driver.findElement(By.className("savebutton")).click();
		Alert alt=driver.switchTo().alert();
		String alttext=alt.getText();
		System.out.println(alttext);
		alt.accept();

		driver.findElement(By.className("formSelect")).click();
		driver.findElement(By.xpath("//select[@id='cmbType']/option[5]")).click();
		driver.findElement(By.className("savebutton")).click();

		List<WebElement> list=driver.findElements(By.xpath("//tbody/tr"));
		int ls=list.size();
		System.out.println(ls);
		for(int i=1;i<=ls;i++)
		{
			String ldata=driver.findElement(By.xpath("//tbody/tr["+i+"]/td[1]")).getText();
			//System.out.println(ldata);
			{

			if(ldata.equals("Sreekanth")){
				System.out.println("Company Structure is displayed");
				driver.findElement(By.xpath("//tbody/tr["+i+"]/td[2]/a")).click();
			
				
				driver.findElement(By.id("txtTitle")).sendKeys("sub-Sreekanth");
				driver.findElement(By.className("formSelect")).click();
				driver.findElement(By.xpath("//select[@id='cmbType']/option[5]")).click();
				driver.findElement(By.className("savebutton")).click();
				
				
				
				driver.findElement(By.xpath("//tbody/tr["+i+"]/td[4]/a")).click();
				Alert alt1=driver.switchTo().alert();
				String alttext1=alt1.getText();
				System.out.println(alttext1);
				alt1.accept();
				
				
				break;
				
				
			}
			
			}
		}driver.close();
		driver.quit();
	}
}