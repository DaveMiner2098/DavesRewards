package RBCStepDefn;


import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import RBCRewardsRepository.LandingPage_Rep;
import WebDriverManager.BrowserManager;
import Navigation.RewardsNavigate;



import org.testng.Assert;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.*;


public class LandingPage extends  TestPage {
	
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
		Assert.assertTrue(Landing.WaysToRedeemYourPointsPanel.isDisplayed(), "the ways to redeem points panel is not visible " + this.HandleError(driver, "LandingPage"));
	    
	}

	@Then("^contains the text 'Ways to Redeem Your Points'$")
	public void contains_the_text_Ways_to_Redeem_Your_Points() 
	{
	    Assert.assertTrue(Landing.WaysToRedeemYourPointsHeader.getText().equals("Ways to Redeem Your Points"), "Ways to Redeem Your Points text missing " + this.HandleError(driver, "LandingPage"));
	    Assert.assertTrue(Landing.WaysToRedeemYourPointsHeader.isDisplayed(), "Ways to Redeem Your Points not displayed " + this.HandleError(driver, "LandingPage"));
	}
	
	@Then("^all the links are displayed$")
	public void all_the_links_are_displayed(DataTable DataTab) 
	{
		
		//convert data to list of maps that cointain href text
		List<Map<String,String>> Dat = DataTab.asMaps(String.class, String.class);
		
		//check that each link is present on page by comparing with href text
		for ( Map<String,String> Mp : Dat)
			Assert.assertNotNull(Landing.getLinkByHref(Mp.get("href"), driver), "link is missing  " + Mp.get("link") + " " 
					+ this.HandleError(driver, "LandingPage"));
		
	    
	}


}
