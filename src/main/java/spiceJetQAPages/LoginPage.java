package spiceJetQAPages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import spiceJetQABase.TestBase;


public class LoginPage extends TestBase{


	@FindBy(id="ControlGroupLoginView_MemberLoginView2LoginView_TextBoxUserID")
	WebElement username;
	
	@FindBy(id="ControlGroupLoginView_MemberLoginView2LoginView_PasswordFieldPassword")
	WebElement password;
	
	@FindBy(name="ControlGroupLoginView$MemberLoginView2LoginView$ButtonLogIn")
	WebElement loginbtn;
	
	@FindBy(xpath="//a[@href='FindPassword.aspx']")
	WebElement forgotpwdlink;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();
		return new HomePage();
	}

	public String validateLoginPageTitle() {
		
		return driver.getTitle();
	}
	
	public boolean validateForgotPasswordLink() {
		return forgotpwdlink.isDisplayed();
	}
	
}


