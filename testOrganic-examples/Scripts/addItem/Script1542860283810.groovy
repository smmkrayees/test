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

WebUI.click(findTestObject('Object Repository/Page_organic - Stock Registration/a_  New'))

WebUI.setText(findTestObject('Object Repository/Page_organic - Stock Registration/input_ox_organic_Item__itemNam'), name)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_organic - Stock Registration/select_BOTTLES LANKA (PVT) LTD'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_organic - Stock Registration/select_05 GallonDispenserNew B'), 
    '12', true)

WebUI.setText(findTestObject('Object Repository/Page_organic - Stock Registration/input_ox_organic_Item__disc'), '10')

WebUI.click(findTestObject('Object Repository/Page_organic - Stock Registration/a_  Save'))

WebUI.click(findTestObject('Page_organic - Stock Registration/td_Stock Registration created'))

