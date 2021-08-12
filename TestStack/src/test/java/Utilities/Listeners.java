package Utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners extends SourceClass implements ITestListener{
	ExtentReports eReports = SourceClass.GetHtmlReports();
	ExtentTest extentTest;
	ThreadLocal<ExtentTest> extentLocal = new ThreadLocal<ExtentTest>();
	
	public void onTestStart(ITestResult result)
	{	
		extentTest = eReports.createTest(result.getMethod().getMethodName());
		extentLocal.set(extentTest);
		System.out.println("Test case Started");
	}
	
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test case passed");
		extentLocal.get().log(Status.PASS, "Test Passed");
	}
	
	
	public void onTestFailure(ITestResult result)
	{
		String excMsg = null; 
		if (null != result.getThrowable()) {
		      excMsg = "Caused By : " + result.getThrowable().getClass().getName();
		    }
		extentLocal.get().log(Status.FAIL, excMsg);
		System.out.println("Test case Failed");
	}
	
	public void onTestSkipped(ITestResult result)
	{
		extentLocal.get().log(Status.SKIP, "Test was skipped: It may be because suite setup failed causing all tests to be skipped OR it was skipped intentionally using enabled=false testng annotation property");
	}
	public void onFinish(ITestContext result)
	{	
		
		eReports.flush();
		System.out.println("Extent test flushed");
	}
	
	

}
