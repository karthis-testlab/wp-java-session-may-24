package wp.week02.session02;

import org.openqa.selenium.chrome.ChromeDriver;

public class DirverNavigationCommands {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://the-internet.herokuapp.com/");
		
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		//driver.quit();

	}

}
