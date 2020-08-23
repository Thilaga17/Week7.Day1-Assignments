package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class ViewLeadPage extends BaseClass
{
	public ViewLeadPage(ChromeDriver driver)
	{
		this.driver = driver;
	}
	
	public ViewLeadPage appearFirstName()
	{
		String fname = driver.findElementByXPath("//span[@id = 'viewLead_firstName_sp']").getText();
		System.out.println("Created New Lead, First Name of the lead is : " + fname);
		return this;
	}

}
