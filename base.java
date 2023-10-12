import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		int j=0;
		String[] itemsNeeded = {"Cucumber","Brocolli","Beetrot"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		// vai pegar da lista dos 30 elementos que foi transformado em uma lista, e
		// fazer um for, enquanto i não conter o CUCUMBER então
		// ele vem e procura pelo proximo até encontrar em sua lista, ao encontar ele
		// usa o botão ADD TO CART pega o i que ele encontrou e clica

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			
			String[] name = products.get(i).getText().split("-");
			String formatCorret = name[0].trim();
			
			
			//format it to get actual vegetable name
			//convert array into array list for easy search 
			//check whether name you extracted is present in arrayList or not
			
			List itemsNeededList = Arrays.asList(itemsNeeded);
			
			
			if (itemsNeededList.contains(formatCorret)) {
				
				j++;
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				
				if(j==5)
				{
				break;
				}
				}
				
		}
	}

}
