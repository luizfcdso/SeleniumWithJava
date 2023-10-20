import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class framesTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		System.out.println(driver.findElement(By.tagName("iframe")));
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		//driver.findElement(By.id("draggable")).click();
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).build().perform();
		
		
		//String frame = driver.findElement(By.id("draggable")).getText();
		//System.out.println(frame);
		Thread.sleep(8000);
		driver.quit();
		

	}

}
