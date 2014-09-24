package com.test.cric;
 import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

//import org.openqa.selenium.remote.CapabilityType;
//import org.openqa.selenium.remote.DesiredCapabilities;
import org.junit.Test;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestCricket {
	WebDriver driver =new FirefoxDriver();
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	
	
	@Before
	public void setUp(){
		
		driver.get("http://localhost:8080/CricWebApp-0.0.1-SNAPSHOT/login.do");
		
	}
	
	
	
	
	
	
	
	@Test
	public void cric1Signup(){
		driver.findElement(By.linkText("Sign Up")).click();
		driver.findElement(By.name("firstName")).sendKeys("muhammed");
		driver.findElement(By.name("lastName")).sendKeys("mohideen");
		driver.findElement(By.name("employeeId")).sendKeys("1552");
		driver.findElement(By.name("emailId")).sendKeys("azar@gmail.com");
		driver.findElement(By.name("userName")).sendKeys("jmuh");
		driver.findElement(By.name("password")).sendKeys("jmuh");
		driver.findElement(By.name("repeatPassword")).sendKeys("jmuh");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr[8]/td/input")).click();
	}
	
	
	
	@Test
	
	public  void cric2Login(){
		
	
		driver.manage().window().maximize(); 
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
		
		
		
	}
	@Test
	public void cric3Teamselection(){
		
		
		cric2Login();
		driver.findElement(By.linkText("Team Selection")).click();
		driver.findElement(By.name("teamName")).sendKeys("blasters");
		driver.findElement(By.name("teamID")).sendKeys("10002");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		jse.executeScript("scroll(0, 250)");
		driver.findElement(By.name("captainName")).sendKeys("Srini");
		driver.findElement(By.name("viceCaptainName")).sendKeys("Madulla");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("/html/body/form/div/table/tbody/tr[6]/td/input")).click();
		
	}
 
	
	@Test
	public void cric4Playerenrollment(){
		
		cric2Login();
		driver.findElement(By.linkText("Enrollment Of Player")).click();
		driver.findElement(By.name("name")).sendKeys("deepeshk");
		driver.findElement(By.name("employeeId")).sendKeys("1575");
		driver.findElement(By.name("personalHighscore")).sendKeys("53");
		driver.findElement(By.name("designation")).sendKeys("Associate Technical Manager");
		driver.findElement(By.name("bowlingBest")).sendKeys("4/28");
		driver.findElement(By.name("projectName")).sendKeys("internal");
		driver.findElement(By.name("petName")).sendKeys("deepu");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("enroll")).click();
		
	}
	
	/*public void cric4Scoredetails(){
		cric2Login();
		driver.findElement(By.linkText("Score Details")).click();
		driver.findElement(By.name("selectedYear")).click();
		WebElement ddelement=driver.findElement(By.id("selectedYear"));
		List<WebElement> options=ddelement.findElements(By.tagName("option"));
		System.out.println(options.size());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		jse.executeScript("$('select>option:eq(2)').attr('selected', true);");
		

		
				
				
				
	
		//driver.findElement(By.name("teamID")).sendKeys("10002");
		
	}
*/ 
	@After 
 public void tearDown(){
	 
	 driver.close();
 }
	

}
