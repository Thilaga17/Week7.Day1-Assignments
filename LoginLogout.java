package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class LoginLogout extends BaseClass
{
	@Test
	public void runLoginLogout() 
	{
		LoginPage lp = new LoginPage(driver);
		
		lp.enterUsername()
		.enterPassWord()
		.clickOnLoginButton()
		.verifyHomePage()
		.clickLogout();

	}
}
