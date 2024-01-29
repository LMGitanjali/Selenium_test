package lab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Lab3_DemoCart_Pom {
	
	WebDriver driver;
	By dt = By.linkText("Desktops");
	By mc = By.linkText("Mac (1)");
	By sorting = By.xpath("//*[@id=\"input-sort\"]");
	By add=By.xpath("//*[@id=\"product-list\"]/div/form/div/div[2]/div[2]/button[1]");
	
	public Lab3_DemoCart_Pom(WebDriver driver2) {
		this.driver=driver2;
	}
	
	public void desktop() throws Exception {
		WebElement ele = driver.findElement(dt);
	    Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
	}
	
	public void mac() {
		driver.findElement(mc).click();
	}
	
	public void sort(int i) throws Exception {
		driver.findElement(sorting).click();
		Select sort = new Select(driver.findElement(sorting));
		Thread.sleep(3000);
		sort.selectByIndex(i);
	}
	
	public void addcart() {
		driver.findElement(add).click();
	}
}
