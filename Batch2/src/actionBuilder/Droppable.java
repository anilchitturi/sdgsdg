package actionBuilder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Droppable {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub 
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "D:/Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/demos/droppable/");
		 Thread.sleep(10000);
		 driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		 WebElement draggable = driver.findElement(By.id("draggable"));
		 WebElement droppable = driver.findElement(By.id("droppable")); 
		 new Actions(driver).dragAndDrop(draggable, droppable).build().perform();
	}

}
