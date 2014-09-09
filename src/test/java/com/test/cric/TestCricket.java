package com.test.cric;
 import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.CapabilityType;
//import org.openqa.selenium.remote.DesiredCapabilities;
import org.junit.Test;
 
public class TestCricket {
	WebDriver driver =new FirefoxDriver();
	
	@Test
	public void cricLogin(){
		//System.setProperty("webdriver.chrome.driver", "\\Selenium\\chromedriver.exe");
		//DesiredCapabilities capability = DesiredCapabilities.chrome();
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("test-type");
		//capability.setCapability(ChromeOptions.CAPABILITY, options);
		//capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		//WebDriver driver = new ChromeDriver(options);
		driver.get("http://localhost:8080/CricWebApp/login.do");
		driver.manage().window().maximize(); 
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.findElement(By.linkText("Sign Up")).click();
		driver.findElement(By.name("userName")).sendKeys("jmuh");
		driver.findElement(By.name("password")).sendKeys("jmuh");
		driver.findElement(By.tagName("input")).click();
		driver.findElement(By.xpath("/html/body/form/div[2]/table/tbody/tr[3]/td/input")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
		
	}
 
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestCricket tc=new TestCricket();
		tc.cricLogin();

	}

}
