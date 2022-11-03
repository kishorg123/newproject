package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fhome {
	@FindBy(xpath="//a[@class='_2s25']")
	private WebElement fhome;
	@FindBy(xpath="(//div[@class='x1rg5ohu x1n2onr6 x3ajldb x1ja2u2z'])[1]")
	private WebElement profile;
	@FindBy(xpath="(//div[@class='x78zum5 xdt5ytf xz62fqu x16ldp7u'])[5]")
	private WebElement logout1;
	
	
	public fhome (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void home()
	{
		fhome.click();
	}
	public void prof()
	{
		profile.click();
	}
	public void log()
	{
		logout1.click();
	}
}
