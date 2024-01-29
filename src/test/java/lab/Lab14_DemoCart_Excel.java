package lab;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import day3.OHRM_POM;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab14_DemoCart_Excel {

	public static void main(String[] args) throws IOException, Exception {
		
		File f1 = new File("D:\\Eclipse_training\\Java2024_Selenium\\lab14_input.xlsx");
		FileInputStream fis = new FileInputStream(f1);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("Row Count: "+rowCount);
		String[][] data = new String[2][4];
		
		for(int i=0;i<rowCount;i++) {
			data[i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
			data[i][1]=sheet.getRow(i).getCell(1).getStringCellValue();
			data[i][2]=sheet.getRow(i).getCell(2).getStringCellValue();
			data[i][3]=sheet.getRow(i).getCell(3).getStringCellValue();
			
			String fname = data[i][0];
			String lname = data[i][1];
			String email = data[i][2];
			String pwd = data[i][3];
		
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			System.out.println("First Name: "+fname);
			System.out.println("Last Name: "+lname);
			System.out.println("Email : "+email);
			
			driver.get("https://demo.opencart.com/");
			
			driver.findElement(By.linkText("My Account")).click();
			
			WebElement ele= driver.findElement(By.linkText("My Account"));
			Actions act = new Actions(driver);
			act.moveToElement(ele).perform();
			driver.findElement(By.linkText("Register")).click();
			
			Lab14_POM obj = new Lab14_POM(driver);
			obj.enterfirstname(fname);
			obj.enterlastname(lname);
			obj.enteremail(email);
			obj.enterpassword(pwd);
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			
			Thread.sleep(3000);
			obj.enterradioButton();
			obj.click();
			obj.submit();
			driver.quit();
		}
	}
}
