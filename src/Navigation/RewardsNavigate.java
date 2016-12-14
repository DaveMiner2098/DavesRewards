package Navigation;

import org.openqa.selenium.*;

import org.openqa.selenium.support.PageFactory;
import RBCRewardsRepository.LandingPage_Rep;

public class RewardsNavigate
{
	private static String LandingPage_URL = "https://www.rbcrewards.com/";
	public static LandingPage_Rep LandingPageNav(WebDriver driver)
	{
		driver.get(LandingPage_URL);
		LandingPage_Rep Landing = new LandingPage_Rep();
		PageFactory.initElements(driver, Landing);
		return Landing;
	}

}
