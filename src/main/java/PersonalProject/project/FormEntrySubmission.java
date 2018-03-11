//package PersonalProject.project;
//
//import java.io.IOException;
//
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;
//import org.openqa.selenium.support.PageFactory;
//
//import com.qa.utils.*;
//
//
//public class FormEntrySubmission implements BaseTest {
//	
//	@FindBy(how=How.ID, using="3602a8c0784c2f9615c24fc26c2-f79")
//	WebElement decimalvalue;
//	
//	@FindBy(how=How.ID, using="pass")
//	WebElement password;
//	
//	@FindBy(how=How.XPATH, using="//span[text()=' green']/parent::label")
//	WebElement likertvalue;
//	
//	@FindBy(how=How.XPATH, using="//select[@id='3602a8c0784c2f9615c24fc26c2-f6a']")
//	WebElement dropdownvalue;
//	
//	@FindBy(how=How.XPATH, using="//div/div[label[contains(.,'5 File')]]/following-sibling::div//div[@class='ajax-file-upload btn btn-green icon-plus add-file']")
//	WebElement filevalue;
//	
//	@FindBy(how=How.ID, using="label3602a8c0784c2f9615c24fc26c2-f60")
//	WebElement radiovalue;
//	
//	@FindBy(how=How.ID, using="label3602a8c0784c2f9615c24fc26c2-f5a']")
//	WebElement checkboxvalue;
//	
//	@FindBy(how=How.ID, using="3602a8c0784c2f9615c24fc26c2-f48")
//	WebElement singletextvalue;
//	
//	@FindBy(how=How.XPATH, using="//label[@id='3602a8c0784c2f9615c24fc26c2-f540']")
//	WebElement rubric1value;
//	
//	@FindBy(how=How.XPATH, using="//label[@id='3602a8c0784c2f9615c24fc26c2-f531']")
//	WebElement rubric2value;
//	
//	@FindBy(how=How.XPATH, using="//button[text()='Add']")
//	WebElement addbtn;
//	
//	@FindBy(how=How.XPATH, using="//a[text()='Cancel']")
//	WebElement cancellink;
//	
//	@FindBy(how=How.XPATH, using="//button[@name='Save']")
//	WebElement assignmentsavebtn;
//	
//	public static String filelocation="C:\\Users\\akakkar\\Documents\\Teacher Work Sample fall 17'.pdf";
//	
//	public FormEntrySubmission()
//	{
//		PageFactory.initElements(BrowserFactory.driver, this);
//	}
//	
//	
//
//	public static void selectDate()
//	{
//		
//	}
//	
//	public static void inputDecimal()
//	{
//		datainputObj.enterText("xpath", "155.023", "//input[@id='3602a8c0784c2f9615c24fc26c2-f79']");
//	}	
//	public static void selectLikert()
//	{
//		clickelementObj.click("xpath", "//span[text()=' green']/parent::label");
//	}
//	public static void selectValueFromDropDown()
//	{
//		datainputObj.selectOptionFromDropdown("xpath", "text", "Lable2", "//select[@id='3602a8c0784c2f9615c24fc26c2-f6a']");
//	}
//	public static void selectFile() throws TestCaseFailed, IOException
//	{
//		clickelementObj.click("xpath", "//div/div[label[contains(.,'5 File')]]/following-sibling::div//div[@class='ajax-file-upload btn btn-green icon-plus add-file']");
//		fileupload.fileUpload("C:\\Users\\akakkar\\Documents\\Teacher Work Sample fall 17'.pdf");
//	}
//	public static void selectRadiobutton()
//	{
//		datainputObj.selectRadioButton("xpath", "//label[@id='label3602a8c0784c2f9615c24fc26c2-f60']");
//	}
//	public static void selectCheckBox()
//	{
//		datainputObj.checkCheckbox("xpath", "//label[@id='label3602a8c0784c2f9615c24fc26c2-f5a']");
//	}
//	
//	public static void inputTextInSingleLine()
//	{
//		datainputObj.enterText("xpath", "Assignment new Text", "//input[@id='3602a8c0784c2f9615c24fc26c2-f48']");
//	}
//	
//	public static void SelectRadioForRubric1()
//	{
//		datainputObj.selectRadioButton("xpath", "//label[@id='3602a8c0784c2f9615c24fc26c2-f540']");
//	}
//	
//	public static void SelectRadioForRubric2()
//	{
//		datainputObj.selectRadioButton("xpath", "//label[@id='3602a8c0784c2f9615c24fc26c2-f531']");
//	}
//	
//	public static void clickAdd()
//	{
//		clickelementObj.click("xpath", "//button[text()='Add']");
//	} 
//	public static void clickCancel()
//	{
//		clickelementObj.click("xpath", "//a[text()='Cancel']");
//	}
//	
//	public static void clickSave()
//	{
//		clickelementObj.click("xpath", "//button[@name='Save']");
//	}
//}
