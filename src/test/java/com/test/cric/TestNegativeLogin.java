package com.test.cric;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;

@RunWith(DataProviderRunner.class)
public class TestNegativeLogin {
	
	
	
	
	@DataProvider
	public static Object[][] data() {
	return new Object[][] {
	{ "ram", "abc" },
	{ "vishnu", "abc" },
	{ "", "jmuh" },
	{"jmuh",""},
	{" "," "},
	{"<script>","</script>"}
	};
}
	
	
	
	
	@Test
	@UseDataProvider("data")
	public void test_different_login(String uname,String pwd){
		WebDriver driver=new FirefoxDriver();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		driver.get("http://localhost:8080/CricWebApp/login.do");
		driver.findElement(By.name("userName")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.tagName("input")).click();
		
		//System.out.println("Text ="+driver.findElement(By.cssSelector("#loginform>div")).getAttribute("style").valueOf(
		
		
		
		driver.findElement(By.xpath("/html/body/form/div[2]/table/tbody/tr[3]/td/input")).click();
	   try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	
	  Object str=jse.executeScript("document.getElementById('loginform').firstElementChild.innerHTML");
	
	   System.out.println("Test text :"+str);
		driver.close();
	
	}
}
