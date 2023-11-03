package mywork;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");

		
		WebElement nameEditBox = driver.findElement(By.cssSelector("[name='name']"));
		System.out.println(driver.findElement(RelativeLocator.with(By.tagName("label")).above(nameEditBox)).getText());
		
		WebElement dateOfBird = driver.findElement(By.cssSelector("[for='dateofBirth']"));
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(dateOfBird)).click();
		
		WebElement iceCreamLabel = driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		driver.findElement(RelativeLocator.with(By.tagName("input")).toLeftOf(iceCreamLabel)).click();
		
		WebElement textRightSide = driver.findElement(By.id("inlineRadio1"));
		System.out.println(driver.findElement(RelativeLocator.with(By.tagName("label")).toRightOf(textRightSide)).getText());
		
	}

}
