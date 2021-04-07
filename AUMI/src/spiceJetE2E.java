import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class spiceJetE2E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Gateway\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		;
		driver.findElement(By.cssSelector("a[value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='CCU']"))
				.click();
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active']")).click();

		// System.out.println(driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date2']")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style"));
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_0']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style"));
		if (driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style").contains("1")) {
			System.out.println("is enabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
			
		};
		driver.findElement(By.cssSelector("div[id='divpaxinfo']")).click();
		Thread.sleep(2000);
		WebElement drop1=driver.findElement(By.xpath("//div[@id='divpaxOptions']/div[2]/p[@id='adultDropdown']/select[@id='ctl00_mainContent_ddl_Adult']"));
		Select dropdown= new Select(drop1);
		dropdown.selectByValue("3");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div[id='divpaxinfo']"));
		WebElement drop2=driver.findElement(By.xpath("//div[@id='divpaxOptions']/div[2]/p[@id='childDropdown']/select[@id='ctl00_mainContent_ddl_Child']"));
		
		Select dropdown2 = new Select(drop2);
		dropdown2.selectByValue("2");
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}
		

	// System.out.println(driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date2']")).isEnabled());

}
