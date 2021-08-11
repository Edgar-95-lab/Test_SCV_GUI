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

WebUI.click(findTestObject('Repo_Vehículos/Page_Sistema de Control Vehicular/a_Vehculos'))

WebUI.click(findTestObject('Repo_Vehículos/Page_Sistema de Control Vehicular/a_Consulta'))

WebUI.click(findTestObject('Repo_Vehículos/Page_Sistema de Control Vehicular/a_Consulta Infracciones'))

WebUI.delay(2)

WebUI.setText(findTestObject('Repo_Vehículos/Page_Sistema de Control Vehicular/input_Serie_vchSerie'), 'WF0WS4NT3JTB56838')

WebUI.comment('3N1EB31S37K311977')

WebUI.click(findTestObject('Repo_Vehículos/Page_Sistema de Control Vehicular/button_Buscar'))

WebUI.verifyElementNotVisibleInViewport(findTestObject('Repo_Vehículos/Page_Sistema de Control Vehicular/ERROR'), 0)

WebUI.delay(5)

WebUI.closeBrowser()

