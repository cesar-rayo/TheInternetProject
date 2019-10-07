package login;

import org.testng.Assert;
import org.testng.annotations.Test;

import commons.BaseTest;
import pages.AuthenticationPage;
import pages.SecureArea;

public class LoginTests extends BaseTest{
	
	@Test
	public void testSuccessfulLogin(){
		AuthenticationPage authPage = homePage.clickFormAuthentication();
		authPage.setUserName("tomsmith");
		authPage.setPassword("SuperSecretPassword!");
		SecureArea secArea = authPage.clickLoginBtn();
		
		Assert.assertTrue(
				secArea.getStatusAlertText().contains("You logged into a secure area!"),
				"Alert message does not match with expected");
	}

}
