package wp.week02.session01;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumCode {

	public static void main(String[] args) {
		
		// Launching chrome browser in the local machine
		ChromeDriver driver = new ChromeDriver();
		
		// Maximize window screen based on local machine screen resolution
		driver.manage().window().maximize();
		
		// Navigate web application in the launced chrome browser
		driver.get("https://www.saucedemo.com/");
		
		// Fetch title of the test application
		System.out.println(driver.getTitle());
		
		// Closing the launched chrome browser.
		driver.quit();

	}

}
