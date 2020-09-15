package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import CommonUtilities.BaseClass;
import CommonUtilities.GenericMethods;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RegisterPage extends BaseClass {

	public RegisterPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
	
	@AndroidFindBy(id = "com.apcoaflow.consumer.staging:id/text")
    private WebElement SelectCountyDropdown ;
	
	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='GERMANY']")
    public WebElement SelectCountyGermany ;
	
	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='AUSTRIA']")
    public WebElement SelectCountyAustria ;
	
	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='POLAND']")
    public WebElement SelectCountyPoland ;
	
	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='SWEDEN']")
    public WebElement SelectCountySweden;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='ITALY']")
    public WebElement SelectCountyItaly;
	
	@AndroidFindBy(id = "com.apcoaflow.consumer.staging:id/tv_get_started")
    private WebElement LetsGetStarted;
	
	@AndroidFindBy(id = "com.apcoaflow.consumer.staging:id/tv_action")
    private WebElement Continue1stScreen;
	
	@AndroidFindBy(xpath = "(.//android.widget.TextView[@text='CONTINUE'])[1]")
    private WebElement Continue2ndScreen;
	
	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='SIGNUP FOR FREE']")
    private WebElement SignUp_For_Free;
	
	@AndroidFindBy(id = "com.apcoaflow.consumer.staging:id/edt_first_name")
    private WebElement FirstName;
	
	@AndroidFindBy(id = "com.apcoaflow.consumer.staging:id/edt_last_name")
    private WebElement LastName;
	
	@AndroidFindBy(id = "com.apcoaflow.consumer.staging:id/email")
    private WebElement Email;
	
	@AndroidFindBy(id = "com.apcoaflow.consumer.staging:id/edt_password")
    private WebElement Password;
	
	@AndroidFindBy(id = "com.apcoaflow.consumer.staging:id/cb_terms")
    private WebElement TermsandCondition;
	
	@AndroidFindBy(id = "com.apcoaflow.consumer.staging:id/cb_privacy_policy")
    private WebElement PrivacyPolicy;
	
	@AndroidFindBy(id = "com.apcoaflow.consumer.staging:id/btn_register")
    private WebElement Register;
	
	@AndroidFindBy(id = "com.apcoaflow.consumer.staging:id/tv_order_flow_card")
    private WebElement orderPersonalFlowChip;
	
	
    public void SelectCountry(WebElement element) {
    	SelectCountyDropdown.click();
    	element.click();
		
		
	}

	public void GoingthroughAppFlow(String country) {
		System.out.println(country);
		if(country=="Italy") {
		LetsGetStarted.click();
		Continue1stScreen.click();
		Continue2ndScreen.click();
		Continue2ndScreen.click();
		Continue2ndScreen.click();
		Continue2ndScreen.click();
		Continue2ndScreen.click();
		Continue2ndScreen.click();
		SignUp_For_Free.click();
		}else {
			LetsGetStarted.click();
			Continue1stScreen.click();
			Continue2ndScreen.click();
			Continue2ndScreen.click();
			Continue2ndScreen.click();
			Continue2ndScreen.click();
			Continue2ndScreen.click();
			SignUp_For_Free.click();
			
		}
		
	}
	
	public void provideUserDetail(String Firstname,String Lastname,String email,String password) {
		FirstName.sendKeys(Firstname);
		LastName.sendKeys(Lastname);
		Email.sendKeys(email);
		Password.sendKeys(password);
		TermsandCondition.click();
		PrivacyPolicy.click();
		Register.click();  
	}
	
}
