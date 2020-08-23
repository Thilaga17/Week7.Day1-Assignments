package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class CreateLeadTC extends BaseClass 
{
	@Test
	public void runCreateLeadTC()
	{
		LoginPage lp = new LoginPage(driver);
		
			lp.enterUsername()
			.enterPassWord()
			.clickOnLoginButton()
			.verifyHomePage()
			.clickOnCrmsfa()
			.clickOnLeads()
			.clickOnCreateLeads()
			.enterCompanyName()
			.enterFirstName()
			.enterLastName()
			.clickOnCreateLeadButton()
			.appearFirstName();
	}
}
