package mywork;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsMouseDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercadolivre.com.br/");
		Actions a=new Actions(driver);
		WebElement move=driver.findElement(By.className("nav-menu-categories-link"));
		
		a.moveToElement(driver.findElement(By.id("cb1-edit"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		//move to specific element 
		a.moveToElement(move).contextClick().build().perform();
		
		
		

	}

}
