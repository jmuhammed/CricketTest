package com.test.cric;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.junit.Test;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestCricket {
	WebDriver driver =new FirefoxDriver();
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	
	
	@Before
	public void setUp(){
		
		driver.get("http://localhost:8080/CricWebApp-0.0.1-SNAPSHOT/login.do");
		
	}
	
	@Test
	public void cric1Signup() throws InterruptedException{
		driver.findElement(By.linkText("Sign Up")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("firstName")).sendKeys("pro");
		Thread.sleep(1000);
		driver.findElement(By.name("lastName")).sendKeys("karma");
		Thread.sleep(1000);
		driver.findElement(By.name("employeeId")).sendKeys("15528");
		Thread.sleep(1000);
		driver.findElement(By.name("emailId")).sendKeys("prk@prokarma.com");
		Thread.sleep(1000);
		driver.findElement(By.name("userName")).sendKeys("pkarma");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("pkarma");
		Thread.sleep(1000);
		driver.findElement(By.name("repeatPassword")).sendKeys("pkarma");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr[8]/td/input")).click();
		WebElement welement=driver.findElement(By.xpath("/html/body/div/form"));
		Boolean result=welement.getText().contains("Your are already registered");
		System.out.println(result);
		
	}
	
	
	@Test
	public  void cric2Login() throws InterruptedException{
		
		driver.manage().window().maximize(); 
		Thread.sleep(3000);
		
		
		driver.findElement(By.name("userName")).sendKeys("pkarma");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("pkarma");
		Thread.sleep(1000);
		driver.findElement(By.tagName("input")).click();
		driver.findElement(By.xpath("/html/body/form/div[2]/table/tbody/tr[3]/td/input")).click();
		Thread.sleep(2000);
		
	}
	
	@Test
	public void cric3Teamselection() throws InterruptedException{
		
		
		cric2Login();
		driver.findElement(By.linkText("Team Selection")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("teamName")).sendKeys("Pinch Hitters");
		driver.findElement(By.name("teamID")).sendKeys("10002");
		Thread.sleep(2000);
		jse.executeScript("scroll(0, 250)");
		driver.findElement(By.name("captainName")).sendKeys("John");
		driver.findElement(By.name("viceCaptainName")).sendKeys("Deepesh");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/form/div/table/tbody/tr[6]/td/input")).click();
		
		Thread.sleep(3000);
	}
 
	
	@Test
	public void cric4Playerenrollment() throws InterruptedException{
		
		cric2Login();
		driver.findElement(By.linkText("Enrollment Of Player")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("name")).sendKeys("deepeshk");
		Thread.sleep(1000);
		driver.findElement(By.name("employeeId")).sendKeys("1575");
		Thread.sleep(1000);
		driver.findElement(By.name("personalHighscore")).sendKeys("53");
		Thread.sleep(1000);
		driver.findElement(By.name("designation")).sendKeys("Associate Technical Manager");
		Thread.sleep(1000);
		driver.findElement(By.name("bowlingBest")).sendKeys("3/28");
		Thread.sleep(1000);
		driver.findElement(By.name("projectName")).sendKeys("Multiple");
		Thread.sleep(1000);
		driver.findElement(By.name("petName")).sendKeys("deepu");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("enroll")).click();
		Thread.sleep(3000);
		
	}
	
	@Test
	public void cric5Logout() throws InterruptedException{
		driver.manage().window().maximize(); 
		Thread.sleep(3000);
		
		
		driver.findElement(By.name("userName")).sendKeys("jmuh");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("pkarma");
		Thread.sleep(1000);
		driver.findElement(By.tagName("input")).click();
		driver.findElement(By.xpath("/html/body/form/div[2]/table/tbody/tr[3]/td/input")).click();
		Thread.sleep(2000);
		
	}
	
		@After 
 public void tearDown(){
	 
	 driver.close();
 }
	

}
