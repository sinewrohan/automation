import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SpiceJetCalenderGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Gateway\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait= new WebDriverWait(driver,5);
		
		
		
/*		////div[@id='ui-datepicker-div']/div[@class='ui-datepicker-group ui-datepicker-group-last']
		List<WebElement> dates=driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//td[@data-handler='selectDay']"));
		int count= driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//td[@data-handler='selectDay']")).size();
		for(int i=0;i<count;i++)
		{
			String date=driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//td[@data-handler='selectDay']")).get(i).getText();
			if(date.equalsIgnoreCase("25")) {
				driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//td[@data-handler='selectDay']")).get(i).click();
				break;  
			}
		}  */
		
		
		
	//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("ctl00_mainContent_view_date1")));
		driver.findElement(By.xpath("//div[@class='picker-first2']//input[@id='ctl00_mainContent_view_date1']")).click();
while(!driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']/div/div[@class='ui-datepicker-title']")).getText().contains("June")) {
			
			driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']/div/a[@data-handler='next']")).click();
		}
		List<WebElement> dates= driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//td[@data-handler='selectDay']"));
		int count= driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//td[@data-handler='selectDay']")).size();
		for(int i=0; i<count;i++ ) {
			String date=driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//td[@data-handler='selectDay']")).get(i).getText();
			if(date.equalsIgnoreCase("25")) {
				driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//td[@data-handler='selectDay']")).get(i).click();
			}
			
		}
		
		
		
		
		
	}
	
	

}
