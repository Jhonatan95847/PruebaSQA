package com.qualitystream.tutorial;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DemoSQATest {

	private WebDriver driver;
	
	//By LocatorWT = By.className("Web");
	By LocatorAD = By.id("addNewRecordButton");
	By LocatorFN = By.id("firstName");
	By LocatorLN = By.id("lastName");
	By LocatorUE = By.id("userEmail");
	By LocatorAG = By.id("age");
	By LocatorSA = By.id("salary");
	By LocatorDE = By.id("department");
	By LocatorSM = By.id("submit");
	By LocatorRE = By.id("registration-form-modal");
	
	
	
	@Before
	
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/webtables");
	}
	
	@Test
	
	public void testPageDemo() throws InterruptedException {
		//driver.findElement(LocatorWT).click();
		//Thread.sleep(2000);
		driver.findElement(LocatorAD).click();
		Thread.sleep(2000);
		if(driver.findElement(LocatorRE).isDisplayed()) {
			driver.findElement(LocatorFN).sendKeys("Jhonatan");
			Thread.sleep(2000);
			driver.findElement(LocatorLN).sendKeys("Avella");
			Thread.sleep(2000);
			driver.findElement(LocatorUE).sendKeys("Jhonatan@gmail.com");
			Thread.sleep(2000);
			driver.findElement(LocatorAG).sendKeys("26");
			Thread.sleep(2000);
			driver.findElement(LocatorSA).sendKeys("2000000");
			Thread.sleep(2000);
			driver.findElement(LocatorDE).sendKeys("Boyaca");
			Thread.sleep(2000);
			driver.findElement(LocatorSM).click();
			Thread.sleep(2000);
		}
		else {
			System.out.print("Register pages was not found");		
		}
		
	}
	
	@After
	
	public void tearDown() {	
		driver.quit();
	}
	
	
	
	
}
