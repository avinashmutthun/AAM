package practise1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class gettitle {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bobby\\Desktop\\webdrivers\\chromedriver.exe");
		ChromeDriver x=new ChromeDriver();
		x.manage().window().maximize();
		x.get("http://apps.qaplanet.in/erp");
        
		
		String	 actualTitle = x.getTitle();
		System.out.println(actualTitle);
		

		WebElement objUN=x.findElement(By.name("user_name_entry_field"));
		WebElement objPWD=x.findElement(By.name("password"));
		WebElement objLogin=x.findElement(By.name("SubmitUser"));
		String strUN="qaplanet1";
		String strPWD="lab1";
		objUN.sendKeys(strUN);
		objPWD.sendKeys(strPWD);
		objLogin.click();
		
		String	 Title = x.getTitle();
		System.out.println(Title);

	
	}
}