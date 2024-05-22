package wp.week02.home.assessments;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssessment01 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		System.out.println(driver.getTitle());
		driver.close();

	}

}
