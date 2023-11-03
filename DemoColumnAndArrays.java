package mywork;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoColumnAndArrays {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		// click on column
		driver.findElement(By.xpath("//tr/th[1]")).click();

		// capture all webelements into list
		List<WebElement> list = driver.findElements(By.xpath("//tr/td[1]"));
		// capture text of all webelements into new list
		List<String> gettingText = list.stream().map(s -> s.getText()).collect(Collectors.toList());
		System.out.println(gettingText);

		// sort on the original list of step 3 -> sorted list
		List<String> sortedList = gettingText.stream().sorted().collect(Collectors.toList());

		// compare original list vs sorted list
		Assert.assertTrue(gettingText.equals(sortedList));

		/// Scan the name column with getText -> Rice-> Print the price of the rice
		List<String> price;
		do {
			List<WebElement> list1 = driver.findElements(By.xpath("//tr/td[1]"));
			price = list1.stream().filter(s -> s.getText().contains("Rice")).map(s -> getPriceVeggie(s))
					.collect(Collectors.toList());

			// price.forEach(a->System.out.println(a));
			price.forEach(a -> System.out.println(a));
			if (price.size() < 1) {
				driver.findElement(By.xpath("(//li/a)[7]")).click();
			}

		} while (price.size() < 1);

	}

	private static String getPriceVeggie(WebElement s) {
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();

		return priceValue;

	}

}
