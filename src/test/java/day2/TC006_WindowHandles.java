package day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC006_WindowHandles {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/windows");
		System.out.println(driver.getWindowHandle());
		
		//implicit wait-applicable to all web elements
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		
		//Explicit wait-applicable to a particular web element
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.id("multi")));
		ele.click();
		
		//driver.findElement(By.id("multi")).click();
		
		List<String> l1 = new ArrayList<String>(driver.getWindowHandles());
		System.out.println("Size: "+l1.size());
		//System.out.println(l1);
		
		for(int i =0 ; i<l1.size(); i++) {
			System.out.println(l1.get(i));
			//driver.switchTo().window(l1.get(i));
		}
		
		driver.switchTo().window(l1.get(0));
		System.out.println("The URL is :"+driver.getCurrentUrl());
		
		driver.switchTo().window(l1.get(1));
		System.out.println("The URL is :"+driver.getCurrentUrl());
		
		driver.switchTo().window(l1.get(2));
		System.out.println("The URL is :"+driver.getCurrentUrl());
		//driver.close();
		driver.quit();

	}
	
	

}
