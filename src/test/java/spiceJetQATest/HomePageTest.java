package spiceJetQATest;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import spiceJetQABase.TestBase;
import spiceJetQAPages.HomePage;
import spiceJetQAPages.LoginPage;

public class HomePageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	
	public HomePageTest() {
		super();
	}
	@BeforeMethod
	public void setup() {
		initialization();
		loginpage= new LoginPage();
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));

	}
	
	@Test(priority=1)

	public void clickbookLinkbutton() {
		homepage.clickbookLink();
			}
	
	@Test(priority= 2)
	
	public void searchflight() {
		homepage.bookTicket();
	}
	@AfterMethod

	public void tearDown() {
		driver.quit();
	}
}