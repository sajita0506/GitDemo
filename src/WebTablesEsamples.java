import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablesEsamples {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sajit\\Work\\chromedriver_win32\\chromedriver.exe");

	WebDriver	driver = new ChromeDriver();
	driver.get("https://www.cricbuzz.com/live-cricket-scorecard/26783/sl-vs-wi-1st-odi-west-indies-tour-of-sri-lanka-2020");
	WebElement table=driver.findElement(By.cssSelector("#innings_1>div:first-of-type"));
	
	int rowcount=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
	
	List<WebElement>col=table.findElements(By.cssSelector("div.cb-col.cb-col-100.cb-scrd-itms>div:nth-of-type(3)"));
	
	int colcount=table.findElements(By.cssSelector("div.cb-col.cb-col-100.cb-scrd-itms>div:nth-of-type(3)")).size();
	
	System.out.println(rowcount);
	
for(int i=0;i<colcount-2;i++)
{
	System.out.println(col.get(i).getText());
}
	
	System.out.println(driver.findElement(By.cssSelector("#innings_1>div:first-of-type>div:nth-of-type(12)>div:nth-of-type(2)")).getText());
		
		

	}

}
