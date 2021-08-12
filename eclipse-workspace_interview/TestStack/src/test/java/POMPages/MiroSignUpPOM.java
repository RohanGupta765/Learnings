package POMPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MiroSignUpPOM {
	
	public MiroSignUpPOM(WebDriver basedriver)
	{
		PageFactory.initElements(basedriver,this);
	}
	
	@FindBy (xpath=("//button[@id='onetrust-accept-btn-handler' or contains(text(),'Accept All Cookies')]"))
	private WebElement accept_cookies_btn;  //WebElement Locator Definition
	public WebElement getAcceptCookiesBtn() //Get the WebElement
		{return accept_cookies_btn;}
	public void clickacceptCookiesBtn()		// Action(s) on/with WebElement. This same pattern is followed below for all Elements
		{accept_cookies_btn.click();}
	
	@FindBy (xpath=("//button[@id='onetrust-pc-btn-handler' or contains(text(),'Cookies Settings')]"))
	private WebElement cookie_setting_btn;
	public WebElement getCookieSettingsBtn()
		{return cookie_setting_btn;}
	public void clickCookieSettingsBtn()
		{cookie_setting_btn.click();}
	
	@FindBy (xpath=("//input[@name='signup[name]' or @id='name' ]"))
	private WebElement signup_name_txt;
	public WebElement getUsernameTxtbox()
		{return signup_name_txt;}
	public void enterUsername(String usrnm)
		{signup_name_txt.sendKeys(usrnm);}
	
	@FindBy (xpath=("//input[@name='signup[email]' or @id='email']"))
	private WebElement signup_email_txt;
	public WebElement getEmailTxtbox()
		{return signup_email_txt;}
	public void enterEmail(String email)
		{signup_email_txt.sendKeys(email);	}	
	
	@FindBy (xpath=("//input[@name='signup[password]' or @id='password']"))
	private WebElement signup_pwd_txt;
	public WebElement getPasswordTxtbox()
		{return signup_pwd_txt;}
	public void enterPassword(String pwd)
		{signup_pwd_txt.sendKeys(pwd);}
	
	@FindBy (xpath=("//input[@id='signup-terms' and @type='chebox']"))
	private WebElement signup_terms_chkbx;
	public WebElement getSignupTermsTxtbox()
		{return signup_terms_chkbx;}
	public void tickTermsCheckbox()
		{signup_terms_chkbx.click();}
	
	@FindBy (xpath=("//input[@id='signup-subscribe' and @type='checkbox']"))
	private WebElement signup_subscribe_chkbx;
	public WebElement getSignupSubscribeTxtbox()
		{return signup_subscribe_chkbx;}
	public void tickSubscribeCheckbox()
		{signup_subscribe_chkbx.click();}
	
	@FindBy (xpath=("//button[@class='signup__submit' and @type='submit']"))
	private WebElement signup_submit_btn;
	public WebElement getSignupSubmitBtn()
		{return signup_submit_btn;}
	public void clickSignupBtn()
		{signup_submit_btn.click();}
	
	@FindBy (xpath=("//div[@class='signup__btn-text' and contains(text(),'Google')]"))
	private WebElement signup_google_btn;
	public WebElement getSignupGoogleBtn()
		{return signup_google_btn;}
	public void clickSignupGoogleBtn()
		{signup_google_btn.click();}
	
	
	@FindBy (xpath=("//div[@class='cxl-social']//ul[@class='cxl-benefit-container']/li"))
	private List<WebElement> benefits_all_lbl;
	public List<WebElement> getBenefitsSectionElements()
		{return benefits_all_lbl;}
	
	@FindBy (xpath=("//div[@class='signup__social-container']//button[contains(@id,'slack')]"))
	private WebElement signup_social_slack_btn;
	public WebElement getSignupSlackBtn()
		{return signup_social_slack_btn;}
	public void clickSignupSlackBtn()
		{signup_social_slack_btn.click();}
	
	@FindBy (xpath=("//div[@class='signup__social-container']//button[contains(@id,'office')]"))
	private WebElement signup_social_office_btn;
	public WebElement getSignupOfficeBtn()
		{return signup_social_office_btn;}
	public void clickSignupOfficeBtn()
		{signup_social_slack_btn.click();}
	
	@FindBy (xpath=("//div[@class='signup__social-container']//button[contains(@id,'apple')]"))
	private WebElement signup_social_apple_btn;
	public WebElement getSignupAppleBtn()
		{return signup_social_apple_btn;}
	public void clickSignupAppleBtn()
		{signup_social_apple_btn.click();}
	
	@FindBy (xpath=("//div[@class='signup__social-container']//button//img[contains(@alt,'Facebook')]"))
	private WebElement signup_social_facebook_btn;
	public WebElement getSignupFacebookBtn()
		{return signup_social_facebook_btn;}
	public void clickSignupFacebookBtn()
		{signup_social_facebook_btn.click();}
	
	@FindBy (xpath=("//div//a[@title='Miro Logo']"))
	private WebElement signup_MiroLogo_btn;
	public WebElement getSignupMiroBtn()
		{return signup_MiroLogo_btn;}
	public void clickSignupMiroBtn()
		{signup_MiroLogo_btn.click();}
	
	@FindBy (xpath=("//span[contains(text(),'Sign in')]"))
	private WebElement signup_signin_btn;
	public WebElement getSignupSignInBtn()
		{return signup_signin_btn;}
	public void clickSignupSignInBtn()
		{signup_signin_btn.click();}






}