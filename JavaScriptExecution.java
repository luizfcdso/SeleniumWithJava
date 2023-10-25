import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JavaScriptExecution {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		List<WebElement> numbers = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum = 0;
		
		
		for (int i=0; i<numbers.size(); i++) 
		{
			sum = sum + Integer.parseInt(numbers.get(i).getText());
						
		}
		System.out.println(sum);
		
		//two ways you can write to compare the values
		
		String finalValue = driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":")[1].trim();
	
		int finalValue2 = Integer.parseInt(driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":")[1].trim());

		int result = Integer.parseInt(finalValue);
		
		
		
		Assert.assertEquals(result, sum);
		
		driver.quit();

	}

}
