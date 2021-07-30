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

WebUI.click(findTestObject('Repo_REC/Page_Sistema de Control Vehicular/a_REC'))

WebUI.click(findTestObject('Repo_REC/Page_Sistema de Control Vehicular/a_Personas'))

WebUI.setText(findTestObject('Repo_REC/Page_Sistema de Control Vehicular/input_Nombre_vchNombreConsulta'), 'EDGAR')

WebUI.verifyElementClickable(findTestObject('Repo_REC/Page_Sistema de Control Vehicular/button_Buscar'))

WebUI.click(findTestObject('Repo_REC/Page_Sistema de Control Vehicular/button_Buscar'))

WebUI.click(findTestObject('Repo_REC/Page_Sistema de Control Vehicular/button_Mostrar'))

WebUI.delay(2)

WebUI.delay(2)

WebUI.click(findTestObject('Repo_REC/Page_Sistema de Control Vehicular/button_Limpiar'))

WebUI.setText(findTestObject('Repo_REC/Page_Sistema de Control Vehicular/input_Control persona_iIdPersonaConsulta'), '112609')

WebUI.click(findTestObject('Repo_REC/Page_Sistema de Control Vehicular/button_Buscar'))

WebUI.delay(2)

WebUI.click(findTestObject('Repo_REC/Page_Sistema de Control Vehicular/button_Limpiar'))

WebUI.setText(findTestObject('Repo_REC/Page_Sistema de Control Vehicular/input_RFC_vchRFCconsulta'), 'MEGE870901LL6')

WebUI.click(findTestObject('Repo_REC/Page_Sistema de Control Vehicular/button_Buscar'))

WebUI.delay(2)

WebUI.click(findTestObject('Repo_REC/Page_Sistema de Control Vehicular/button_Limpiar'))

WebUI.setText(findTestObject('Repo_REC/Page_Sistema de Control Vehicular/input_CURP_vchCURPConsulta'), 'MEGE870901HPLDYD01')

WebUI.click(findTestObject('Repo_REC/Page_Sistema de Control Vehicular/button_Buscar'))

WebUI.delay(2)

WebUI.click(findTestObject('Repo_REC/Page_Sistema de Control Vehicular/a_Materias'))

WebUI.click(findTestObject('Repo_REC/Page_Sistema de Control Vehicular/a_Consulta de Relaciones'))

WebUI.verifyElementText(findTestObject('Repo_REC/Page_Sistema de Control Vehicular/div_112609'), '112609')

WebUI.verifyElementText(findTestObject('Repo_REC/Page_Sistema de Control Vehicular/div_MEGE870901LL6'), 'MEGE870901LL6')

CustomKeywords.'com.test.demo.FuncionesGUI.refreshBrowser'()

WebUI.delay(10)

WebUI.click(findTestObject('Repo_REC/Page_Sistema de Control Vehicular/a_REC'))

WebUI.click(findTestObject('Repo_REC/Page_Sistema de Control Vehicular/a_Personas'))

