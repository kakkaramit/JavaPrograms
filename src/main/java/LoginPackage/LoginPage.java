package LoginPackage;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
	public WebDriver driver;
	@Before
	public void  start()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Project Folder\\WorkBook 4\\CucumberProjectTestNG\\Resource\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");	
	}



	@FindBy(how=How.ID, using="user")
	WebElement username;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@Test
	public void test() throws InterruptedException
	//public static void main(String args[])
	{

		//WebElement user1=driver.findElement(By.id("user"));
		Thread.sleep(3000);
		
		username.sendKeys("data");
	}



}
