package module3assigment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	 public static WebDriver driver;
	 
		@BeforeMethod
		public void beforeMethod() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		@Test(dataProvider = "logindetails")
		public void validatelogin(String username, String password) { 
			 driver.get("https://demo.guru99.com/test/login.html");
			 driver.findElement(By.id("email")).sendKeys(username);
			 driver.findElement(By.id("passwd")).sendKeys(password); 
			 driver.findElement(By.id("SubmitLogin")).click();
			 
		}
		
		@DataProvider(name = "logindetails")
		public Object[][] getlogindata() {
			Object[][] data = new Object[1][2];
			data[0][0] = "admin123@gmail.com";
			data[0][1] = "admin123";
			return data;
			 
		}
		@AfterMethod
		public void aftermethod() {
			driver.quit();
		}
}
