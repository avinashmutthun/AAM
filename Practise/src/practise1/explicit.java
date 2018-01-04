package practise1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class explicit {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bobby\\Desktop\\webdrivers\\chromedriver.exe");
		ChromeDriver x=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(x, 3);
		x.manage().window().maximize();
		x.get("http://apps.qaplanet.in/erp");
        String	 actualTitle = x.getTitle();
		
		wait.until(ExpectedConditions.titleIs(actualTitle));

		
		System.out.println(actualTitle);
		WebElement objUN=x.findElement(By.name("user_name_entry_field"));
		WebElement objPWD=x.findElement(By.name("password"));
        String strUN="qaplanet1";
		String strPWD="lab1";
		objUN.sendKeys(strUN);
		objPWD.sendKeys(strPWD);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.name("SubmitUser")));
		
		
		String	 Title = x.getTitle();
		System.out.println(Title);
}
}