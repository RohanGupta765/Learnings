package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPSearch {
	@FindBy (xpath=("driver.findElement(By.xpath(\"//form[@autocomplete=\\\"on\\\"]//ancestor::div//button"))
			WebElement clsoeLoginpopup;
	
	
	FlipkartPSearch(WebDriver basedriver)
	{
		PageFactory.initElements(basedriver,this);
	}
	
	
	public void closeLoginPopup()
	{
		clsoeLoginpopup.click();
	}
	
	
}
