import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowsHandlingAssignment {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sajit\\Work\\chromedriver_win32\\chromedriver.exe");
	WebDriver	driver = new ChromeDriver();
	
	//parent window below
	driver.get("https://the-internet.herokuapp.com/");
	
	
	driver.manage().window().maximize();
	String mainWindow=driver.getWindowHandle();
	
	WebDriverWait wait = new WebDriverWait(driver,5);
	
	//navigating to child window from parentwindow
	driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
	
	Thread.sleep(1000);
	Set<String> ids=driver.getWindowHandles();
	Iterator<String> it=ids.iterator();
	String parentWindow=it.next();
	String childwindow=it.next();
	driver.switchTo().window(childwindow);
	WebElement newwindow=driver.findElement(By.xpath("//h3[contains(text(),'New Window')]"));
	
	newwindow=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'New Window')]")));
	System.out.println(newwindow.getText());
	driver.close();
	driver.switchTo().window(parentWindow);
	String text=driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText();
	System.out.println(text);

	
	
	

	}

}
