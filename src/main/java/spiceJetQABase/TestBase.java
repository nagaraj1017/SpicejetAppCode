package spiceJetQABase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import spiceJetTestUtilities.TestUtil;



public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;



		public TestBase() {
			
			try {
				prop = new Properties();
				FileInputStream ip= new FileInputStream("C:\\Users\\Nagaraj\\eclipse-workspace\\"
						+ "SpiceJetApplicationTest\\src\\main\\java\\spiceJetQAConfig\\config.properties");
				prop.load(ip);
				
			}catch (FileNotFoundException e) {
			e.printStackTrace();
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		
		}
		
		
		public static void initialization() {
		String browserName= prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\Nagaraj\\Selenium\\Chrome Driver2\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			}
		else if (browserName.equals("mozilla")) {
			System.setProperty("webdriver.gecko.driver","C:\\Nagaraj\\Selenium\\Chrome Driver\\chromedriver_win32\\geckodriver");
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_Timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_wait, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		}
	}
