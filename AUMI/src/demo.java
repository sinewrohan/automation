import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Gateway\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://mcmcrmqa.crm2s.internal.das/prweb/app/default/yMrGSLYFmGPqI8mgTmYvlwdqbbk7T9sE406HOqdT2RA*/!STANDARD?pzPostData=-81251760");
		Thread.sleep(900);
	//	System.out.println(driver.getTitle());
	//	System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//input[@id='txtUserID']")).sendKeys("manager001");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rules");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(500);
		driver.findElement(By.cssSelector("a[name*='CPMInteractionPortalHeaderTopRight_pyDisplayHarness_11']")).click();
		Thread.sleep(500);
	//	driver.findElement(By.xpath("\"//div[@class='screen-layout-region-content']/div/span/div/div[2]/div[3]/div/div/div/div/div[4]/span/a/img\")")).click();
		driver.findElement(By.xpath("//span[text()='Member ID Search']")).click();
		
		
	}

}
