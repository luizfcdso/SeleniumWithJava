import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//1. Give me the count of links on the page
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//2 - count how many links have in a part of the grid, the screeen, for exemple on the session of the screen
		
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));//contando quantos links possui em uma parte da tela, por exemplo em um container ou uma sessão da página 
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//3 count how many links have on the column by path and index
		
		
		WebElement columdriver =footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columdriver.findElements(By.tagName("a")).size());
		
		//4 click on each link in the column and check if the pages are opening 
		
		for (int i=1; i<columdriver.findElements(By.tagName("a")).size();i++)
		{
			
			String clickonlink = Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			columdriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
			//Thread.sleep(5000);
		}
			
			Set<String> tabs = driver.getWindowHandles();
			Iterator<String> it = tabs.iterator();
		
			while(it.hasNext())
			{
				//Thread.sleep(3000);
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
			
			

			Thread.sleep(3000);
			driver.quit();
		} 
		
		
		
}


	


