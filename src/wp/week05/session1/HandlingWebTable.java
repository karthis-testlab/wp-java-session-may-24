package wp.week05.session1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTable {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/tables");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		List<WebElement> headers = driver.findElements(By.cssSelector("table#table1 > thead > tr > th"));
		System.out.println(headers.size());
		for (WebElement header : headers) {
			System.out.println(header.getText());
		}
		
		List<WebElement> rows = driver.findElements(By.cssSelector("table#table1 > tbody > tr"));
		System.out.println(rows.size());
		
		for (WebElement row : rows) {
			System.out.println(row.findElements(By.tagName("td")).get(0).getText());
		}

	}

}