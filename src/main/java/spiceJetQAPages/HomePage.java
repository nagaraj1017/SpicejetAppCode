package spiceJetQAPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import spiceJetQABase.TestBase;



public class HomePage extends TestBase {
	
	//Page Factory
	
		WebDriver driver;
		
		@FindBy(id="highlight-book")
		WebElement booklink;

		@FindBy(id="ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")
		WebElement fromTextbox;
		
		@FindBy(id="custom_date_picker_id_1")
		WebElement datePicker;
		
		@FindBy(id="ControlGroupSearchView_AvailabilitySearchInputSearchView_ButtonSubmit")
		WebElement searchBtn;
		
		
		
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
		
		public void clickbookLink() {
			booklink.click();
		}
		
		public void bookTicket() {
			
			Select drpFromlist= new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")));
			drpFromlist.selectByVisibleText("Ahmedabad (AMD)");
			
			
			Select drpTolist= new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT")));
			drpTolist.selectByVisibleText("Bengaluru (BLR)");
			
			datePicker.sendKeys("06-06-2020");
			
			Select passengerdrp= new Select(driver.findElement(By.id("divpaxinfo")));
			passengerdrp.selectByVisibleText("1 Adult");
			
			searchBtn.click();
			
			
		}
		
		}


