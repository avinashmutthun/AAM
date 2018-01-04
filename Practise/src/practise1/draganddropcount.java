package practise1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class draganddropcount {

public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","C:\\Users\\bobby\\Desktop\\webdrivers\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
//driver.manage().window().maximize();
driver.get("http://apps.qaplanet.in/WebApp/SelectAWebSite.html");
WebElement e=driver.findElement(By.name("OptWeb"));
Select sel=new Select(e);
//way 1
//int ic=sel.getOptions().size();
//System.out.println(ic);

//way 2
List<WebElement> ops=sel.getOptions();
System.out.println(ops.size());

//********************doubt*********************

WebElement E1=sel.getFirstSelectedOption();
System.out.println(E1);





}}