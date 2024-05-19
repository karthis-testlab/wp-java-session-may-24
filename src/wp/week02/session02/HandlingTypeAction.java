package wp.week02.session02;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTypeAction {

	public static void main(String[] args) {	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///Users/karthistestlab/Documents/code-labs/my-project-labs/warrior-penforce/workspace/wp-java-session-may-24/html-templates/handling_type_action.html");
        System.out.println(driver.getTitle());
        driver.findElement(By.id("fname")).sendKeys("Karthikeyan");
        driver.findElement(By.id("lname")).sendKeys("Rajendran");
        driver.findElement(By.id("user-name")).clear();
        driver.findElement(By.id("user-name")).sendKeys("karthi89");
        String placeholder = driver.findElement(By.id("email")).getAttribute("placeholder");
	    System.out.println(placeholder);
	    boolean isEnabled = driver.findElement(By.id("password")).isEnabled();
        if(!isEnabled) {
        	System.out.println("Password field is disabled as per req.");
        }
        String readOnly = driver.findElement(By.id("dontwrite")).getAttribute("readonly");
        System.out.println(readOnly);
	}

}
