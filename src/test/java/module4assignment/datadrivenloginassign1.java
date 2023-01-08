package module4assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datadrivenloginassign1 {
	 public static WebDriver driver;
	 
		@BeforeMethod
		public void beforeMethod() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		driver.manage().window().maximize();
			 driver.get("https://demo.guru99.com/V4/");
			
		}
		
		@Test(dataProvider = "getDataFromexcel")
		public void validatelogin(String uname, String pwd) throws Exception { 
			 driver.findElement(By.name("uid")).sendKeys(uname);
			 driver.findElement(By.name("password")).sendKeys(pwd); 
		 driver.findElement(By.name("btnLogin")).click();
		 
		 //switching to alert
		  Alert alert = driver.switchTo().alert(); 
		  Thread.sleep(3000);
		  //accepting alert
	        driver.switchTo().alert().accept();
	       
			 
		}
		
		
		//data provider using apache poi & getting data from excelsheet
       @DataProvider
		public Object[][] getDataFromexcel() {
    	   String filepath  = "./src/test/java/module4assignment/Testdata2.xlsx";
			ExcelUtil reader = new ExcelUtil(filepath, "data");
			return reader.getData();
		
		}
       @AfterMethod
       public void Aftermethod() {
    	   driver.quit();
       }
}
