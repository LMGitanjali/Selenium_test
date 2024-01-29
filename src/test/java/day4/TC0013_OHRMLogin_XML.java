package day4;

import java.io.File;
import java.time.Duration;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TC0013_OHRMLogin_XML {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File xmlfile = new File("D:\\Eclipse_training\\Java2024_Selenium\\logindata.xml");
		DocumentBuilderFactory DBFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dbuilder = DBFactory.newDocumentBuilder();
		Document doc = dbuilder.parse(xmlfile);
		NodeList nl = doc.getChildNodes();
		Node n = nl.item(0);
		Element ele = (Element)n;
		String url = ele.getElementsByTagName("url").item(0).getTextContent();
		String uname = ele.getElementsByTagName("username").item(0).getTextContent();
		String pwd = ele.getElementsByTagName("password").item(0).getTextContent();
	
				
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		System.out.println("Username: "+uname );
		System.out.println("Password: "+pwd );
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		OHRM_POM_XML obj = new OHRM_POM_XML(driver);
		obj.enterusername(uname);
		obj.enterpassword(pwd);
		obj.clickButton();
	}
}
