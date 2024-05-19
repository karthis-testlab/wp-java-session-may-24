package wp.week02.session02;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingClickAction {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///Users/karthistestlab/Documents/code-labs/my-project-labs/warrior-penforce/workspace/wp-java-session-may-24/html-templates/handling_click_action.html");
        System.out.println(driver.getTitle());
        driver.findElement(By.tagName("button")).click();
        System.out.println(driver.findElement(By.id("demo")).getText());
        System.out.println(driver.findElement(By.id("html")).isSelected());
        driver.findElement(By.id("html")).click();
        System.out.println(driver.findElement(By.id("html")).isSelected());
        driver.findElement(By.linkText("Visit Swag Labs")).click();
        driver.navigate().back();
        driver.findElement(By.id("bike")).click();

	}

}
