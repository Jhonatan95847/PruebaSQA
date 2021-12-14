package com.proyect.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class AlertTest extends Base {

	// Definición de los localizadores de los elementos para el flujo de AlertTest:
	// Alerts,Frame & Windows->Alerts

	By LocatorAlFr = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]/div/div[3]/h5");
	By LocatorAlert = By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[2]/span");
	By LocatorAlFrTe = By.xpath("/html/body/div[2]/div/div/div[1]/div");
	By LocatorAleTe = By.xpath("/html/body/div[2]/div/div/div[1]/div");
	By LocatorButon = By.id("alertButton");
	By LocatorTimer = By.id("timerAlertButton");
	By LocatorConfi = By.id("confirmButton");
	By LocatorText = By.id("promtButton");

	// metodo constructor

	public AlertTest(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// Metodo de automatización del flujo Alerts con las 4 tipos de ventanas
	// emergentes

	public void aslertsView() throws InterruptedException {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)"); 							// Realizo un scroll ya que el objeto con el que voy a interactuar
		Thread.sleep(1000); 													// queda por debajo de la publicidad esto me genero un error
		click(LocatorAlFr); 													// realizando el scroll ya puedo interactuar con el objeto
		Thread.sleep(1000);
		if (isDisplayed(LocatorAlFrTe)) {										// Condicional para confirmar el paso a la siguiente pagina											
			jse.executeScript("window.scrollBy(0,500)");
			Thread.sleep(1000);
			System.out.println("OK Register pages was found");
			if (isDisplayed(LocatorAleTe)) {									// Condicional para confirmar el paso a la siguiente pagina
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
				System.out.println("OK Register pages was found");
			} else {
				System.out.print("Register pages was not found");
			}

		} else {
			System.out.print("Register pages was not found");
		}

	}

	// public String registerUserMessage() {
	// return null;
	// }

}