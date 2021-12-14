package com.proyect.pom;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;

public class Register_test {
	
	private WebDriver driver;
	RegisterAdd registeradd;
	
	//Abrir el navegador en la direccion de la web que se va atestear
	
	@BeforeMethod
	public void setUp() throws Exception {       
		registeradd = new RegisterAdd(driver);
		driver = registeradd.chromeDriverConnection();
		registeradd.visit("https://demoqa.com/"); //webtables
	}

	
	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		registeradd.registerUser();
	}

}
