package CommonUtilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.AppiumDriver;

public class Listener implements ITestListener {
		protected static AppiumDriver driver;
		protected static ExtentReports reports;
		protected static ExtentTest test;

		
		public void onTestStart(ITestResult result) {

			test = reports.startTest(result.getMethod().getMethodName());
			test.log(LogStatus.INFO, result.getMethod().getMethodName());
			//System.out.println("Running ===> "+result.getTestClass().getName() +" -------> "+ result.getMethod().getMethodName());
		}
	   
		public void onTestSuccess(ITestResult result) {
			test.log(LogStatus.PASS, "Test is pass");

		}

		public void onTestFailure(ITestResult result) {
			test.log(LogStatus.FAIL, "Test is fail");

		}

		public void onTestSkipped(ITestResult result) {
			test.log(LogStatus.SKIP, "Test is skipped");

		}

		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			// TODO Auto-generated method stub

		}

		public void onStart(ITestContext context) {
			reports = new ExtentReports("TestReports/"+ "ExtentReport.html");
			test = reports.startTest("");

		}

		public void onFinish(ITestContext context) {
			reports.endTest(test);
			reports.flush();

		}

	}



