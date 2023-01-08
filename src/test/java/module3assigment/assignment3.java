package module3assigment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment3
{
	 public static WebDriver driver;
		@BeforeMethod
		public void beforeMethod() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		@Test
		public void test() throws InterruptedException {
			driver.get("https://demoqa.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			int noOfiframes = driver.findElements(By.tagName("iframe")).size();
			System.out.println("no.of iframes:"+ noOfiframes);
			
			driver.switchTo().frame(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/iframe[1]")));
			//driver.switchTo().frame(driver.findElement(By.xpath("/html[1]/iframe[1]")));
			driver.switchTo().frame(driver.findElement(By.xpath("//body/iframe[2]")));
			driver.switchTo().frame("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]]");//body/iframe[2]");
			driver.manage().window().maximize();
			
           driver.findElement(By.xpath("//h5[contains(text(),'Forms')")).click();
			
		//driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[2]")).click();
		}
		
		
		

}//iframe[@id='google_esf']
//"//iframe[@id='google_ads_iframe_/21849154601,22343295815/Ad.Plus-Anchor_0']