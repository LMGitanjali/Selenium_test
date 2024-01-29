package Step_Definition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001_Login {
	WebDriver driver;
	@Given("Launch the Chrome browser")
	public void launch_the_chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    }

	@When("user opens the url")
	public void user_opens_the_url() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	}

	@And("user enter the username and password")
	public void user_enter_the_username_and_password() throws Exception{
		
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
	 driver.findElement(By.name("username")).sendKeys("Admin");
	 driver.findElement(By.name("password")).sendKeys("admin123");
	 
	}

	@And("Click on login button")
	public void click_on_login_button(){
		//Thread.sleep(3000);
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("Home page should be displayed")
	public void home_page_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		boolean dashboard=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).isDisplayed();
		
		if(dashboard) {
			System.out.println("Login successful");
		}
		else {
			System.out.println("Login not successful");
		}
	}

}
