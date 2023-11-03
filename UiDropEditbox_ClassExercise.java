package mywork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UiDropEditbox_ClassExercise {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");

		// name
		driver.findElement(By.name("name")).sendKeys("Luiz Fernando");
		// email
		driver.findElement(By.name("email")).sendKeys("test@test.com");
		// password
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("password");
		// checkbox
		driver.findElement(By.id("exampleCheck1")).click();
		// Gender / sexo
		driver.findElement(By.id("exampleFormControlSelect1")).click();
		driver.findElement(By.xpath("(//select[@class='form-control'])//option[1]")).click();
		// ststus
		driver.findElement(By.id("inlineRadio1")).click();
		// data de aniversario
		driver.findElement(By.name("bday")).sendKeys("19970811");
		// button submit
		driver.findElement(By.xpath("//input[@value=\"Submit\"]")).click();

		// alert
		driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();

		Thread.sleep(5000);
		// driver.close();
	}

}
