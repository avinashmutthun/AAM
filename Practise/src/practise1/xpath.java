package practise1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class xpath {

public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","C:\\Users\\bobby\\Desktop\\webdrivers\\chromedriver.exe");
ChromeDriver x=new ChromeDriver();
x.manage().window().maximize();
x.get("http://apps.qaplanet.in/erp");
x.findElement(By.name("user_name_entry_field")).sendKeys("qaplanet1");
x.findElement(By.name("password")).sendKeys("lab1");
x.findElement(By.name("SubmitUser")).click();
Thread.sleep(2000);
x.findElementByXPath("html/body/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table[2]/tbody/tr/td[3]/a[5]").click();

}
}
