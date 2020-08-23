package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class LoginVerify extends BaseClass
{
	
		@Test
		public void runLoginVerify() 
		{
			LoginPage lp = new LoginPage(driver);
			
			lp.enterUsername()
			.enterPassWord()
			.clickOnLoginButton()
			.verifyHomePage();
		}

	
}
