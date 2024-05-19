package wp.week02.session02;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoApp {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.className("shopping_cart_link")).click();
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("Karthikeyan");
		driver.findElement(By.id("last-name")).sendKeys("Rajendran");
		driver.findElement(By.id("postal-code")).sendKeys("626117");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("finish")).click();
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("back-to-products")).click();
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.linkText("Logout")).click();
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
	}

}