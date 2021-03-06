package AustriaTestCases;

import org.testng.annotations.Test;

import CommonUtilities.BaseClass;
import CommonUtilities.GenericMethods;
import Pages.RegisterPage;

public class RegisterNewUser extends BaseClass {
	
	String Firstname=GenericMethods.randomString();
	String Lastname=GenericMethods.randomString();
	String email=GenericMethods.randomString()+"@mailinator.com";
	String password=GenericMethods.randomString();
			
	@Test(priority = 1, enabled = true)
	public void RegisterConsumer() throws InterruptedException {
		RegisterPage Reg=new RegisterPage(driver);
		Reg.SelectCountry(Reg.SelectCountyAustria);
		GenericMethods.threadWait(driver, 5000);
		Reg.GoingthroughAppFlow("Austria");
		Reg.provideUserDetail(Firstname, Lastname, email, password);

  } 

}
