package wp.week04.session02;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowExcerise {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println(driver.getWindowHandle());
		String parentWindow = driver.getWindowHandle();
		driver.get("http://the-internet.herokuapp.com/windows");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		for (String window : windows) {
			if(!parentWindow.equals(window)) {
				driver.switchTo().window(window);
				break;
			}
		}
		/*ArrayList<String> listOfWindows = new ArrayList<String>(windows);
		driver.switchTo().window(listOfWindows.get(1));*/
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		driver.quit();

	}

}