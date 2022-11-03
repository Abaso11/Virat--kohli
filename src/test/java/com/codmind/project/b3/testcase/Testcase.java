package com.codmind.project.b3.testcase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.codmind.project.b3.Homepage;

public class Testcase {
	WebDriver driver;
	Homepage homepage;
	
	
	
	@BeforeMethod
	public void login() {
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver_win32 (6)\\chromedriver.exe");
		

		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	public void verifyValidLogin() {
		
		homepage = new Homepage(driver);
		
		homepage.setUserName();
		homepage.getUserName().sendKeys("test1");
		homepage.setPassword();
		homepage.getPassword().sendKeys("test1");
		homepage.setLoginButton();
		homepage.getLoginButton().click();

	}
	
	
	
	
	
	}


