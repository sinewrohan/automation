import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class clearTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Gateway\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		WebElement dropdown1 = driver.findElement(By.xpath("//section[@id='PaxBlock']/div/dl/dd/select[@id='Adults']"));
		Select drop = new Select(dropdown1);
		drop.selectByIndex(2);

		WebElement dropdown2 = driver
				.findElement(By.xpath("//section[@id='PaxBlock']/div[2]/dl/dd/select[@id='Childrens']"));
		Select drop2 = new Select(dropdown2);
		drop2.selectByVisibleText("1");

		driver.findElement(By.id("DepartDate")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[class='ui-state-default ui-state-highlight ui-state-active ']")).click();
		driver.findElement(By.id("MoreOptionsLink")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("ROhan");
		driver.findElement(By.id("SearchBtn")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

	}

}
