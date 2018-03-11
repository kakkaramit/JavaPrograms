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
//public class LoginPage implements BaseTest{
//	
//	@FindBy(how=How.ID, using="user")
//	static
//	WebElement uname;
//	
//	@FindBy(how=How.ID, using="pass")
//	static
//	WebElement pass;
//	
//	@FindBy(how=How.XPATH, using="//button[@name='login2']")
//	static
//	WebElement clickloginlink;
//	
//	@FindBy(how=How.XPATH, using="//div[@id='error']/p")
//	static
//	WebElement errortext;
//	
//	public static String pagetitle="TK20 | Home";
//	
//	public LoginPage()
//	{
//		PageFactory.initElements(BrowserFactory.driver, this);
//	}
//
//	public static void enterUnamePass(String username, String password)
//	{
//		//datainputObj.enterText(uname, username);
//		//datainputObj.enterText(pass, password);
//		uname.sendKeys(username);
//		System.out.println("Text");
//		pass.sendKeys(password);
//	}
//
//	public static void clickLogin()
//	{
//		clickelementObj.click(clickloginlink);
//	}
//
//	public static void getErrorText() throws TestCaseFailed, IOException
//	{
//		validationObj.validateElementText(errortext, "Invalid Username/Password");
//	}
//
//	public static void verifyPageTitle() throws TestCaseFailed, IOException
//	{
//		validationObj.validateTitle(pagetitle);
//	}
//
//
//}
