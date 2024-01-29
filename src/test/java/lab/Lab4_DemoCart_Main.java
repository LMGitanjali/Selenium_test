package lab;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab4_DemoCart_Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		
//		Lab4_DemoCart_PF obj = new Lab4_DemoCart_PF(driver);
//		obj.desktop();
//		obj.mac();
//		obj.sort(1);
//		obj.search();
//		obj.search2("Mobile");
//		obj.tick();
//		obj.searchbutton();
		
		
		Lab4_DemoCart_PF obj = PageFactory.initElements(driver, Lab4_DemoCart_PF.class);
		obj.desktop();
		obj.mac();
		obj.sort(1);
		obj.search();
		obj.search2("Mobile");
		obj.tick();
		obj.searchbutton();
		
	}
}
