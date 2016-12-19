package Navigation;

import org.openqa.selenium.*;

import org.openqa.selenium.support.PageFactory;
import RBCRewardsRepository.LandingPage_Rep;
import RBCRewardsRepository.TravelRewards_Rep;

public class RewardsNavigate
{
	
	public static LandingPage_Rep LandingPageNav(WebDriver driver)
	{
		driver.get(LandingPage_Rep.LandingPage_URL);
		LandingPage_Rep Landing = new LandingPage_Rep();
		PageFactory.initElements(driver, Landing);
		return Landing;
	}
	
	public static TravelRewards_Rep TravelRewardsPageNav(WebDriver driver)
	{
		driver.get(LandingPage_Rep.LandingPage_URL);
		TravelRewards_Rep TravelReward = new TravelRewards_Rep();
		
		//navigate to Travelrewards page
		TravelReward.clickLinkByHref("travel-rewards", driver);
		
		PageFactory.initElements(driver, TravelReward);
		
		
		
		return TravelReward;
	}

}
