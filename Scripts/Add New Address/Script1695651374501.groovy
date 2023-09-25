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

WebUI.callTestCase(findTestCase('Login Test'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop/a_johnny.bravotest123.com'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Account/a_Addresses'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Account/input_Austria_button-1 add-address-button'))

WebUI.setText(findTestObject('Object Repository/Page_Demo Web Shop. Account/input_First name_Address.FirstName'), 'Johnny')

WebUI.setText(findTestObject('Object Repository/Page_Demo Web Shop. Account/input_Last name_Address.LastName'), 'Bravo 2')

WebUI.setText(findTestObject('Object Repository/Page_Demo Web Shop. Account/input_Email_Address.Email'), 'johnny.bravo2@test123.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Demo Web Shop. Account/select_Select countryUnited StatesCanadaAfg_dd1e54'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Demo Web Shop. Account/select_Select countryUnited StatesCanadaAfg_dd1e54'), 
    '3', true)

WebUI.setText(findTestObject('Object Repository/Page_Demo Web Shop. Account/input_City_Address.City'), 'Test')

WebUI.setText(findTestObject('Object Repository/Page_Demo Web Shop. Account/input_Address 1_Address.Address1'), 'Test')

WebUI.setText(findTestObject('Object Repository/Page_Demo Web Shop. Account/input_Zip  postal code_Address.ZipPostalCode'), 
    '5000')

WebUI.setText(findTestObject('Object Repository/Page_Demo Web Shop. Account/input_Phone number_Address.PhoneNumber'), '12345678')

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Account/input_Fax number_button-1 save-address-button'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Demo Web Shop. Account/strong_Johnny Bravo 2'), 0)

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Account/btnDeleteNewAddress'))

WebUI.acceptAlert()

WebUI.closeBrowser()

