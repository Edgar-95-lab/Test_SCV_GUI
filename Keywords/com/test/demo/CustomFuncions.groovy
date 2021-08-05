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

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.testobject.SelectorMethod

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join
import org.testng.asserts.SoftAssert



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
	 * Verificar el elemento
	 * @param Objecto capturado en algún repositorio
	 */
	@Keyword
	def clickElement(TestObject to) {

		try {
			WebElement element = WebUiBuiltInKeywords.findWebElement(to);
			KeywordUtil.logInfo("Clic")
			element.click()
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
	public void ElementIsPresent(TestObject to) {

		if (to.find() == null) {
			
			KeywordUtil.markFailed("El elemento: " + to + " NO está presente o tarda demasiado en responder")
		}else {
			KeywordUtil.markPassed("Éxito en la validación, el elemento: " + to + " se encuentra presente")
			
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
	 * Metodo para el logeo (Puebla) en cada prueba a automatizar
	 */
	@Keyword
	public void LoginPuebla() {

		WebUI.openBrowser('')

		WebUI.navigateToUrl(GlobalVariable.UrlP)

		WebUI.click(findTestObject('Repo_Login/Page_Sistema de Control Vehicular/a_Ingresar'))

		WebUI.setText(findTestObject('Repo_Login/Page_Sistema de Control Vehicular/input_Ingresar_inputUsuario'), GlobalVariable.UserP)

		WebUI.setText(findTestObject('Repo_Login/Page_Sistema de Control Vehicular/input_Ingresar_inputPass'), GlobalVariable.PasswordP)

		WebUI.click(findTestObject('Repo_Login/Page_Sistema de Control Vehicular/button_Entrar'))

		WebUI.delay(3)
	}
	
	public void SelectDate() {
		SoftAssert softAssertion = new SoftAssert();
		WebUI.openBrowser('https://www.google.com/')
		def driver = DriverFactory.getWebDriver()
		String baseUrl = "https://www.google.com/"
		selenium = new WebDriverBackedSelenium(driver, baseUrl)
		selenium.open("https://scvpueblatest.intecproof.com/FormEnvioIngresPlacas#!")
		selenium.type("id=dtFechaInicio", "")
		selenium.type("id=dtFechaInicio", ("1900-01-01").toString())
		selenium.type("id=dtFechaInicio", "")
		selenium.type("id=dtFechaInicio", ("1900-01-01").toString())
		selenium.type("id=dtFechaInicio", ("0002-01-01").toString())
		selenium.type("id=dtFechaInicio", ("0020-01-01").toString())
		selenium.type("id=dtFechaInicio", ("0202-01-01").toString())
		selenium.type("id=dtFechaInicio", ("2021-01-01").toString())
		selenium.type("id=dFechaFin", "")
		selenium.type("id=dFechaFin", ("1900-01-01").toString())
		selenium.type("id=dFechaFin", "")
		selenium.type("id=dFechaFin", ("1900-08-01").toString())
		selenium.type("id=dFechaFin", ("0002-08-01").toString())
		selenium.type("id=dFechaFin", ("0020-08-01").toString())
		selenium.type("id=dFechaFin", ("0202-08-01").toString())
		selenium.type("id=dFechaFin", ("2021-08-01").toString())
		selenium.click("xpath=//div[@id='BusquedaFormas']/form")
		
		
	}

	/**
	 * Metodo cuya función es equivalente a contains("Cadena")
	 */
	@Keyword
	public void ElementContains(TestObject object, String cadena) {

		if (object.toString().contains(cadena)) {
			//Marca el estado aprobado
			KeywordUtil.markPassed("éxito en el elemento")
		}else {
			//Marca el estado fallido
			KeywordUtil.markFailed("El elemento no contiene la cadena señalada: " + cadena)
		}
	}
}
