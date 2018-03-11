package Selenium;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeys {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium Project Folder\\WorkBook 4\\CucumberProjectTestNG\\Resource\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("http://www.testingbar.com/");
	    //Locate the element on which you want to Right Click
	    WebElement element = driver.findElement(By.xpath(".//*[@id='menu-item-591']/a"));
	    		
	    		//.sendKeys(Keys.F8, Keys.NUMPAD9);
	    
	    Actions act=new Actions(driver);
	    act.contextClick(element).sendKeys(Keys.chord(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER)).build().perform(); 

	}

}
