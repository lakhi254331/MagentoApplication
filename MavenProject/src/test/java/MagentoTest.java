

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MagentoTest 
{
	@Test
	public void magento()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.magento.com");
		
		Home h=new Home(driver);
		h.clickOnMyacc();
		
		Login l1=new Login(driver);
		l1.typeEmail("nitinmanjunath1991@gmail.com");
		l1.typePassword("Welcome123");
		l1.clickOnLogin();
		
		Logout l2=new Logout(driver);
		l2.clickOnLogout();
		
		driver.quit();
	}
}
