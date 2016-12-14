package RBCRewardsRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class LandingPage_Rep
{
	@FindBy(how=How.CLASS_NAME, using = "contentframework-container-primary-custom")  
	public WebElement WaysToRedeemYourPoints;
	
	
	
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
