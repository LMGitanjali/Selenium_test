package lab;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import day3.OHRM_POM;
import day3.OHRM_PageFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LAB3_DemoCart_Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		
//		WebElement ele = driver.findElement(By.linkText("Desktops"));
//		Actions act = new Actions(driver);
//		act.moveToElement(ele).perform();
//		driver.findElement(By.linkText("Mac (1)")).click();
//		
//		Select sort = new Select(driver.findElement(By.xpath("//*[@id=\"input-sort\"]")));
//		sort.selectByIndex(1);
//		
//		JavascriptExecutor js =(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//*[@id=\"product-list\"]/div/form/div/div[2]/div[2]/button[1]")).click();
		
		
//		Lab3_DemoCart_Pom obj = new Lab3_DemoCart_Pom(driver);
//		obj.desktop();
//		obj.mac();
//		obj.sort(1);
//		
//		JavascriptExecutor js =(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		Thread.sleep(3000);
//		
//		obj.addcart();
		
		//-----------------------------------------------------------------------------------
		
		
		Lab3_DemoCart_PF obj = PageFactory.initElements(driver, Lab3_DemoCart_PF.class);
		obj.desktop();
		obj.mac();
		obj.sort(1);
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		
		obj.addcart();
		

	}

}
