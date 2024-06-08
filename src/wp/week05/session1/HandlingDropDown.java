package wp.week05.session1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Select dropDown = new Select(driver.findElement(By.id("dropdown")));
		dropDown.selectByVisibleText("Option 1");
		dropDown.selectByIndex(2);
		dropDown.selectByValue("1");
		driver.quit();
		
	}

}