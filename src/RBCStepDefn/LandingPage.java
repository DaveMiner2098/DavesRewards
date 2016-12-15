package RBCStepDefn;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import RBCRewardsRepository.LandingPage_Rep;
import WebDriverManager.BrowserManager;
import Navigation.RewardsNavigate;



import org.testng.Assert;
import org.openqa.selenium.*;


public class LandingPage {
	
	private WebDriver driver;
	private LandingPage_Rep Landing;
	
	
	@Given("^user is on the landing page$")
	public void user_is_on_the_landing_page() 
	{
	    driver =  BrowserManager.getBrowser("Firefox");
	    Landing = RewardsNavigate.LandingPageNav(driver);
	    
	    
	}

	@Then("^the ways to redeem points panel is visible$")
	public void the_ways_to_redeem_points_panel_is_visible() 
	{
		Assert.assertTrue(!Landing.WaysToRedeemYourPointsPanel.isDisplayed(),"");
	    
	}

	@Then("^contains the text 'Ways to Redeem Your Points'$")
	public void contains_the_text_Ways_to_Redeem_Your_Points() 
	{
	    Assert.assertTrue(Landing.WaysToRedeemYourPointsHeader.getText().equals("Ways to Redeem Your Points"));
	    Assert.assertTrue(Landing.WaysToRedeemYourPointsHeader.isDisplayed());
	}


}
