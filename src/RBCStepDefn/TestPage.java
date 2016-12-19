package RBCStepDefn;


import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;



public class TestPage {
	
	private String name;
	//returns name of screenshot file
	protected String HandleError(  WebDriver driver, String ScreenshotName)
	{
		
		try
		{
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	       
			// use date time as screenshot file name
			long tm =  new Date().getTime();
			
			name =   ScreenshotName + tm + ".png";
					//The below method will save the screenshot in \Screenshot directory
			FileUtils.copyFile(scrFile, new File("Screenshot/" + name));
		}
		catch (Exception e)
		{
			return "Error failed to capture screenshot";
		}
		return name;
	}
	

}
