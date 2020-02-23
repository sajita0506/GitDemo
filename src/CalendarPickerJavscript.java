import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarPickerJavscript {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\sajit\\Work\\chromedriver_win32\\chromedriver.exe");

	WebDriver	driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/bus-tickets/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("travelDate")).click();
		WebElement ele=driver.findElement(By.xpath("//span[@class='selectedDateField appendBottom8']"));
		String dateValueori="28Feb20";
		selectDate(driver,ele,dateValueori);
		
		
		

	}
	
	public static void selectDate(WebDriver driver,WebElement element,String dateValue)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value', 'dateValue')",element);
		
	}

}
