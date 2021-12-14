package com.proyect.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {
	
	protected WebDriver driver;
	
	public Base(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public WebDriver chromeDriverConnection(){
		System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.get("https://demoqa.com/webtables");
		return driver;
	}
	
	public WebElement findelement(By locator) {
		return driver.findElement(locator);
	}
	
	public List<WebElement> findelements(By locator) {
		return driver.findElements(locator);
	}
	
	public String getText(WebElement element) {
		return element.getText();
	}
	
	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}
	
	public void type(String inputText, By locator) {
		driver.findElement(locator).sendKeys(inputText);
	}
	
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	
	public void alert (By locator) {
		 driver.switchTo().alert().accept();
	}
	
	
	public void alertType(String inputText, By locator) {
		 driver.switchTo().alert().sendKeys(inputText);
	}
	
	public Boolean isDisplayed(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
		}catch(org.openqa.selenium.NoSuchElementException e) {
			return false;
			
		}
	}
	
	public void visit(String url) {
		driver.get(url);
	}
	
}
