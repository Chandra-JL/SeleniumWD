package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginFailureTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		LoginLink.click();

		WebElement UserName= driver.findElement(By.name("user_login"));
		UserName.sendKeys("abc@xyz.com");
		
		WebElement Password= driver.findElement(By.id("password"));
		Password.sendKeys("Abc@1234");
		
		WebElement Remember= driver.findElement(By.id("remember-me"));
		Remember.click();
		
		WebElement Loginbtn = driver.findElement(By.name("btn_login"));
		Loginbtn.click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		WebElement Error = driver.findElement(By.className("error_msg"));
		System.out.println(Error.getText());
		
		driver.close();
		
	}

}
