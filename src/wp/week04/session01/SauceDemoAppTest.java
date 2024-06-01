package wp.week04.session01;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoAppTest {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		List<WebElement> elements = driver.findElements(By.className("inventory_item_name"));
		List<WebElement> addToCart = driver.findElements(By.xpath("//button[text()='Add to cart']"));
        for (int i = 0; i < elements.size(); i++) {
        	if(elements.get(i).getText().equals("Sauce Labs Bolt T-Shirt")) {
				addToCart.get(i).click();
				break;
			}
		}
        driver.findElement(By.className("shopping_cart_link")).click();
        if(driver.findElement(By.className("inventory_item_name")).getText().equals("Sauce Labs Bolt T-Shirt")) {
        	System.out.println("Test Case Passed!");
        } else {
        	System.err.println("Test Case Falied!");
        }
        driver.quit();
		
	}

}