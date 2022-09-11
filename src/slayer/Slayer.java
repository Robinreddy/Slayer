package slayer;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import com.gargoylesoftware.htmlunit.javascript.host.Element;



public class Slayer {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> windows =driver.getWindowHandles();
		Iterator<String> I= windows.iterator();
		String parent = I.next();
		String child= I.next();
		driver.switchTo().window(child);
	
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.cssSelector("a[class='login']")).click();
		JavascriptExecutor e = (JavascriptExecutor)driver;
		
		e.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.id("email_create")).sendKeys("rajeshrout904011@gmail.com");
		driver.findElement(By.cssSelector("i[class='icon-user left']")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("div[id='uniform-id_gender1']")).click();
		driver.findElement(By.id("customer_firstname")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Rajput");
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("ipnone");
		driver.findElement(By.cssSelector("div[class='nav-search-submit nav-sprite']")).click();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys("rajesh");
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.cssSelector("div[class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar']")).click()
;
		
		List<WebElement> a=driver.findElements(By.xpath("//div[@class='css-1dbjc4n']"));
		int d = driver.findElements(By.xpath("//div[@class='css-1dbjc4n']")).size();
		for(int i= 0;i<d;i++) {
			String t=driver.findElements(By.xpath("//div[@class='css-1dbjc4n']")).get(i).getText();
			if(t.equalsIgnoreCase("20")) {
				driver.findElements(By.xpath("//div[@class='css-1dbjc4n']")).get(i).click();
				break;
			}
		}
		
}
}