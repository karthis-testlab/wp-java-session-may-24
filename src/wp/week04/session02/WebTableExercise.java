package wp.week04.session02;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExercise {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/tables");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

	}

}
