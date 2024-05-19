package wp.week02.session01;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverLaunch {	

	public static void main(String[] args) {	
				
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println(driver.getTitle());
		driver.quit();

	}

}