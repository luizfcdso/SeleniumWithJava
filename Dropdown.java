

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();// coloca a aba do browser em maximo full 
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); // url of the browser

		//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled()); //verificando se a data está disponivel
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("Style"));
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click(); //clicando no round trip 
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("Style"));
		
		if(driver.findElement(By.id("Div1")).getAttribute("Style").contains("1"))
		{
			System.out.println("Its enabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		

		//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled()); //verificando se a data está disponivel
		
		
		
		//From
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		
		//TO
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='MAA'][normalize-space()='Chennai (MAA)'])[2]")).click();//usando a selectors hub consegui encontrar ela, a explicação tá abaixo

		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-default")).click();
		
		
		
		
		
		driver.close();
		//<Exemplos abaixo>
		/*//a: Isso indica que estamos procurando por um elemento a em qualquer lugar do documento.

[@value='MAA']: Isso especifica um predicado para o elemento a, indicando que deve ter um atributo 

chamado value com o valor 'MAA'.

[normalize-space()='Chennai (MAA)']: Este é outro predicado. Ele indica que o texto dentro do elemento a

(após a normalização de espaço) deve ser igual a 'Chennai (MAA)'. normalize-space() é

uma função XPath que remove espaços extras no início, no final e entre as palavras de uma string.

[2]: Este último predicado está indicando que estamos selecionando o segundo elemento 

que corresponde aos critérios mencionados anteriormente.*/
	}

}
