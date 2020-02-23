import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {
	
	public static  void main(String args[]) throws Exception
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sajit\\Work\\chromedriver_win32\\chromedriver.exe");

	WebDriver	driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice");
	driver.manage().window().maximize();
	driver.findElement(By.cssSelector("input#autocomplete")).sendKeys("United S");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input#autocomplete")).sendKeys(Keys.DOWN);
	JavascriptExecutor js= (JavascriptExecutor)driver;
	String script= " return document.getElementById(\"autocomplete\").value;";
	String text=(String) js.executeScript(script);
	
	int i=0;
	while(!text.equalsIgnoreCase("United States (USA)"))
	{
		i++;
	driver.findElement(By.cssSelector("input#autocomplete")).sendKeys(Keys.DOWN);
	
	if(i>10) {
		break;
		
	}
	}
	System.out.println(text);
	
	}

}
