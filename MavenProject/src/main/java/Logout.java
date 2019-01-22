

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout
{
	WebDriver driver;
	
	By logout=By.linkText("Log Out");

	public Logout(WebDriver driver)
	{
		super();
		this.driver = driver;
	}
	
	public void clickOnLogout()
	{
		driver.findElement(logout).click();
	}
	
}
