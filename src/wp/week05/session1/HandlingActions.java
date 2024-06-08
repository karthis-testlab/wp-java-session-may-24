package wp.week05.session1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/hovers");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Actions action = new Actions(driver);
		action.contextClick(driver.findElement(By.linkText("Elemental Selenium")))
		      .perform();
		action.moveToElement(driver.findElement(By.xpath("//div[@class='figure'][2]")))
		      .perform();

	}

}
