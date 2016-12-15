package Navigation;

import org.openqa.selenium.*;

import org.openqa.selenium.support.PageFactory;
import RBCRewardsRepository.LandingPage_Rep;

public class RewardsNavigate
{
	
	public static LandingPage_Rep LandingPageNav(WebDriver driver)
	{
		driver.get(LandingPage_Rep.LandingPage_URL);
		LandingPage_Rep Landing = new LandingPage_Rep();
		PageFactory.initElements(driver, Landing);
		return Landing;
	}

}
