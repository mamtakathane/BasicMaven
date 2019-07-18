package com.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class abc {

	
	WebDriver driver;
@Test
public void browser(){

	
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe" );
		
	 driver= new ChromeDriver();
	driver.get("https://www.youtube.com");
	driver.manage().window().maximize();
	
}
	@Test
	public void browserclose(){
	driver.close();	
		
		
	
	}
     
}
