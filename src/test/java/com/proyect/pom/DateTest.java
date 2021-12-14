package com.proyect.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class DateTest extends Base {

	By LocatorWidg = By.xpath("/html/body/div[2]/div/div/div[2]/div/div[4]/div/div[3]/h5");
	By LocatorDate = By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[4]/div/ul/li[3]/span");
	By LocatorCalendar = By.id("datePickerMonthYearInput");

	public DateTest(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void DateSelect() throws InterruptedException {
			Thread.sleep(2000);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,250)");
			Thread.sleep(2000);
			click(LocatorWidg);
			Thread.sleep(2000);
			jse.executeScript("window.scrollBy(0,350)");
			click(LocatorDate);
			Thread.sleep(5000);
			click(LocatorCalendar);
			Thread.sleep(2000);
		
	}

	public String registerUserMessage() {
		return null;
	}

}