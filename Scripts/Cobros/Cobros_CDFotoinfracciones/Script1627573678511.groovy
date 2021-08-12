import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

CustomKeywords.'com.test.demo.CustomFuncions.Login'()

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Repo_Cobros/SubCDFotoinfracciones/a_Cobros'))

WebUI.click(findTestObject('Repo_Cobros/SubCDFotoinfracciones/a_Cobro de Fotoinfracciones'))

WebUI.setText(findTestObject('Repo_Cobros/SubCDFotoinfracciones/input_Placa_vchPlacaConsulta'), '761MM')

WebUI.click(findTestObject('Repo_Cobros/SubCDFotoinfracciones/button_Buscar'))

WebUI.doubleClick(findTestObject('Repo_Cobros/Page_Sistema de Control Vehicular/td9'))

WebUI.scrollToElement(findTestObject('Repo_Cobros/Page_Sistema de Control Vehicular/Generar'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('Repo_Cobros/Page_Sistema de Control Vehicular/Eliminar'))

WebUI.verifyElementNotInViewport(findTestObject('Repo_Cobros/Page_Sistema de Control Vehicular/td9'), 5)

