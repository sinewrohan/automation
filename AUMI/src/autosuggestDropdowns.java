import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Gateway\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("jav");
		Thread.sleep(2000);
		List<WebElement> element= driver.findElements(By.xpath("//ul[@class='erkvQe']"));
		for(WebElement option : element) {
		System.out.println(option.getText());
		if(option.getText().equals("javascript")) {
			Thread.sleep(2000);
			option.click();
			
		}
	}
	}
}
