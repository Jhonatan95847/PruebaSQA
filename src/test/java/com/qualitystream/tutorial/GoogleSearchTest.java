package com.qualitystream.tutorial;

//import static org.junit.Assert.assertEquals;

import java.time.Duration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GoogleSearchTest {
	
	private WebDriver driver;
	
	@Before
	
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/?hl=es");
		new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	
	@Test
	
	public void testPageDemo() {
		
		WebElement searchbox = driver.findElement(By.name("q"));
		
		searchbox.clear();
		searchbox.sendKeys("Introducción a la automatización de pruebas");
		searchbox.submit();
		
		new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//assertEquals("Introducción a la automatización de pruebas",driver.getTitle());
	}
	
	@After
	
	public void tearDown() {
		
		driver.quit();
		
		
	}
	
}
