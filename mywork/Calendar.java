package mywork;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companion/");

		driver.findElement(By.name("form_fields[travel_comp_date]")).click();

		// O operador "!" nega a condição, então o loop continuará enquanto o texto
		// dentro do elemento com a classe "flatpickr-month" não contiver a string
		// "December". Uma vez que o mês atual seja "December", a negação se tornará
		// falsa, e o loop será interrompido.
		
		
		
//		while (!driver.findElement(By.xpath("//input[@title='Scroll to increment']")).getText().equals(2025)) {
//			driver.findElement(By.className("arrowUp")).click();
//		}
		
		
		while (!driver.findElement(By.xpath("//div[@class='flatpickr-month']")).getText().contains("April")) {
			
			driver.findElement(By.cssSelector(".flatpickr-next-month")).click();
		}

		Thread.sleep(1000);
		List<WebElement> dayPick = driver.findElements(By.xpath("//span[@Class='flatpickr-day ']"));
		int count = driver.findElements(By.xpath("//span[@Class='flatpickr-day ']")).size();

		for (int i = 0; i < count; i++) {
			String getDay = driver.findElements(By.xpath("//span[@Class='flatpickr-day ']")).get(i).getText();
			if (getDay.equalsIgnoreCase("26")) {
				driver.findElements(By.xpath("//span[@Class='flatpickr-day ']")).get(i).click();
				break;
			}
		}

		Thread.sleep(10000);
		driver.quit();

	}

}
