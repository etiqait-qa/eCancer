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

//for (def index : (0..1)) {
WebUI.sendKeys(findTestObject('e-Cancer/DOB'), '01/01/1980')

WebUI.click(findTestObject('e-Cancer/Form Instruction'))

if (GlobalVariable.Gender == 'Male') {
    WebUI.click(findTestObject('e-Cancer/Gender/Gender - Male'))
} else if (GlobalVariable.Gender == 'Female') {
    WebUI.click(findTestObject('e-Cancer/Gender/Gender - Female'))
}

WebUI.click(findTestObject('e-Cancer/Package Selection'))

