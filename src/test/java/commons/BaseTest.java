package commons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import pages.HomePage;

public class BaseTest {
	private WebDriver driver;
	private String homeUrl = "https://the-internet.herokuapp.com";
	protected HomePage homePage;
	
	@BeforeClass
	public HomePage setUp(){
		System.setProperty("webdriver.chrome.driver",
				"/home/cesar-rayo/Documents/selenium/chromedriver_linux64/chromedriver");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get(homeUrl);
		homePage = new HomePage(driver);
		
		return homePage;
	}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
}
