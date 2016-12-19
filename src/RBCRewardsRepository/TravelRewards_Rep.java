package RBCRewardsRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TravelRewards_Rep extends Rewards_Repository
{
	
	//Flight hotels  more tab on page  
		@FindBy(how=How.CLASS_NAME, using = "primarytabs-currentpage")  
		public WebElement FlightsTab;
	
	//link to air travel table
		@FindBy(how=How.PARTIAL_LINK_TEXT, using = "Redemption Schedule")  
		public WebElement AirTravelTable;
	
		

}
