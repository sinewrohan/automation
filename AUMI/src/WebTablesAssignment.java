import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablesAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Gateway\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		int count=0;	
	List<WebElement> rows= driver.findElements(By.xpath("//div[@class='left-align']//table[@id='product']/tbody/tr"));
	for (int i=0; i<rows.size();i++) {
		count++;
	}
	System.out.println(count);
	int countcolumns=0;
	List<WebElement> columns= driver.findElements(By.xpath("//div[@class='left-align']//table[@id='product']/tbody/tr/th"));
	for(int j=0; j<columns.size();j++) {
	countcolumns++;	
	}
	System.out.println(countcolumns);
	List<WebElement> data= driver.findElements(By.xpath("//div[@class='left-align']//table[@id='product']/tbody/tr[3]"));
	for(int k=0; k<data.size();k++) {
		System.out.println(driver.findElements(By.xpath("//div[@class='left-align']//table[@id='product']/tbody/tr[3]")).get(k).getText());
	}

	
	
	}

	
	
	
}
