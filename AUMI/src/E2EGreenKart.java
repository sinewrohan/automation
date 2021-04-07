import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class E2EGreenKart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Gateway\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait= new WebDriverWait(driver,5);

		driver.manage().window().maximize();
		String[] veggies = { "Brocolli", "Cucumber", "Beetroot" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		addItems(driver, veggies);
		driver.findElement(By.xpath("//a[@class='cart-icon']/img")).click();
		driver.findElement(By.xpath("//div[@class='action-block']/button")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@class='promoCode']")));
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
}
		
	
	public static void addItems(WebDriver driver,String[] veggies ) {
		List<WebElement> totalProducts = driver.findElements(By.cssSelector("h4[class='product-name']"));
		for (int i = 0; i < totalProducts.size(); i++) {
			
			String[] productName = totalProducts.get(i).getText().split("-");
			String formattedproductName = productName[0].trim();
			List veggieslist = Arrays.asList(veggies);
			int j = 0;
			if (veggieslist.contains(formattedproductName)) {

				// click on add to cart
				driver.findElements(By.xpath("//a[@class='increment']")).get(i).click();
				
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				j++;
				if (j == veggies.length) {

					break;
				}

			}

		}

	}
	}
