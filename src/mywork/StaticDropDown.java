package mywork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
		
		//Este código, em resumo, configura o Selenium para usar o driver do Chrome, acessa uma determinada página,
		//localiza um menu suspenso na página e cria um objeto Select para interagir com esse menu suspenso.
		//Esse tipo de automação é comumente usado em testes de software para simular interações do usuário em um navegador web.

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		
		// SHOWING 3 DIFFERENT WAYS HOW U CAN GET THE OPTIONS BY DROPDOWN
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());//vai mostrar qual foi a opção selecionada
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());// GET FIRST SELECTED PEGA A PRIMEIRA OPÇÃO SENDO MOSTRADA 

	
	
	}

}
