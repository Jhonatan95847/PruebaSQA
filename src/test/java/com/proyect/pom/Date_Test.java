package com.proyect.pom;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;

public class Date_Test {
	
	private WebDriver driver;
	DateTest registeradd;
	
	@BeforeMethod
	public void setUp() throws Exception {
		registeradd = new DateTest(driver);
		driver = registeradd.chromeDriverConnection();
		registeradd.visit("https://demoqa.com/");
	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		registeradd.DateSelect();
	}

}
