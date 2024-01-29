package dayyy8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC001_OHRM_POM_Props {
	WebDriver driver;
	
	By uname=By.name("username");
	By pwd=By.name("password");
	By loginButton=By.xpath("//button[@type='submit']");
	By dashboard = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]");
	
	public TC001_OHRM_POM_Props(WebDriver driver2) {
		this.driver=driver2;
	}
	//validation
	public boolean verifyusername() {
		boolean isusername_displayed = driver.findElement(uname).isDisplayed();
		return isusername_displayed;
	}
	
	public void enterusername(String username1) {
		driver.findElement(uname).sendKeys(username1);
	}
	
	public boolean verifypassword() {
		boolean ispassword_displayed = driver.findElement(pwd).isDisplayed();
		return ispassword_displayed;
	}
	
	public void enterpassword(String password1) {
		driver.findElement(pwd).sendKeys(password1);
	}
	
	public boolean verifylogin() {
		boolean isdashboard_displayed;
		try {
		 isdashboard_displayed = driver.findElement(dashboard).isDisplayed();
		}
		catch(Exception e){
			isdashboard_displayed = false;
		}
		return isdashboard_displayed;
	}
	
	public void clickButton() {
		driver.findElement(loginButton).click();
	}

}
