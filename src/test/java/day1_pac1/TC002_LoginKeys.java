package day1_pac1;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC002_LoginKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		System.out.println("Verify  My Account"+ driver.findElement(By.linkText("My Account")));
		
		System.out.println("Text of my account "+driver.findElement(By.linkText("My Account")).getText());
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).click();
		
		Actions act = new Actions(driver);   //for mouseover
		act.sendKeys("pihu@google.com");
		act.sendKeys(Keys.TAB);
		act.sendKeys("welcome");
		act.sendKeys(Keys.TAB);
		act.sendKeys(Keys.TAB);  // to take words from keyboard
		act.sendKeys(Keys.ENTER);
		act.perform();

	
		

	}

}
