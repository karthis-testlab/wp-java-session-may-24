package wp.week06.session1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("input#login-button")).click();
		String item_name = driver.findElement(By.cssSelector("div.inventory_item:first-child > div.inventory_item_description > div.inventory_item_label > a > div.inventory_item_name")).getText();
		driver.findElement(By.cssSelector("div.inventory_item:first-child > div.inventory_item_description >  div.pricebar > button")).click();
	    driver.findElement(By.cssSelector("div#shopping_cart_container > a")).click();
	    if(driver.findElement(By.cssSelector("div.inventory_item_name")).getText().equals(item_name)) {
	    	System.out.println("Test Case Passed!");
	    } else {
	    	System.err.println("Test Cases Failed!");
	    }
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector("button#react-burger-menu-btn")).click();
	    driver.findElement(By.cssSelector("a#logout_sidebar_link")).click();
	    driver.quit();
	    
	}

}