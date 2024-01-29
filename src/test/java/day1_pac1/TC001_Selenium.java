package day1_pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001_Selenium {
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		//System.out.println(driver.getTitle());
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Automation testing tools");
		search.submit();
		
		driver.navigate().to("https://www.amazon.com/");
		driver.navigate().back();
		System.out.println("After backward:"+ driver.getTitle());
		System.out.println("After backward:"+ driver.getCurrentUrl());
		System.out.println("After backward:"+ driver.getPageSource().contains("Automation"));
		
		driver.navigate().forward();
		System.out.println("After forward:"+ driver.getTitle());
		System.out.println("After backward:"+ driver.getCurrentUrl());
		Thread.sleep(3000);
		
		driver.quit();
	}

}
 