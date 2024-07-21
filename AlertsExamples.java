package webdriver;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertsExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement Clickme1 = driver.findElement(By.id("alertButton"));
		Clickme1.click();

		Alert Alert1 = driver.switchTo().alert();
		System.out.println("Alert message is: " + Alert1.getText());
		Alert1.accept(); // this method will click on OK button of the alert

		WebElement clickMe4 = driver.findElement(By.id("promtButton"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", clickMe4);
		clickMe4.click();
		Alert alert4 = driver.switchTo().alert();
		System.out.println("Alert4 message is: " + alert4.getText());
		Thread.sleep(5000);
		alert4.sendKeys("HelloWorld");
		alert4.accept();

	}

}
