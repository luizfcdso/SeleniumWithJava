package mywork;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Broken URL
		// 1 Step - Is to get all urls tied up to the liks using selenium
		// Java Methods will call URL's and gets the status code
		// if status code >400 then that url is not working - > link wich tied to url is
		// broken
		// 'a[href*="soapui"]'

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links = driver.findElements(By.cssSelector("li[class$='gf-li'] a"));
		SoftAssert a = new SoftAssert();
		
		
		for (WebElement link : links)
		{
			String url = link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respostaCode = conn.getResponseCode();
			System.out.println(respostaCode);
			a.assertTrue(respostaCode<404, "The link with Text " +link.getText() + " is Broken with code  " + respostaCode);
			
			} 
		
		a.assertAll();
		
		
		
		

		// Cria uma conexão HTTP usando a classe HttpURLConnection para a URL contida na
		// variável url. Em resumo, ele está tentando acessar a URL do link "soapui"
		// encontrado na página anterior.
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
		
		
	}

}
