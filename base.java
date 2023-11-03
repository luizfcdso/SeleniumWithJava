package mywork;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class base {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot", "Carrot" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		addItems(driver, itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(), 'PROCEED TO CHECKOUT')]")).click();
		
		WebDriverWait webdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		webdwait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		// System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText().contains("Code
		// applied ..!"));
		// explicit wait

		webdwait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

	}

	// format it to get actual vegetable name
	// convert array into array list for easy search
	// check whether name you extracted is present in arrayList or not

	public static void addItems(WebDriver driver, String[] itemsNeeded) {
		int j = 0;
		int itensQnt = 4;
		List<String> itemsNeededList = Arrays.asList(itemsNeeded);
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		// vai pegar da lista dos 30 elementos que foi transformado em uma lista, e
		// fazer um for, enquanto i não conter o CUCUMBER então
		// ele vem e procura pelo proximo até encontrar em sua lista, ao encontar ele
		// usa o botão ADD TO CART pega o i que ele encontrou e clica

		for (int i = 0; i < products.size(); i++) {

			String[] name = products.get(i).getText().split("-");
			String formatCorret = name[0].trim();

			if (itemsNeededList.contains(formatCorret)) {

				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				// poderia fazer dessa forma MELHOR ainda: (j == itemsNeeded.length) << mais
				// certo
				if (j == itensQnt) {
					break;
				}
			}

		}
	}
}
