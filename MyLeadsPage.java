package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class MyLeadsPage extends BaseClass 
{
	public MyLeadsPage(ChromeDriver driver)
	{
		this.driver = driver;
	}
	
	public CreateLeadPage clickOnCreateLeads() 
	{
		driver.findElementByLinkText("Create Lead").click();
		return new CreateLeadPage(driver);

	}
	
	

}
