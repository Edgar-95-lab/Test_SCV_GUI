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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Repo_Requer-Créditos/RecepciónDReq_Cred_Conv/a_Requer-Crditos'))

WebUI.click(findTestObject('Repo_Requer-Créditos/RecepciónDReq_Cred_Conv/a_Comunicacin Ingres'))

WebUI.click(findTestObject('Repo_Requer-Créditos/RecepciónDReq_Cred_Conv/a_Recepcin de RequerimentosCredConv'))

WebUI.delay(2)

WebUI.setText(findTestObject('Repo_Requer-Créditos/RecepciónDReq_Cred_Conv/input_Direccin del archivo_IdDireccionArchivoCreditos'), 
    'C:\\Users\\Edgar García\\Desktop\\Sistema de Control Vehicular_Test\\1.- Manual de Usuario Rol Analista Movtos Part.pdf')

WebUI.click(findTestObject('Repo_Requer-Créditos/RecepciónDReq_Cred_Conv/span_Direccin del archivo'))

WebUI.click(findTestObject('Repo_Requer-Créditos/RecepciónDReq_Cred_Conv/button_Validar datos'))

WebUI.delay(2)

WebUI.verifyElementNotInViewport(findTestObject('Repo_Requer-Créditos/Page_Sistema de Control Vehicular/alerta_error al cargar'), 
    2)

WebUI.delay(3)

WebUI.closeBrowser()

