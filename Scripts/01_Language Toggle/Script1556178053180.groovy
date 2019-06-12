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
/*import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import org.openqa.selenium.remote.DesiredCapabilities as DesiredCapabilities
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

//Open Chrome, since the basic WebUI.OpenBrowser doesn't work
ChromeOptions options = new ChromeOptions()

DesiredCapabilities capabilities = new DesiredCapabilities()

capabilities.setCapability(ChromeOptions.CAPABILITY, options)

System.setProperty('webdriver.chrome.driver', 'D:/Installer/Katalon Studio 6.1.2/chromedriver.exe')

ChromeDriver driver = new ChromeDriver(capabilities)

DriverFactory.changeWebDriver(driver)

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://uat.etiqa.com.my:4442/cancer-care/en/insurance/qq1')
*/
WebUI.selectOptionByLabel(findTestObject('e-Cancer/Language Option'), 'B.Malaysia', false)

WebUI.verifyElementText(findTestObject('e-Cancer/Form Instruction'), 'Sila lengkapkan borang berikut')

WebUI.selectOptionByLabel(findTestObject('e-Cancer/Language Option'), 'English', false)

WebUI.verifyElementText(findTestObject('e-Cancer/Form Instruction'), 'Please complete the form below')

