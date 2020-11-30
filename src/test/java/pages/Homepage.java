package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Homepage
{
	public RemoteWebDriver driver;
	
	@FindBy(how=How.XPATH,using="//*[text()='Create New Account']")
	public WebElement newaccbtn;
	
	public Homepage(RemoteWebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
