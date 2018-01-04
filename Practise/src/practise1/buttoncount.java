package practise1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class buttoncount {
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","C:\\Users\\bobby\\Desktop\\webdrivers\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
//driver.manage().window().maximize();
driver.get("http://apps.qaplanet.in/qahrm/login.php");
int bc=driver.findElements(By.className("button")).size();
System.out.println(bc);

WebElement UN=driver.findElement(By.name("txtUserName"));
UN.sendKeys("avinash");
UN.click();
UN.sendKeys(Keys.chord(Keys.CONTROL,"a"));
UN.sendKeys(Keys.DELETE);
UN.sendKeys("qaplanet1");
driver.findElement(By.name("txtPassword")).sendKeys("lab1");
driver.findElement(By.name("Submit")).click();
Thread.sleep(1000);

int linkscount=driver.findElements(By.tagName("a")).size();
System.out.println(linkscount);



driver.findElement(By.xpath("//*[@id='option-menu']/li[3]/a")).click();
Thread.sleep(1000);
driver.close();
driver.quit();




}}