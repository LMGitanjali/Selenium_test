package lab;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LAB6_DemoCart {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.name("email")).sendKeys("neha@gmail.com");
		driver.findElement(By.name("password")).sendKeys("pari");
		driver.findElement(By.tagName("button")).click();
		
		WebElement ele = driver.findElement(By.linkText("Components"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		driver.findElement(By.linkText("Monitors (2)")).click();
		
		Select show = new Select(driver.findElement(By.xpath("//select[@id=\"input-limit\"]")));
		show.selectByIndex(1);
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		driver.findElement(By.xpath("//*[@id=\"product-list\"]/div[1]/form/div/div[2]/div[1]/h4/a")).click();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		//js.executeScript("window.scrollBy(0,200)");
		
		driver.findElement(By.name("option[218]")).click();
		driver.findElement(By.name("option[223][]")).click();
		driver.findElement(By.name("option[208]")).click();
		Thread.sleep(2000);
		
		Select s1 = new Select(driver.findElement(By.xpath("//*[@id=\"input-option-217\"]")));
		s1.selectByIndex(1);
		
		driver.findElement(By.xpath("//*[@id=\"input-option-209\"]")).sendKeys("HELLO");
		driver.findElement(By.name("option[219]")).sendKeys("2024-01-15");
		driver.findElement(By.name("option[221]")).sendKeys("20:25");
		driver.findElement(By.name("option[220]")).sendKeys("2024-01-15 20:25");
		driver.findElement(By.name("quantity"));
	
		driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
	}
}
