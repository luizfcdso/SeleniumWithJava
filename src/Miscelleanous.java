//import java.io.File;
//import java.io.IOException;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Miscelleanous {
//
//	public static void main(String[] args) throws IOException {
//
//		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();//deletando cookies
//		
//		
//		driver.get("http://google.com");
//		
//		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//realizando um print
//		FileUtils.copyFile(src, new File("C:\\Users\\Luiz Fernando\\testscreenshot.png"));//guardando o print na pasta
//		
//		
//		
//	}
//
//}
