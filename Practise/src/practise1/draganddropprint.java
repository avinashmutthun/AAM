package practise1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class draganddropprint {

public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","C:\\Users\\bobby\\Desktop\\webdrivers\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
//driver.manage().window().maximize();
driver.get("http://apps.qaplanet.in/WebApp/SelectAWebSite.html");
WebElement e=driver.findElement(By.name("OptWeb"));
Select sel=new Select(e);


List<WebElement> ops=sel.getOptions();
//way 1
for(int i=0;i<ops.size();i++)
{
	String text=ops.get(i).getText();
	System.out.println(text);
}
//way 2
for(WebElement e1:ops)
{
	String text=e1.getText();
	System.out.println(text);
}

//way 3
Iterator<WebElement> it=ops.iterator();
while(it.hasNext())
{
	WebElement e2=it.next();
	System.out.println(e2.getText());
}
	
	
	








}}