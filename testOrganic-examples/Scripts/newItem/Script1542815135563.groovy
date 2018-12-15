import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://mie.zapto.org:8080/organic/spring_security_login;jsessionid=B7CDAC3CB5B8E9F6F195017F0F1AA3AC')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_j_username'), 'boss.organic')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_j_password'), 'b1SUrJW9MZA=')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_submit'))

WebUI.click(findTestObject('Object Repository/Page_organic/img_Image17'))

WebUI.click(findTestObject('Object Repository/Page_organic - Stock Registration/a_  New'))

WebUI.setText(findTestObject('Object Repository/Page_organic - Stock Registration/input_ox_organic_Item__itemNam'), 'KITHUL 100')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_organic - Stock Registration/select_05 GallonDispenserNew B'), 
    '12', true)

WebUI.setText(findTestObject('Object Repository/Page_organic - Stock Registration/input_ox_organic_Item__upc'), '0')

WebUI.setText(findTestObject('Object Repository/Page_organic - Stock Registration/input_ox_organic_Item__disc'), '5')

WebUI.setText(findTestObject('Object Repository/Page_organic - Stock Registration/input_ox_organic_Item__puDisc'), '10')

WebUI.setText(findTestObject('Object Repository/Page_organic - Stock Registration/input_ox_organic_Item__rowId'), '2')



WebUI.selectOptionByValue(findTestObject('Object Repository/Page_organic - Stock Registration/select_BOTTLES LANKA (PVT) LTD'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Page_organic - Stock Registration/a_  Save'))

WebUI.closeBrowser()

