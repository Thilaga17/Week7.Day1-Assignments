package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class HomePage extends BaseClass
{
	public HomePage(ChromeDriver driver)
	{
		this.driver = driver;

	}
	public LoginPage clickLogout()
	{
		driver.findElementByClassName("decorativeSubmit").click();
		return new LoginPage(driver);

	}
	
	public HomePage verifyHomePage()
	{
		String title = driver.getTitle();
		if(title.contains("Leaftaps"))
		{
			System.out.println("Title is " + title );
		}
		else
		{
			System.out.println("Wrong Title");
		}
		return this;
	}
	
	public MyHomePage clickOnCrmsfa()
	{
		driver.findElementByLinkText("CRM/SFA").click();
		return new MyHomePage(driver);
	}
	
	

}
