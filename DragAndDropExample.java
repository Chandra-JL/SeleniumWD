package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement Source = driver.findElement(By.id("draggable"));
		
		WebElement Target = driver.findElement(By.id("droppable"));
		
		WebElement Return = driver.findElement(By.className("simple-drop-container"));
		
		Actions act =new Actions(driver);
		act.dragAndDrop(Source, Target).build().perform();
		
		act.dragAndDrop(Source, Return ).build().perform();
	}

}
