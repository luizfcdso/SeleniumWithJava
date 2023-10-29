package mywork;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FilterListTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		String search = "Beans";

		driver.findElement(By.id("search-field")).sendKeys(search);
		Thread.sleep(1000);

		List<WebElement> namesVeggies = driver.findElements(By.xpath("//tr/td[1]"));
		Thread.sleep(1000);
		List<WebElement> listVeggies = namesVeggies.stream().filter(s -> s.getText().contains(search))
				.collect(Collectors.toList());
		Assert.assertEquals(namesVeggies.size(), listVeggies.size());

		Thread.sleep(5000);
		driver.quit();

	}

}
