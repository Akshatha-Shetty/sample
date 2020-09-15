package CommonUtilities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class BaseClass extends Listener {
	
	public static AppiumDriver driver;

	    @BeforeTest
	    public void preCondition() throws MalformedURLException, InterruptedException {
	        DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability("platformName", "Android");
	        capabilities.setCapability("deviceName", "Android Emulator");
	        capabilities.setCapability("platformVersion","11");
	        capabilities.setCapability("app", "/Users/gmp/Downloads/staging_1.0.33_66_apcoaflow_2020090809.apk");
	        capabilities.setCapability("appPackage", "com.apcoaflow.consumer.staging");
	        capabilities.setCapability("appActivity", "com.consumer.consumerApp.modules.splash.SplashActivity");
	        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	        GenericMethods.threadWait(driver, 7000);
	    }

	    @AfterSuite
	    public void tearDown() {
	        driver.quit();
	        
	    }

}
