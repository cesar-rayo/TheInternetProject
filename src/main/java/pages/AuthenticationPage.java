package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthenticationPage {
	private WebDriver driver;
	private By userName = By.id("username");
	private By password= By.id("password");
	private By loginBtn = By.cssSelector("#login button");
	
	public AuthenticationPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void setUserName(String user){
		driver.findElement(userName).sendKeys(user);
	}
	
	public void setPassword(String pass){
		driver.findElement(password).sendKeys(pass);
	}
	
	public SecureArea clickLoginBtn(){
		driver.findElement(loginBtn).click();
		return new SecureArea(driver);
	}

}
