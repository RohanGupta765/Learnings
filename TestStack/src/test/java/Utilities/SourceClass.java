package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SourceClass {
	static WebDriver  sourcedriver;
	public static WebDriver LaunchBrowser(String browser, String site)
	{
		if(browser.equalsIgnoreCase("Chrome"))
			{WebDriverManager.chromedriver().setup();
			sourcedriver = new ChromeDriver();}
		else if(browser.equalsIgnoreCase("Firefox"))
			{WebDriverManager.firefoxdriver().setup();
			sourcedriver = new FirefoxDriver();}
		else if(browser.equalsIgnoreCase("Edge"))
			{WebDriverManager.edgedriver().setup();
			sourcedriver = new EdgeDriver();}
		else if(browser.equalsIgnoreCase("Opera"))
			{WebDriverManager.edgedriver().setup();
			sourcedriver = new OperaDriver();
			}
	
		sourcedriver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		sourcedriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		sourcedriver.get(site);
		sourcedriver.manage().window().maximize();
		return sourcedriver;
	}
	
	public static void closeBrowser()
	{
		sourcedriver.quit();
	}
	public static String getpropertiesValues(String key) throws IOException
	{
		
		File f = new File(System.getProperty("user.dir") + "/src/test/java/Utilities/configure.properties");
		FileInputStream str = new FileInputStream(f);
		Properties p = new Properties();
		p.load(str);
		String val = p.getProperty(key);
		return val;
	}
	
	public static ExtentReports GetHtmlReports() {
		{	
			ExtentHtmlReporter sourcehtml;
			ExtentReports sourceReports;
			
			sourcehtml = new ExtentHtmlReporter(System.getProperty("user.dir")+"/ExtReportDemo.html");
			
			sourcehtml.config().setDocumentTitle("Miro Automation Demo ");
			sourcehtml.config().setReportName("User Registration");
			sourcehtml.config().setTheme(Theme.STANDARD);
			
			sourceReports = new ExtentReports();
			sourceReports.attachReporter(sourcehtml);
				
			sourceReports.setSystemInfo("Automation Test Engineer", "If you are bug then Im your Dad");
			return sourceReports;
		}

	  }
		
//		public static void endReport()
//		{
//			eReports.flush();
//		}
		
		public static String CaptureSS(WebDriver driver, String ssName) throws IOException
		{
			String datename = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			String destn = System.getProperty("user.dir") + "/captures/" + ssName + datename + ".png";
			File final_destn = new File(destn);
			FileUtils.copyFile(source, final_destn);
			return destn;
			
		}

}

