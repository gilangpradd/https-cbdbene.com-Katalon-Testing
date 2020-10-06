import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.delay(5)

WebUI.click(findTestObject('a_Shop All'))

WebUI.click(findTestObject('Object Repository/button_Add to Cart'))

WebUI.click(findTestObject('Object Repository/div_'))

WebUI.click(findTestObject('Object Repository/div_'))

WebUI.click(findTestObject('Object Repository/div_'))

WebUI.click(findTestObject('Object Repository/div_-'))

WebUI.click(findTestObject('Object Repository/div_-'))

WebUI.click(findTestObject('Object Repository/div_-'))

WebUI.click(findTestObject('Object Repository/a_Proceed to checkout'))

WebUI.click(findTestObject('Object Repository/img'))

WebUI.setText(findTestObject('Object Repository/input_Welcome back_login_email'), 'gpradana6@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/input_Welcome back_login_password'), 'zZKAoXcCd1dL9zrGUM7Dpw==')

WebUI.click(findTestObject('Object Repository/button_Login'))

WebUI.setText(findTestObject('Object Repository/input_Payment_checkoutInfo_email'), 'gpradana6@gmail.com')

WebUI.setText(findTestObject('Object Repository/input_Payment_firstname'), 'gilang')

WebUI.setText(findTestObject('Object Repository/input_Payment_lastname'), 'pradana')

WebUI.setText(findTestObject('Object Repository/input_Payment_number'), '5645646')

WebUI.setText(findTestObject('Page_Bene/input_Payment_ant-input'), 'BE')

WebUI.click(findTestObject('Object Repository/div_Bekasi Kota Bekasi Jawa Barat Indonesia'))

WebUI.setText(findTestObject('Object Repository/input_Payment_ant-input'), 'Bekasi, Kota Bekasi, Jawa Barat, Indonesia')

WebUI.setText(findTestObject('Object Repository/input_Payment_zipcode'), '454545')

WebUI.click(findTestObject('Object Repository/button_Continue'))

WebUI.click(findTestObject('Object Repository/input_Payment_ant-radio-input'))

WebUI.click(findTestObject('Object Repository/input_Payment_ant-radio-input'))

WebUI.click(findTestObject('Object Repository/button_Continue to Shipping'))

