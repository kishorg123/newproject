package facebook;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.utility;
public class facelogin 
{
	@FindBy(xpath="//input[@type='text']")
	private WebElement uname;
	@FindBy(xpath="//input[@type='password']")
	private WebElement upass;
	@FindBy(xpath="//button[@value='1']")
	private WebElement clickon;
	
	public facelogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enterun() throws IOException
	{
		String data = utility.fetchexceldata("data", 1, 1);
		//uname.sendKeys("arjunnagarkar97@gmail.com");
		uname.sendKeys(data);
		
	}
	public void enterupass() throws IOException
	{
		String data = utility.fetchexceldata("data", 2, 1);
		//upass.sendKeys("7040353282");
		upass.sendKeys(data);
	}
	public void clickf()
	{
		clickon.click();
	}
}



