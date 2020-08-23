package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class LoginPage extends BaseClass
{
	public LoginPage(ChromeDriver driver)
	{
		this.driver = driver;
	}
	
	public LoginPage enterUsername()
	{
		WebElement eleUserName = driver.findElementById("username");
		eleUserName.sendKeys("demosalesmanager");
		return this;
	}
	
	public LoginPage enterPassWord()
	{
		WebElement elePassWord = driver.findElementByName("PASSWORD");
		elePassWord.sendKeys("crmsfa");
		return this;
	}
	
	public HomePage clickOnLoginButton()
	{
		driver.findElementByClassName("decorativeSubmit").click();
		return new HomePage(driver);
	}
}
