import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GrabbingElementsDynamically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Gateway\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait= new WebDriverWait(driver, 5);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement checkbox=driver.findElement(By.xpath("//div[@class='right-align']/fieldset/label[2]"));
		checkbox.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		String checkboxtext=checkbox.getText();
		System.out.println(checkboxtext);
		
		WebElement selecttext=driver.findElement(By.xpath("//div[@class='cen-right-align']/fieldset/select"));
		selecttext.click();
		Select select=  new Select(selecttext);
		select.selectByVisibleText(checkboxtext);
		
		WebElement entertext=driver.findElement(By.id("name"));
		entertext.click();
		entertext.sendKeys(checkboxtext);
		driver.findElement(By.id("alertbtn")).click();;
		String t=driver.switchTo().alert().getText();
		System.out.println(t);
		
		
		
	}

}
