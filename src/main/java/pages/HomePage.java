package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
	}
	
	public AuthenticationPage clickFormAuthentication(){
		clickElement("Form Authentication");
		return new AuthenticationPage(driver);
	}
	
	public DropDownPage clickDropDrown(){
		clickElement("Dropdown");
		return new DropDownPage(driver);
	}
	
	public void clickElement(String linkText){
		driver.findElement(By.linkText(linkText)).click();
	}

}
