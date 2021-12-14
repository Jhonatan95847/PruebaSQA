package com.proyect.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class AlertTest extends Base {

	By LocatorAlFr = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]/div/div[3]/h5");
	By LocatorAlert = By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[2]/span");
	By LocatorButon = By.id("alertButton");
	By LocatorTimer = By.id("timerAlertButton");
	By LocatorConfi = By.id("confirmButton");
	By LocatorText = By.id("promtButton");

	public AlertTest(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void aslertsView() throws InterruptedException {

			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,250)");
			Thread.sleep(1000);
			click(LocatorAlFr);
			Thread.sleep(1000);
			jse.executeScript("window.scrollBy(0,500)");
			Thread.sleep(1000);
			click(LocatorAlert);
			Thread.sleep(1000);
			click(LocatorButon);
			Thread.sleep(1000);
			alert(LocatorButon);
			Thread.sleep(1000);
			click(LocatorTimer);
			Thread.sleep(6000);
			alert(LocatorTimer);
			Thread.sleep(1000);
			click(LocatorConfi);
			Thread.sleep(1000);
			alert(LocatorConfi);
			jse.executeScript("window.scrollBy(0,250)");
			Thread.sleep(1000);
			click(LocatorText);
			Thread.sleep(1000);
			alertType("Jhonatan", LocatorText);
			Thread.sleep(2000);
			alert(LocatorText);
			Thread.sleep(1000);
		}

	public String registerUserMessage() {
		return null;
	}

}