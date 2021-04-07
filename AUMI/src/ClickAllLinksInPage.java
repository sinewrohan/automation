import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickAllLinksInPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Gateway\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		/*
		 * WebElement footer=driver.findElement(By.id("gf-BIG"));
		 * System.out.println(footer.findElements(By.tagName("a")).size()); WebElement
		 * column=footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		 * System.out.println(column.findElements(By.tagName("a")).size()); for (int
		 * i=0; i<column.findElements(By.tagName("a")).size();i++) { String click=
		 * Keys.chord(Keys.CONTROL, Keys.ENTER);
		 * 
		 * column.findElements(By.tagName("a")).get(i).sendKeys(click); Set<String>
		 * handle=driver.getWindowHandles(); Iterator<String> it= handle.iterator();
		 * String parentId=it.next(); driver.switchTo().window(parentId); }
		 */

		WebElement footer = driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		WebElement footersection = footer.findElement(By.xpath("//table" + "/tbody/tr/td[1]/ul"));
		System.out.println(footersection.findElements(By.tagName("a")).size());
		for (int i = 0; i < footersection.findElements(By.tagName("a")).size(); i++) {
			String click = Keys.chord(Keys.CONTROL, Keys.ENTER);
			footersection.findElements(By.tagName("a")).get(i).sendKeys(click);
			Thread.sleep(3000);
		}
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();

		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}

}
