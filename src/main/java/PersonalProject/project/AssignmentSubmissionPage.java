//package PersonalProject.project;
//import java.io.IOException;
//
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;
//import org.openqa.selenium.support.PageFactory;
//
//import com.qa.utils.*;
//
//public class AssignmentSubmissionPage implements BaseTest {
//
//	String coursePagetitle="TK20 | Courses";
//
//	String assignmentname="Assignment 1234";
//
//
//	@FindBy(how=How.XPATH, using="//a[@href='#Courses']")
//	WebElement coursesidemenu;
//
//	@FindBy(how=How.XPATH, using="//a[@href='#CoursesCoursework']")
//	WebElement courseworksidemenu;
//
//	@FindBy(how=How.XPATH, using="//a[contains(@onclick, 'Assignment 1234')]")
//	WebElement assignmentlink;
//
//	@FindBy(how=How.XPATH, using="//a[@href='#Details']")
//	WebElement detailssubtab;
//
//	@FindBy(how=How.XPATH, using="//button[@id='addartifact3602a8c0784c2f9615c24fc26c2-f1a']")
//	WebElement artifactselectbtn;
//
//	@FindBy(how=How.XPATH, using="//button[@id='submitbtn']")
//	WebElement assignmentsubmitbtn;
//
//	@FindBy(how=How.XPATH, using="//a[contains(@onclick, 'Assignment 1234')]/preceding::label[@for='370b11ac5ec37d9415ebd04ab304e6d']\"")
//	WebElement selectassignmentcheckbox;
//
//	@FindBy(how=How.XPATH, using="//a[contains(@onclick, 'Assignment 1234')]/preceding::span[2]/span")
//	WebElement pendingflag;
//
//	@FindBy(how=How.XPATH, using="//button[@data-original-title='Recall']")
//	WebElement recallbtn;
//
//
//
//	public AssignmentSubmissionPage()
//	{
//		PageFactory.initElements(BrowserFactory.driver, this);
//	}
//
//	public static void clickCoursesSidemenu()
//	{	
//		clickelementObj.click("xpath", "//a[@href='#Courses']");
//	}
//
//	public static void validatePageTitle() throws TestCaseFailed, IOException
//	{
//		validationObj.validateTitle("TK20 | Courses", true);
//	}
//
//	public static void clickCourseworkSidemenu() throws InterruptedException
//	{
//		Thread.sleep(5000);
//		clickelementObj.click("xpath", "//a[@href='#CoursesCoursework']");
//	}
//
//	public static void validateAssignmentLink() throws TestCaseFailed, IOException
//	{
//		validationObj.validateElementText("xpath", "Assignment 1234", "//a[contains(@onclick, 'Assignment 1234')]", true);
//	}
//
//	public static void clickAssignment()
//	{
//		clickelementObj.click("xpath", "//a[contains(@onclick, 'Assignment 1234')]");
//	}
//
//	public static void validateDetailsPage() throws TestCaseFailed, IOException
//	{
//		validationObj.validateElementText("xpath", "Details", "//a[@href='#Details']", true);
//	}
//
//	public static void clickSelectbutton()
//	{
//		clickelementObj.click("xpath", "//button[@id='addartifact3602a8c0784c2f9615c24fc26c2-f1a']");
//	}
//
//	public static void clickSubmitButton()
//	{
//		clickelementObj.click("xpath","//button[@id='submitbtn']");
//	}
//
//	public static void acceptAlert()
//	{
//		javascriptObj.handleAlert("accept");
//	}
//
//	public static void selectCheckbox()
//	{
//		clickelementObj.click("xpath","//a[contains(@onclick, 'Assignment 1234')]/preceding::label[@for='370b11ac5ec37d9415ebd04ab304e6d']");
//	}
//
//	public static void validatePendingFlag() throws TestCaseFailed, IOException
//	{
//		validationObj.validateElementText("xpath", "pending", "//a[contains(@onclick, 'Assignment 1234')]/preceding::span[2]/span", true);
//	}
//
//	public static void clickRecallButton()
//	{
//		clickelementObj.click("xpath","//button[@data-original-title='Recall']");
//	}
//
//}
