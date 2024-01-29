package Lab3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Luma_Pom {
	WebDriver driver;

	By fname = By.xpath("//*[@id=\"firstname\"]");
	By lname = By.xpath("//*[@id=\"lastname\"]");
	By email = By.xpath("//*[@id=\"email_address\"]");
	By pwd = By.xpath("//*[@id=\"password\"]");
	By pwd1 = By.xpath("//*[@id=\"password-confirmation\"]");
	By createb = By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button/span");
	
	public Luma_Pom(WebDriver driver2) {
		this.driver=driver2;
	}
		
	public void firstname(String text) {
		driver.findElement(fname).sendKeys(text);
	}
	
	public void lastname(String text) {
		driver.findElement(lname).sendKeys(text);
	}
	
	public void emailid(String text) {
		driver.findElement(email).sendKeys(text);
	}
	public void password(String text) {
		driver.findElement(pwd).sendKeys(text);
	}
	
	public void cpassword(String text) {
		driver.findElement(pwd1).sendKeys(text);
	}
	
	public void button() {
		driver.findElement(createb).click();
	}
	
}
