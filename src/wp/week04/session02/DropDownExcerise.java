package wp.week04.session02;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExcerise {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Dropdown")).click();
		List<WebElement> options = driver.findElements(By.cssSelector("select#dropdown > option"));
		for (int i = 0; i < options.size(); i++) {
			if(options.get(i).getText().equals("Option 2")) {
				options.get(i).click();
				break;
			}
		}
		Thread.sleep(2000);
		Select dropdown = new Select(driver.findElement(By.id("dropdown")));
		dropdown.selectByVisibleText("Option 1");
		Thread.sleep(2000);
		driver.quit();

	}

}