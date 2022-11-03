package zerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pin {
	@FindBy (xpath="//input[@type='password']")
	private WebElement upin;
	@FindBy (xpath="//button[@type='submit']")
	private WebElement conti;
public pin (WebDriver driver ) 
{
	PageFactory.initElements(driver, this);
	
}
public void enterupin() 
{
	upin.sendKeys("234567");
}
public void continue1() 
{
	conti.click();
}
}



