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

WebUI.click(findTestObject('Repo_Sistema/Page_Sistema de Control Vehicular/a_Sistema'))

WebUI.click(findTestObject('Repo_Sistema/Page_Sistema de Control Vehicular/a_Usuarios'))

WebUI.click(findTestObject('Repo_Sistema/Page_Sistema de Control Vehicular/a_Alta de Usuarios'))

WebUI.setText(findTestObject('Repo_Sistema/Page_Sistema de Control Vehicular/input_Nombre_vchNombreConsulta'), 'EDGAR')

WebUI.click(findTestObject('Repo_Sistema/Page_Sistema de Control Vehicular/button_Buscar'))

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Repo_Sistema/Page_Sistema de Control Vehicular/td_MEDINA GAYTAN EDGAR'))

WebUI.doubleClick(findTestObject('Repo_Sistema/Page_Sistema de Control Vehicular/td_4242 2525252525'))

WebUI.click(findTestObject('Repo_Sistema/Page_Sistema de Control Vehicular/button_Modificar Domicilio'))

println('El ícono mostrado en el cuadro de diálogo es incorrecto, ya que no se está realizando alguna interrogativa...')

WebUI.verifyElementNotInViewport(findTestObject('Repo_Sistema/Page_Sistema de Control Vehicular/i_RELACIONES_fa fa-question-circle fa-5x text-primary'), 
    0)

WebUI.delay(2)

WebUI.click(findTestObject('Repo_Sistema/Page_Sistema de Control Vehicular/button_Cancelar'))

WebUI.click(findTestObject('Repo_Sistema/Page_Sistema de Control Vehicular/button_Volver a la lista'))

WebUI.click(findTestObject('Repo_Sistema/Page_Sistema de Control Vehicular/input_Control Contacto_form-control valid'))

WebUI.click(findTestObject('Repo_Sistema/Page_Sistema de Control Vehicular/button_Modificar Contacto'))

WebUI.click(findTestObject('Repo_Sistema/Page_Sistema de Control Vehicular/button_Guardar Contacto'))

WebUI.click(findTestObject('Repo_Sistema/Page_Sistema de Control Vehicular/button_Continuar'))

WebUI.scrollToElement(findTestObject('Repo_Sistema/Page_Sistema de Control Vehicular/button_Modificar Contacto'), 0)

WebUI.click(findTestObject('Repo_Sistema/Page_Sistema de Control Vehicular/button_Volver a la lista'))

println('El botón: Volver a la lista, no presenta ninguna función, además de ser innecesario debido a que sólo existe un contacto agregado...')

WebUI.verifyElementNotInViewport(findTestObject('Repo_Sistema/Page_Sistema de Control Vehicular/button_Volver a la lista'), 
    0)

WebUI.delay(2)

