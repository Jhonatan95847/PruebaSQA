package com.proyect.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class DateTest extends Base {

	// Definición de los localizadores de los elementos para el flujo de DateTest
	// Widgets->Date Picker

	By LocatorWidg = By.xpath("/html/body/div[2]/div/div/div[2]/div/div[4]/div/div[3]/h5");
	By LocatorDate = By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[4]/div/ul/li[3]/span");
	By LocatorWidgTex = By.xpath("/html/body/div[2]/div/div/div[1]/div");
	By LocatorDateTex = By.xpath("/html/body/div[2]/div/div/div[1]/div");
	By LocatorDateDay = By.xpath(
			"/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div[5]");
	By LocatorCalendar = By.id("datePickerMonthYearInput");

	// metodo constructor

	public DateTest(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// Metodo de automatización del flujo DateTest seleccionar cualquier fecha en
	// las opciones

	public void DateSelect() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)");						// Realizo un scroll ya que el objeto con el que voy a interactuar
		Thread.sleep(2000);													// queda por debajo de la publicidad esto me genero un error
		click(LocatorWidg);													// realizando el scroll ya puedo interactuar con el objeto
		Thread.sleep(2000);
		if (isDisplayed(LocatorWidgTex)) {									// Condicional para confirmar el paso a la siguiente pagina
			jse.executeScript("window.scrollBy(0,350)");
			click(LocatorDate);
			Thread.sleep(5000);
			System.out.println("OK Register pages was found");
			if (isDisplayed(LocatorDateTex)) {								// Condicional para confirmar el paso a la siguiente pagina
				click(LocatorCalendar);
				Thread.sleep(2000);
				click(LocatorDateDay);
				Thread.sleep(2000);
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