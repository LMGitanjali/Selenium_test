package LAB2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Lab13_POM_xmlrepo {
	WebDriver driver;
	
	By uname=By.name("username");
	By pwd=By.name("password");
	By loginButton=By.xpath("//button[@type='submit']");
	
	public Lab13_POM_xmlrepo(WebDriver driver2) {
		this.driver=driver2;
	}
	
	public void enterusername(String username1) {
		driver.findElement(uname).sendKeys(username1);
	}
	
	public void enterpassword(String password1) {
		driver.findElement(pwd).sendKeys(password1);
	}
	
	public void clickButton() {
		driver.findElement(loginButton).click();
	}

}
