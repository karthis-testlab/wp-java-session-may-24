package wp.week04.session01;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllLinkTextNameInHeroku {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> elements = driver.findElements(By.xpath("//ul/li/a"));
	    for (WebElement element : elements) {
			System.out.println(element.getText());
		}
		driver.quit();

	}

}
