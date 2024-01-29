package day6;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import lab.Lab4_DemoCart_PF;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Lab4_8_TestNG_Main {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) throws Exception {
	  Lab4_DemoCart_PF obj = PageFactory.initElements(driver, Lab4_DemoCart_PF.class);
		obj.desktop();
		obj.mac();
		obj.sort(1);
		obj.search();
		obj.search2("Mobile");
		obj.tick();
		obj.searchbutton();
		
  }
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
  }

  @AfterMethod
  public void afterMethod() {
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
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
