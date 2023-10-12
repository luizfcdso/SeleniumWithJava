

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class first {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());//mostrando qual é o titulo do site
		System.out.println(driver.getCurrentUrl());//mostrando url atual
		driver.get("https://chat.openai.com/");
		System.out.println(driver.getTitle());//mostrando qual é o titulo do site
		System.out.println(driver.getCurrentUrl());//mostrando url atual
		driver.close();//works too with .close
		
		

	}

}
