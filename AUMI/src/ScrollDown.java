import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Gateway\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollBy(0,500)\r\n" + 
				"");
		
		List<WebElement> data= driver.findElements(By.xpath("//div[@class='tableFixHead']//td[4]"));
		int sum=0;
		for(int i=0;i<data.size();i++) {
			System.out.println(driver.findElements(By.xpath("//div[@class='tableFixHead']//td[4]")).get(i).getText());
			
			
			sum=sum+ Integer.parseInt(driver.findElements(By.xpath("//div[@class='tableFixHead']//td[4]")).get(i).getText());
		}
		System.out.println(sum);

	}

}
