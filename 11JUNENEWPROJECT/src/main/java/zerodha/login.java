package zerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

		public class login
		{
			@FindBy (xpath="//input[@id='userid']")
			private WebElement username;
			@FindBy (xpath="//input[@id='password']")
			private WebElement password;
			@FindBy (xpath="//button[@type='submit']")
			private WebElement click;
		public login (WebDriver driver ) 
		{
			PageFactory.initElements(driver, this);
			
		}
		public void enteruname()
		{
			username.sendKeys("OKP335");
		}
		public void enterpass() 
		{
			password.sendKeys("ZAQ1234567");
		}
		public void lclick() 
		{
			click.click();
		}
		}
