package wp.week05.session1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String parenWindow = driver.getWindowHandle();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> childWindows = driver.getWindowHandles();
		for (String childWindow : childWindows) {
			if(!childWindow.equals(parenWindow)) {
				driver.switchTo().window(childWindow);
				break;
			}
		}
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		driver.switchTo().window(parenWindow);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		
		List<String> tabs = new ArrayList<String>(childWindows);
		driver.switchTo().window(tabs.get(1));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		driver.switchTo().window(tabs.get(0));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		
		driver.quit();

	}

}