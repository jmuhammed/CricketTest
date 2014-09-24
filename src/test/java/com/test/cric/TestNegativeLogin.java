package com.test.cric;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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
	public void test_different_login(String uname,String pwd) throws InterruptedException{
		WebDriver driver=new FirefoxDriver();
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		driver.get("http://localhost:8080/CricWebApp-0.0.1-SNAPSHOT/login.do");
		driver.findElement(By.name("userName")).sendKeys(uname);
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys(pwd);
		Thread.sleep(1000);
		driver.findElement(By.tagName("input")).click();
		driver.findElement(By.xpath("/html/body/form/div[2]/table/tbody/tr[3]/td/input")).click();
		Thread.sleep(3000);
	    //Object str=jse.executeScript("document.getElementById('loginform').firstElementChild.innerHTML");
		driver.close();
	
	}
}
