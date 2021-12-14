package com.proyect.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class RegisterAdd extends Base {

	By LocatorEL = By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]/div/div[3]/h5");
	By LocatorWT = By.xpath("//*[@id=\"item-3\"]/span");
	By LocatorAD = By.id("addNewRecordButton");
	By LocatorFN = By.id("firstName");
	By LocatorLN = By.id("lastName");
	By LocatorUE = By.id("userEmail");
	By LocatorAG = By.id("age");
	By LocatorSA = By.id("salary");
	By LocatorDE = By.id("department");
	By LocatorSM = By.id("submit");
	By LocatorRE = By.id("registration-form-modal");

	public RegisterAdd(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void registerUser() throws InterruptedException {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,250)");
			Thread.sleep(1000);
			click(LocatorEL);
			Thread.sleep(1000);
			jse.executeScript("window.scrollBy(0,250)");
			click(LocatorWT);
			Thread.sleep(1000);
			click(LocatorAD);
			Thread.sleep(1000);
			if (isDisplayed(LocatorRE)) {
				type("firstName", LocatorFN);
				type("lastName", LocatorLN);
				type("userEmail@gmail.com", LocatorUE);
				type("26", LocatorAG);
				type("2000000", LocatorSA);
				type("department", LocatorDE);
				click(LocatorSM);
			} else {
				System.out.print("Register pages was not found");
			}
		
	}

	public String registerUserMessage() {
		return null;

	}

}
