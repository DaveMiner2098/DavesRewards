package RBCRewardsRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


//object repository for landing page. all location strings and elements are centralized here


public class LandingPage_Rep
{
	//ways to redeem your points container 
	@FindBy(how=How.CLASS_NAME, using = "contentframework-container-primary-custom")  
	public WebElement WaysToRedeemYourPointsPanel;
	
	//ways to redeem your points Header 
		@FindBy(how=How.CLASS_NAME, using = "contentframework-container-header")  
		public WebElement WaysToRedeemYourPointsHeader;
	
	//url of landing page
	public static String LandingPage_URL = "https://www.rbcrewards.com/";
	
	// will find href for specific link  only option on landing page 
	public void clickLinkByHref(String href, WebDriver driver)
	{
	    List<WebElement> anchors = driver.findElements(By.tagName("a"));
	    for ( WebElement anchor : anchors)
		    if(anchor.getAttribute("href").contains(href)) 
		    {
		        anchor.click();
		        break;
	        }
	    
	}
	
}
