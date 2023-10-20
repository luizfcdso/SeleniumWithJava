

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		

//		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.lingq.com/pt/accounts/login/");
//		driver.findElement(By.id("id_username")).sendKeys("luizxtcosta17@outlook.com");//encontrou o nome do id que foi dado ao campo, e preencheu com meu e-mail
//		driver.findElement(By.name("password")).sendKeys("Serraria@859");
//		driver.findElement(By.id("submit-button")).click();
//		driver.findElement(By.className("p.error"));
		// implicit wait - 2 seconds time out
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //vai esperar os segundos para cada execução , serve para esperar um objeto aparecer na pagina
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("luizxtcosta17@outlook.com");//encontrou o nome do id que foi dado ao campo, e preencheu com meu e-mail
		driver.findElement(By.name("inputPassword")).sendKeys("Serraria@859");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();//usando link com texto
		Thread.sleep(1000); // it means that i want to wait some secound before writing 
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("luizfcdso");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Luizxtcosta@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("Luizxtcosta17@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("34984349050");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000); 
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("luizfcdso");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		//driver.close();
		
		
		
		
		
	}

}
