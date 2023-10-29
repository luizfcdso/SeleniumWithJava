package mywork;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HigorHelp {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
		
		
		driver.findElement(By.cssSelector("a[href='/login']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.findElement(By.name("name")).sendKeys("Luiz");
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("luizxtcosta@gmail.com");
		driver.findElement(By.cssSelector("button[data-qa='signup-button']")).click();	
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.findElement(By.cssSelector("input[type=\"radio\"][value=\"Mr\"]")).click();
        driver.findElement(By.cssSelector("input[type=\"password\"][id=\"password\"]"))
                .sendKeys("12345");
        WebElement dayDropdown = driver.findElement(By.cssSelector("select[data-qa=\"days\"]"));
        WebElement monthDropdown = driver.findElement(By.cssSelector("select[data-qa=\"months\"]"));
        WebElement yearDropdown = driver.findElement(By.cssSelector("select[data-qa=\"years\"]"));

        dayDropdown.click();
        dayDropdown.findElement(By.cssSelector("option[value=\"" + "1" + "\"]")).click();

        monthDropdown.click();
        monthDropdown.findElement(By.xpath("(//option[normalize-space()='January'])[1]")).click();

        yearDropdown.click();
        yearDropdown.findElement(By.xpath("//option[@value='2021']")).click();

        WebElement checkBox = wait.until(ExpectedConditions
                    .elementToBeClickable(By.cssSelector("input[type=\"checkbox\"][id=\"newsletter\"]")));
        checkBox.click();
        driver.findElement(By.cssSelector("input[type=\"text\"][id=\"first_name\"]"))
                .sendKeys("Luiz");
        driver.findElement(By.cssSelector("input[type=\"text\"][id=\"last_name\"]"))
                .sendKeys("Fernando");
        driver.findElement(By.cssSelector("input[type=\"text\"][id=\"address1\"]"))
                .sendKeys("Serraria");
        driver.findElement(By.cssSelector("select[data-qa=\"country\"] option[value=\"Canada\"]"))
                .click();
        driver.findElement(By.cssSelector("input[type=\"text\"][id=\"state\"]"))
                .sendKeys("MG");
        driver.findElement(By.cssSelector("input[type=\"text\"][id=\"city\"]"))
                .sendKeys("Uberlandia");
        driver.findElement(By.cssSelector("input[type=\"text\"][id=\"zipcode\"]"))
                .sendKeys("38407318");
        driver.findElement(By.cssSelector("input[type=\"text\"][id=\"mobile_number\"]"))
                .sendKeys("34990909090");

	}
}
