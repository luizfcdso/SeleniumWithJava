
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckboxExercise {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());

		// também tem como passar apenas pelo find elements, no caso são mais de um
		// precisa usar o ELEMENTSSSS
		driver.findElements(By.xpath("//input[@type='checkbox']")).size();

		List<WebElement> checkboxes = driver.findElements(By.xpath(".//input[@type='checkbox']"));

		int numberOfElements = checkboxes.size();

		System.out.println("Existem: " + numberOfElements + " Checkboxes");

		// Para poder contar em list em uma web, a quantidade de checkboxes, é
		// necessário usar o List e o Web element como mostra acima.

	}

}
