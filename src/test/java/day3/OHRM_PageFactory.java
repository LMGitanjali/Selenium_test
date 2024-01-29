package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OHRM_PageFactory {
	WebDriver driver;
	
    @FindBy(name="username")
    WebElement uname;
	
    
    @FindBy(name="password")
    WebElement pwd;
    
    @FindBy(xpath="//button[@type='submit']")
    WebElement loginButton;
    
    public OHRM_PageFactory(WebDriver driver2) {
		this.driver=driver2;
	}
	
	
	public void enterusername(String username1) {
		uname.sendKeys(username1);
	}
	
	public void enterpassword(String password1) {
		pwd.sendKeys(password1);
	}
	
	public void clickButton() {
		loginButton.click();
	}

}
