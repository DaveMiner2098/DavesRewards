package RBCRewardsRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Rewards_Repository
{
	// will find href for specific link  only option on landing page 
		public void clickLinkByHref(String href, WebDriver driver)
		{
		    List<WebElement> anchors = driver.findElements(By.tagName("a"));
		    for ( WebElement anchor : anchors)
		    try
		    {
			    if(anchor.getAttribute("href").contains(href)) 
			    {
			        anchor.click();
			        break;
		        }
		    }
		    catch (Exception e)
		    {
		    	
		    }
		   
		    
		    
		}
		public WebElement getLinkByHref(String href, WebDriver driver)
		{
		    List<WebElement> anchors = driver.findElements(By.tagName("a"));
		   
		    for ( WebElement anchor : anchors)
		    	try
		    {
		        if(anchor.getAttribute("href").contains(href)) 
			         return anchor;
		    }
		    catch (Exception e)
		    {
		    	
		    }
		   
		    
		    return null;
		}
		
}
