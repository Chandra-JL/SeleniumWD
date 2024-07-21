package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FbLoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement Mail= driver.findElement(By.name("email"));
		Mail.sendKeys("abc@abc.com");
		
		WebElement Password= driver.findElement(By.name("pass"));
		Password.sendKeys("abc@abc");
		
		WebElement Loginbtn= driver.findElement(By.name("login"));
		Loginbtn.click();	
		
		/*WebElement Error = driver.findElement(By.id("error_box"));
		System.out.println(Error.getText());
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());*/
		driver.close();

		
		
	}

}
