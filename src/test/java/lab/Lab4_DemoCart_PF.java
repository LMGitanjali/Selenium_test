package lab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Lab4_DemoCart_PF {
	
	WebDriver driver;
	@FindBy(linkText="Desktops")
    WebElement dt;
 	
	@FindBy(linkText="Mac (1)")
    WebElement mc;
 	
 	@FindBy(xpath="//*[@id=\"input-sort\"]")
    WebElement sorting;
 	
	
	@FindBy(xpath="//*[@id=\"search\"]/button")
	WebElement sbutton1;
	
	@FindBy(xpath="//*[@id=\"input-search\"]")
	WebElement sbox;
	
	@FindBy(xpath="//*[@id=\"input-description\"]")
	WebElement cbox;
	
	@FindBy(xpath="//*[@id=\"button-search\"]")
	WebElement sbutton;
	
	public Lab4_DemoCart_PF(WebDriver driver2) {
		this.driver=driver2;
	}
	
	public void desktop(){
		WebElement ele = dt;
	    Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
	}
	
	public void mac() {
		mc.click();
	}
	
	public void sort(int i) throws Exception {
		sorting.click();
		Select sort = new Select(sorting);
		Thread.sleep(3000);
		sort.selectByIndex(i);
	}
	
	public void search() {
		sbutton1.click();
	}
	
	public void search2(String text) {
	    sbox.sendKeys(text);
	}
	
	public void tick() {
		cbox.click();
	}
	
	public void searchbutton() {
	     sbutton.click();
	}
}
