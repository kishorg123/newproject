package flipkart;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.utility1;

public class flogin {
	FileInputStream f1;
	@FindBy (xpath="(//input[@type='text'])[2]")
	private WebElement uname;
	@FindBy (xpath="//input[@type='password']")
	private WebElement pass;
	@FindBy (xpath="(//button[@type='submit'])[2]")
	private WebElement flogin;
	
	public flogin (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void fusername () throws IOException
	{
		String data = utility1.fetchexceldata("Sheet1", 1, 1);
		uname.sendKeys(data);
		//uname.sendKeys("8975354223");
	}
	public void fpassword() throws IOException
	{
		String data1 = utility1.fetchexceldata("Sheet1", 2, 1);
		//pass.sendKeys("8975354223");
		pass.sendKeys(data1);
	}
	public void floginclick()
	{
		flogin.click();
	}

}
