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

WebUI.click(findTestObject('img'))

WebUI.setText(findTestObject('Object Repository/input_Welcome back_login_email'), 'gpradana6@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/input_Welcome back_login_password'), 'zZKAoXcCd1dL9zrGUM7Dpw==')

WebUI.click(findTestObject('Object Repository/button_Login'))

WebUI.click(findTestObject('img'))

WebUI.delay(6)

WebUI.click(findTestObject('span_My Account'))

WebUI.click(findTestObject('a_MY SUBSCRIPTION'))

WebUI.click(findTestObject('a_MY ADDRESS'))

WebUI.click(findTestObject('a_CHANGE PASSWORD'))

WebUI.click(findTestObject('a_PAYMENT METHOD'))

