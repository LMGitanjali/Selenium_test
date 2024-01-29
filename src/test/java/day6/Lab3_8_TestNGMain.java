package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab3_8_TestNGMain {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) throws Exception {
	 
		//driver.manage().window().maximize();        // to maximize the window
		//driver.findElement(By.linkText("Desktops")).click();
//		  driver.findElement(By.linkText("Mac (1)")).click();

//    	Select sort = new Select(driver.findElement(By.xpath("//*[@id=\"input-sort\"]")));
//		sort.selectByIndex(1);
//	
//	JavascriptExecutor js =(JavascriptExecutor)driver;
//	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//	Thread.sleep(3000);
//	
//	driver.findElement(By.xpath("//*[@id=\"product-list\"]/div/form/div/div[2]/div[2]/button[1]")).click();
	
	Lab3_8_testNGPom obj = new Lab3_8_testNGPom(driver);
	obj.desktop();
	obj.mac();
	obj.sort(1);
	
	JavascriptExecutor js =(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	Thread.sleep(3000);
	
	obj.addcart();
	}
	
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is before method");
	  WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is after method");
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
     // new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is before suite ");
  }

  @AfterSuite
  public void afterSuite() {
  }

}
