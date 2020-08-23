package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class CreateLeadPage extends BaseClass
{
	public CreateLeadPage(ChromeDriver driver)
	{
		this.driver = driver;
	}
	
	public CreateLeadPage enterCompanyName() 
	{
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeafSolutions");
		return this;
	}
	
	public CreateLeadPage enterFirstName() 
	{
		driver.findElementById("createLeadForm_firstName").sendKeys("Thilaga");
		return this;
	}
	
	public CreateLeadPage enterLastName() 
	{
		driver.findElementById("createLeadForm_lastName").sendKeys("K");
		return this;
	}
	
	public ViewLeadPage clickOnCreateLeadButton()
	{
		driver.findElementByClassName("smallSubmit").click();
		return new ViewLeadPage(driver);
	}
	

}
