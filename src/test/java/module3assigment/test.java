package module3assigment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.OperaDriverManager;
	
		
		public class test{
			 public static WebDriver driver;
			 
			@BeforeMethod
			public void beforeMethod() {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
			
				@Test
				 public void validatelogin() {
					 
				 driver.get("https://demo.guru99.com/test/login.html");
					 driver.findElement(By.id("email")).sendKeys("Admin123@gmail.com");
					 driver.findElement(By.id("passwd")).sendKeys("Admin123"); 
					 driver.findElement(By.id("SubmitLogin")).click();
				 }
				 
				 
			@AfterMethod
			public void afterMethod() {
		     driver.close();	
			}	
			}

