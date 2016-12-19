package RBCStepDefn;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;

import Navigation.RewardsNavigate;
import RBCRewardsRepository.TravelRewards_Rep;
import WebDriverManager.BrowserManager;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TravelRewardsPage extends  TestPage
{

	
	private WebDriver driver;
	private TravelRewards_Rep Travel;
	private String MainWindow;
	private String SubWindow;
	
	
	@Before public void setUp()
	{ 
		MainWindow = SubWindow = null;
		
	}
	
	
	
	@Given("^that user is viewing the Air Travel Redemption Schedule$")
	public void that_user_is_viewing_the_Air_Travel_Redemption_Schedule() 
	{
		
		//load driver and navigate to travel rewards page
	    driver =  BrowserManager.getBrowser("Firefox");
	    Travel =  RewardsNavigate.TravelRewardsPageNav(driver);
	    
	    //Click Flights,Hotels Tab 
	    Travel.FlightsTab.click();
	    
	    //get main window
	   MainWindow = driver.getWindowHandle();
	    
	    //display table
	    Travel.AirTravelTable.click();
	    
	    //find travel table window and switch to it
	    Set<String> Windows = driver.getWindowHandles();
	    for (String win : Windows)
	    	if (!win.equals(MainWindow))
	    	{
	    		driver.switchTo().window(win);
	    		SubWindow = win;
	    		break;
	    	}
	    
	    
	}

	@Then("^the points and maximum ticket price information is correct$")
	public void the_points_and_maximum_ticket_price_information_is_correct(DataTable DataTab)  
	{
		//convert data to list of maps that cointains points and max values
		List<Map<String,String>> Dat = DataTab.asMaps(String.class, String.class);
		
		
		//check each cell in table for points and values
		String Value;
		String Points;
		int x = 2;
		for (Map<String,String> Mp : Dat)
		{
			Points = driver.findElement(By.xpath(".//*[@id='layout']/table[1]/tbody/tr["+x+"]/td[1]")).getText();
			Value = driver.findElement(By.xpath(".//*[@id='layout']/table[1]/tbody/tr["+x+"]/td[4]")).getText();
			Assert.assertTrue(Points.equals(Mp.get("Points")), "Points in table are " + Points + 
					"Expecting " + Mp.get("Points") + " " 	+ this.HandleError(driver, "Travel Rewards Page"));
			Assert.assertTrue(Value.equals(Mp.get("MaxTicket")), "Maximum Value in table is " + Value + 
					"Expecting " + Mp.get("MaxTicket") + " " 	+ this.HandleError(driver, "Travel lRewards Page"));
			x++;
		}
		
		
		
		
	}
	
	@After public void cleanUp()
	{ 
		if (SubWindow != null)
		{
			driver.close();
			driver.switchTo().window(MainWindow);
		}
			
	}
	      

}
