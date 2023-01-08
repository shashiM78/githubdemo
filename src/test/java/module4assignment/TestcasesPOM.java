package module4assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pomassignment4.pomassignment4base;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.dynamic.NexusAccessor.InitializationAppender;

public class TestcasesPOM extends pomassignment4base {
	 
	 
@BeforeMethod
public void browser() {
	initialization();
}

	@Test
	public void Retriveallheaders() {
	WebElement headers = driver.findElement(By.tagName("header"));
	 String text = (headers.getText());
	 System.out.println("all headers");
	System.out.println(headers.getText());
	driver.quit();
	}
	
	@Test(dependsOnMethods = "Retriveallheaders" )
	public void Retrivefeature() throws Exception {
		Thread.sleep(2000);
	//driver.get("https://startupfo.rest/white-label-telemedicine-app/");
	driver.findElement(By.linkText("Products")).click();
	driver.findElement(By.linkText("vDoctor")).click();
	driver.findElement(By.cssSelector("header.defaultscroll.sticky:nth-child(2) div.container div:nth-child(4) ul.navigation-menu.nav-right li:nth-child(2) > a:nth-child(1)")).click();
	WebElement features = driver.findElement(By.xpath("//body/section[@id='nfeatures']/div[1]/div[2]"));
	String text2 = (features.getText());
	System.out.println("all Features");
	System.out.println(features.getText());
	driver.quit();
	}
	@Test(dependsOnMethods = "Retrivefeature")
	public void RetriveallTechnology() throws Exception {
	Thread.sleep(2000);
	driver.get("https://startupfo.rest/white-label-telemedicine-app/");
	driver.findElement(By.xpath("//a[contains(text(),'Technology')]")).click();
	WebElement tech =	 driver.findElement(By.xpath("//body/section[3]/div[1]/div[4]"));
	 String text3 = (tech.getText()); 
	 System.out.println("all technologies");
	System.out.println(tech.getText());
	driver.quit();
	}
	
	@Test(dataProvider = "getDataFromexcel")
	public void getquote(String uname,String email,String Coun,String msg)  throws Exception {
		Thread.sleep(2000);
		 driver.get("https://startupfo.rest/white-label-telemedicine-app/");
	driver.findElement(By.xpath("//header/div[1]/div[2]/a[1]")).click();
	driver.switchTo().frame(driver.findElement(By.id("hs-form-iframe-0")));
	driver.findElement(By.name("firstname")).sendKeys("uname");
	driver.findElement(By.name("email")).sendKeys("email");
	driver.findElement(By.name("country")).sendKeys("Coun");
	driver.findElement(By.name("message")).sendKeys("msg");
	driver.quit();
	}
	
	 @DataProvider
		public Object[][] getDataFromexcel() {
	   String filepath  = "./src/test/java/module4assignment/POMExcelTestdata1.xlsx";
			ExcelUtil reader = new ExcelUtil(filepath, "data");
			return reader.getData();
		
	 }
	 
	@Test
	public void submit() throws InterruptedException {
	driver.findElement(By.id("voomplatform4-e83e7559-32cd-4d21-8fe5-970edce9bc8e")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/form[1]/div[6]")).submit();
	
	}
	@AfterMethod
	public void closebrowser() {
		tearDown();
	}
	
	

	
}
	


