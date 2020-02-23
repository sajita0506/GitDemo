import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sajit\\Work\\chromedriver_win32\\chromedriver.exe");

	WebDriver	driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice");
	driver.manage().window().maximize();
	 int countLinks=driver.findElements(By.tagName("a")).size();
	 System.out.println(countLinks);
	WebElement footerArea= driver.findElement(By.id("gf-BIG"));
	int footercountLinks=footerArea.findElements(By.tagName("a")).size();
	
System.out.println(footercountLinks);

WebElement columnDriver=driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));

int columnDriverLinksCount=columnDriver.findElements(By.tagName("a")).size();
System.out.println(columnDriverLinksCount);

for (int i=1;i<columnDriverLinksCount;i++)
{
	 String clickonLinks=Keys.chord(Keys.CONTROL,Keys.ENTER);
	 
	 columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickonLinks);
}

//driver.quit();
	}
	
	



}
