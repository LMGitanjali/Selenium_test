package lab;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LAB5_DemoCart {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("Gita");
		driver.findElement(By.name("lastname")).sendKeys("Dalvi");
		//driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys("chiu24@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("abcd1234");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='input-newsletter-no']")).click();
		Thread.sleep(5000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		System.out.println("You are successfully Registered.");
		Thread.sleep(2000);
		driver.quit();
	}
}
