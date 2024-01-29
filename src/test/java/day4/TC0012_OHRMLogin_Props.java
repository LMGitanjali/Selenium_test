package day4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC0012_OHRMLogin_Props {

	public static void main(String[] args) throws IOException, Exception {
		//URL from  properties   logindata.properties
		
		InputStream input1 = new FileInputStream("D:\\Eclipse_training\\Java2024_Selenium\\logindata.properties");
		Properties prob = new Properties();
		prob.load(input1);
		String url = prob.getProperty("url");
		System.out.println("The URL is:" + url);
		
		File f1 = new File("D:\\Eclipse_training\\Java2024_Selenium\\input_data.xlsx");
		FileInputStream fis = new FileInputStream(f1);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("Row Count: "+rowCount);
		String[][] data = new String[3][2];
		
		for(int i=0;i<rowCount;i++) {
			data[i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
			data[i][1]=sheet.getRow(i).getCell(1).getStringCellValue();
			String uname = data[i][0];
			String pwd = data[i][1];
			System.out.println("Username: "+uname);
			System.out.println("Password: "+pwd);	
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get(url);
			Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			OHRM_POM_Props obj = new OHRM_POM_Props(driver);
			obj.enterusername(uname);
			obj.enterpassword(pwd);
			obj.clickButton();
		}
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		driver.findElement(By.name("password")).sendKeys("admin123");
//		driver.findElement(By.xpath("//button[@type='submit']")).submit();
	}
}
