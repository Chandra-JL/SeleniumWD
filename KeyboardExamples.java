package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeyboardExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement Search = driver.findElement(By.name("q"));
		Search.sendKeys("First search");
		Search.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));	
		Search.sendKeys("Second search");
		Search.sendKeys(Keys.ENTER);
	}

}
