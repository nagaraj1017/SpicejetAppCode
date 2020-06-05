package spiceJetQAPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import spiceJetQABase.TestBase;


public class GiftCardPage extends TestBase{
	WebDriver driver;
HomePage homepage;
	
	//*[@id="dashboard-toolbar"]/div[2]/div/a/button
	
	//@FindBy(xpath="//a[@href='/contacts/new']//button[@class='ui linkedin button']//i[@class='edit icon']")
	//WebElement contactsNewButtonClick;
	
	@FindBy(xpath="//button[text()='New' and @class='ui linkedin button']")
		WebElement happyJourneyGiftCardClick;
	
	@FindBy(xpath="//button[text()='Save' and @class='ui linkedin button']")
	WebElement clickSaveButton;
	
	@FindBy(xpath="//span[text()='Contacts']")
	WebElement contactslink;
	
	@FindBy(xpath="//div[text()='Contacts activity stream']")
	WebElement contactsHeader;
	
	@FindBy(name="first_name")
	WebElement FirstName;
	
	@FindBy(name="last_name")
	WebElement LastName;
	
	@FindBy(name="middle_name")
	WebElement MiddleName;
	
	@FindBy(name="department")
	WebElement Company;
	
	@FindBy(name="address")
	WebElement Address;
	
	//@FindBy(xpath="//button[@class='ui linkedin button']//i[@class='save icon']")
	//WebElement clickSaveButton;
	
	
	
	public GiftCardPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void verifyContactsNewButton() {
		happyJourneyGiftCardClick.click();
	}
	
	public void createNewContacts(String FN, String LN, String MN, String DP, String AD) {
		FirstName.sendKeys("FN");
		LastName.sendKeys("LN");
		MiddleName.sendKeys("MN");
		Company.sendKeys("DP");
		Address.sendKeys("AD");
		clickSaveButton.click();
	}
}

