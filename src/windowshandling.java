import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowshandling {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sajit\\Work\\chromedriver_win32\\chromedriver.exe");

	WebDriver	driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	driver.findElement(By.id("openwindow")).click();
	Set<String> ids=driver.getWindowHandles();
	Iterator<String> it=ids.iterator();
	String parentWindow=it.next();
	String childwindow=it.next();
	driver.switchTo().window(childwindow);
	System.out.println(driver.getTitle());
	
	}
	
	
	
}

	 




