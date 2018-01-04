package practise1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class rowsandcolumnscount {
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","C:\\Users\\bobby\\Desktop\\webdrivers\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
//driver.manage().window().maximize();
driver.get("http://apps.qaplanet.in/WebApp/AssertXPath.html");

int rowcount=driver.findElements(By.xpath("//table/tbody/tr")).size();
System.out.println(rowcount);

int columncount=driver.findElements(By.xpath("//table/tbody/tr/td")).size();
System.out.println(columncount);



}}