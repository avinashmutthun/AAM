package practise1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class draganddropvisibleindexvalueproperty {

public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","C:\\Users\\bobby\\Desktop\\webdrivers\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
//driver.manage().window().maximize();
driver.get("http://apps.qaplanet.in/WebApp/SelectAWebSite.html");
WebElement e=driver.findElement(By.name("OptWeb"));
Select sel=new Select(e);


sel.selectByVisibleText("QAPlanet");
Thread.sleep(2000);

sel.selectByIndex(3);
Thread.sleep(2000);

sel.selectByValue("Yahoo");
Thread.sleep(2000);

/*sel.deselectAll();
sel.deselectByIndex(0);
sel.deselectByValue("yahoo");
sel.deselectByVisibleText("QAPlanet");
*/

}}