package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IFrameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.switchTo().frame("frame1");

		WebElement FrameHeader = driver.findElement(By.id("sampleHeading"));
		System.out.println("Header of the iframe is " + FrameHeader.getText());

		// to switch back to original window, to come out of frame.

		driver.switchTo().defaultContent();

	}

}
