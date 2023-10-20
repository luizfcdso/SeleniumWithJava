
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdateDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		// 1 first, validando se foi selecionado
		// System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());

		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		// before to use assert >
		// System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());

		// Count the number of checkboxes
		// System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("hrefIncAdt")).click();

		// int i=1;
		/*
		 * while(i<4) { driver.findElement(By.id("hrefIncAdt")).click(); i++; }
		 */
		for (int i = 1; i < 2; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}

		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='paxinfo']")).getText(), "3 Adult");
		// System.out.println(driver.findElement(By.xpath("//div[@class='paxinfo']")).getText());//getting
		// the text by class and xpath

//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//a[@value='MAA']")).click();
//		Thread.sleep(1000);
//	    System.out.println(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).getText());
		driver.close();
	}

}
