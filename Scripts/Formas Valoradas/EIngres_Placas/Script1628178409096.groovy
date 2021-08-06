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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import cucumber.runtime.Timeout as Timeout
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

CustomKeywords.'com.test.demo.CustomFuncions.LoginPuebla'()

WebUI.click(findTestObject('Repo_FormasValoradas/Page_Sistema de Control Vehicular/a_Formas Valoradas'))

WebUI.click(findTestObject('Repo_FormasValoradas/Page_Sistema de Control Vehicular/a_Comunicacin Ingres'))

WebUI.click(findTestObject('Repo_FormasValoradas/Page_Sistema de Control Vehicular/a_Envio a Ingres (Placas)'))

WebUI.delay(2)

CustomKeywords.'com.test.demo.CustomFuncions.clickElement'(findTestObject('Repo_FormasValoradas/Page_Sistema de Control Vehicular/input_Tipo de formato'))

WebUI.click(findTestObject('Repo_FormasValoradas/Page_Sistema de Control Vehicular/input_Tipo de formato'))

WebUI.click(findTestObject('Repo_FormasValoradas/Page_Sistema de Control Vehicular/button_1 - PLACAS AUTO PARTICULAR'))

CustomKeywords.'com.test.demo.CustomFuncions.clickElement'(findTestObject('Repo_FormasValoradas/Page_Sistema de Control Vehicular/input_Tipo de formato final'))

WebUI.click(findTestObject('Repo_FormasValoradas/Page_Sistema de Control Vehicular/input_Tipo de formato final'))

WebUI.click(findTestObject('Repo_FormasValoradas/Page_Sistema de Control Vehicular/button_97 - BOMBEROS'))

WebUI.setText(findTestObject('Repo_FormasValoradas/Page_Sistema de Control Vehicular/input_Fecha de Inicial_dtFechaInicio'), 
    '01/01/2021')

WebUI.setText(findTestObject('Repo_FormasValoradas/Page_Sistema de Control Vehicular/input_Fecha de Fin_dFechaFin'), '01/07/2021')

WebUI.setText(findTestObject('Repo_FormasValoradas/Page_Sistema de Control Vehicular/input_Fecha de Inicial_dtFechaInicio'), 
    '01/01/2021')

WebUI.setText(findTestObject('Repo_FormasValoradas/Page_Sistema de Control Vehicular/input_Fecha de Fin_dFechaFin'), '01/07/2021')

WebUI.click(findTestObject('Repo_FormasValoradas/Page_Sistema de Control Vehicular/button_Consultar'))

WebUI.verifyElementInViewport(findTestObject('Repo_FormasValoradas/Page_Sistema de Control Vehicular/div_Almacen'), 10)

WebUI.delay(5)

