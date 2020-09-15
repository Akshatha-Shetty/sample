package CommonUtilities;

import org.apache.commons.lang3.RandomStringUtils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class GenericMethods {
	
	 public static void threadWait(AppiumDriver<MobileElement> driver, long time) throws InterruptedException {
	        synchronized (driver) {
	            driver.wait(time);
	        }
	    }

	public static String randomString() {
	        int length = 6;
	
	        boolean useLetters = true;
	        boolean useNumbers = true;
	        String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
	        return generatedString;
	    }
	 
	 

}
