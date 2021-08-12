package InterviewA;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POMPages.MiroSignUpPOM;
import TestData.SourceDataprovider;
import Utilities.SourceClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class UsrRegistrationPosCases {
	WebDriver driver=null;
	String site = null;
	
	@BeforeClass
	public void setTestConfig()
	{	try {
			String browserName = SourceClass.getpropertiesValues("browser");
			site = SourceClass.getpropertiesValues("url");
			driver = SourceClass.LaunchBrowser(browserName,site);
	  	  } catch (IOException io) 
			{	// TODO Auto-generated catch block
	  		  System.out.println(io.getClass().getSimpleName());
	  		  Assert.assertTrue(false);
	  		}
			catch (WebDriverException wd)
			{
				System.out.println(wd.getClass().getSimpleName());
				Assert.assertTrue(false);
			}
		
	}
	
	
	@Test(dataProviderClass=SourceDataprovider.class, dataProvider="signup") 
	public void registerWithInvalidDetails(String username, String password, String emailID) throws Exception
	{
		driver.get(site);
		MiroSignUpPOM signup = new MiroSignUpPOM(driver);
		signup.enterUsername(username);
		signup.enterEmail(emailID);
		signup.enterPassword(password);
		signup.getSignupTermsTxtbox().click();
		Assert.assertTrue(false);
		
	}
	
	@Test
	public void enterPWDDetails() throws Exception
	{
		MiroSignUpPOM signup = new MiroSignUpPOM(driver);
		signup.enterPassword("DummyPWD");
		Thread.sleep(2000);
	}
	@AfterClass(alwaysRun = true)
	public void teardown()
	{
		SourceClass.closeBrowser();
	}

}
