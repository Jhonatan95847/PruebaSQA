package com.proyect.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class RegisterAdd extends Base {

	// Definición de los localizadores de los elementos para el flujo de RegisteAdd
	// elements->web tables

	By LocatorEL = By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]/div/div[3]/h5");
	By LocatorWT = By.xpath("//*[@id=\"item-3\"]/span");
	By LocatorEle = By.xpath("/html/body/div[2]/div/div/div[1]/div");
	By LocatorWTel = By.xpath("/html/body/div[2]/div/div/div[1]/div");
	By LocatorAD = By.id("addNewRecordButton");
	By LocatorFN = By.id("firstName");
	By LocatorLN = By.id("lastName");
	By LocatorUE = By.id("userEmail");
	By LocatorAG = By.id("age");
	By LocatorSA = By.id("salary");
	By LocatorDE = By.id("department");
	By LocatorSM = By.id("submit");
	By LocatorRE = By.id("registration-form-modal");

	// metodo constructor

	public RegisterAdd(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// Metodo de automatización del flujo RegisterADD agregar un nuevo registro

	public void registerUser() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)"); 				// Realizo un scroll ya que el objeto con el que voy a interactuar
		Thread.sleep(1000); 										// queda por debajo de la publicidad esto me genero un error
		click(LocatorEL); 											// realizando el scroll ya puedo interactuar con el objeto
		Thread.sleep(1000);
		if (isDisplayed(LocatorEle)) { 								// Condicional para confirmar el paso a la siguiente pagina
			Thread.sleep(1000);
			jse.executeScript("window.scrollBy(0,250)");
			click(LocatorWT);
			Thread.sleep(1000);	
			System.out.println("OK Register pages was found");
			if (isDisplayed(LocatorWTel)) {							// Condicional para confirmar el paso a la siguiente pagina						
				Thread.sleep(1000);
				click(LocatorAD);
				Thread.sleep(1000);
				System.out.println("OK Register pages was found");
				if (isDisplayed(LocatorRE)) { 						// Condicional para confirmar que se abre la ventana de agregar un registro
					type("firstName", LocatorFN);
					type("lastName", LocatorLN);
					type("userEmail@gmail.com", LocatorUE);
					type("26", LocatorAG);
					type("2000000", LocatorSA);
					type("department", LocatorDE);
					click(LocatorSM);
					System.out.println("OK Register pages was found");
				} else {
					System.out.print("Register pages was not found");
				}
			} else {
				System.out.print("Register pages was not found");
			}

		} else {
			System.out.print("Register pages was not found");
		}

	}

	public String registerUserMessage() {
		return null;

	}

}
