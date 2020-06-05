package spiceJetQATest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import spiceJetQABase.TestBase;
import spiceJetQAPages.HomePage;
import spiceJetQAPages.LoginPage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LoginPageTest extends TestBase {
	LoginPage loginpage;
	 HomePage homepage;
	public LoginPageTest() {
		super();
	}
	
	
@BeforeMethod
public void setup() {
	initialization();
	loginpage= new LoginPage();
}


@Test(priority=2)

public void loginPageTitleTest() {
	String title= loginpage.validateLoginPageTitle();
	Assert.assertEquals(title, driver.getTitle());
}

@Test(priority=1)

public void loginTest() {
	homepage= loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
}

@Test(priority=3)

public void forgotpwdLinkTest() {
	boolean flag =loginpage.validateForgotPasswordLink();
	Assert.assertTrue(flag);
}
@AfterMethod

public void tearDown() {
	driver.quit();
}

}

