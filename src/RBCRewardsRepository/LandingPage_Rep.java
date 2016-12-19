package RBCRewardsRepository;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


//object repository for landing page. all location strings and elements are centralized here


public class LandingPage_Rep extends Rewards_Repository
{
	//ways to redeem your points container 
	@FindBy(how=How.CLASS_NAME, using = "contentframework-container-primary-custom")  
	public WebElement WaysToRedeemYourPointsPanel;
	
	//ways to redeem your points Header 
		@FindBy(how=How.CLASS_NAME, using = "contentframework-container-header")  
		public WebElement WaysToRedeemYourPointsHeader;
	
	//url of landing page
	public static String LandingPage_URL = "https://www.rbcrewards.com/";
	
	
}
