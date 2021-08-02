package com.test.demo

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords


import internal.GlobalVariable

import org.junit.Test
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

public class CustomFuncions {
	/**
	 * Imprime en consola un saludo.
	 * @return un saludo
	 */
	@Keyword
	def printHello() {
		println("\nHola a todos.\n")
	}

	/**
	 * Imprime un saluda más el nombre otorgado.
	 * @param name es el nombre que entra como parámetro.
	 * @return un saludo con nombre
	 */
	@Keyword
	def printName(String name) {
		println("Hola:" + name)
	}

	/**
	 * Recargar la página (función que se hace al presionar F5) 
	 */
	@Keyword
	def refreshBrowser() {
		KeywordUtil.logInfo("Cargando...")
		WebDriver webDriver = DriverFactory.getWebDriver()
		webDriver.navigate().refresh()
		KeywordUtil.markPassed("Función F5 realizada con éxito")
	}

	/**
	 * Click element
	 * @param Objecto capturado en algún repositorio
	 */
	@Keyword
	def clickElement(TestObject to) {
		try {
			WebElement element = WebUiBuiltInKeywords.findWebElement(to);
			KeywordUtil.logInfo("Clic")
			element.click()
			element.findElement(arg0)
			KeywordUtil.markPassed("Se ha hecho clic en el elemento")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Elemento no encontrado")
		} catch (Exception e) {
			KeywordUtil.markFailed("Error al hacer clic en el elemento")
		}
	}

	/**
	 * Metodo para vefificar la ausencia de un objeto
	 */
	@Keyword
	public void ElementIsF(TestObject to) {
		
		WebElement element = WebUiBuiltInKeywords.findWebElement(to);

		if (element != null) {

			KeywordUtil.markFailed("El elemento: " + to + " NO debería estar presente")
		}else {

			KeywordUtil.markPassed("Éxito en la validación")
		}
	}

	/**
	 * Metodo para el logeo en cada prueba a automatizar
	 */
	@Keyword
	public void Login() {

		WebUI.openBrowser('')

		WebUI.navigateToUrl(GlobalVariable.Url)

		WebUI.click(findTestObject('Repo_Login/Page_Sistema de Control Vehicular/a_Ingresar'))

		WebUI.setText(findTestObject('Repo_Login/Page_Sistema de Control Vehicular/input_Ingresar_inputUsuario'), GlobalVariable.User)

		WebUI.setText(findTestObject('Repo_Login/Page_Sistema de Control Vehicular/input_Ingresar_inputPass'), GlobalVariable.Password)

		WebUI.click(findTestObject('Repo_Login/Page_Sistema de Control Vehicular/button_Entrar'))

		WebUI.delay(3)
	}

	/**
	 * Metodo cuya función es equivalente a contains("Cadena")
	 */
	@Keyword
	public void ElementContains(TestObject to, String cadena) {

		if (to.toString().contains(cadena)) {
			//Marca el estado aprobado
			KeywordUtil.markPassed("éxito en el elemento")
		}else {
			//Marca el estado fallido
			KeywordUtil.markFailed("El elemento no contiene la cadena señalada: " + cadena)
		}
	}
}
