package zerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home {
	@FindBy(xpath="//a[@href='/holdings']")
	private WebElement holdings; 
@FindBy(xpath="//span[@class='user-id']")
private WebElement userprofile; 

@FindBy(xpath="//a[@target='_self']")
private WebElement logout1; 

@FindBy(xpath="//a[@href='#']")
private WebElement changeuser; 

public home (WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void userprofile()
{
	userprofile.click();
}
public void logout()
{
	logout1.click();
}
public void user()
{
	changeuser.click();
}
public void hold()
{
	holdings.click();
}
}
