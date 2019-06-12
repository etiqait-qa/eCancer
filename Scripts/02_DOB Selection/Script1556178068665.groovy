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

WebUI.click(findTestObject('e-Cancer/Next'))

WebUI.verifyElementText(findTestObject('e-Cancer/DOB Feedback Message'), 'Please enter your Date of Birth')

/*WebUI.setText(findTestObject('e-Cancer/DOB'), '12/23/1980')

WebUI.verifyElementText(findTestObject('e-Cancer/DOB Feedback Message'), 'Please enter a valid Date of Birth')
*/
WebUI.setText(findTestObject('e-Cancer/DOB'), '01/01/2018')

WebUI.verifyElementText(findTestObject('e-Cancer/DOB Feedback Message'), 'Sorry, you are not eligible for this insurance because you did not meet the minimum age limit')

WebUI.clearText(findTestObject('e-Cancer/DOB'))

