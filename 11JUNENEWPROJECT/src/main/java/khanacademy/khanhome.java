package khanacademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class khanhome {
	@FindBy (xpath ="(//button[@type='button'])[1]")
	private WebElement biolink;
	////div[@class='_1ell7dku']
	@FindBy (xpath = "//input[@class='nickname']")
	private WebElement nickname;
	@FindBy (xpath = "(//input[@type='text'])[2]")
	private WebElement username;
	@FindBy (xpath = "//textarea[@id='bio-picker']")
	private WebElement bio;
	@FindBy (xpath = "(//button[@type='button'])[6]")
	private WebElement biosubmit;
	
	public khanhome(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void hpbiolink() {
		biolink.click();
	}
	public void hpnickname() {
		nickname.sendKeys("Deep");
	}
	public void hpusername() {
		username.sendKeys("Deepak");
	}
	public void hpbio() {
		bio.sendKeys("This is my Bio.....");
	}
	public void hpbiosubmit() {
		biosubmit.click();
	}
	

}
