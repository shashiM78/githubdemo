package module3assigment;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Testngassignment3smoketest {
	public static WebDriver driver;

@BeforeMethod
public void beforeMethod() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demoqa.com/");
}

@Test(groups = "smoke")
public void testForm() throws Exception {
	Thread.sleep(3000);
	//driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='app']")
 driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]")).click();

driver.findElement(By.xpath("//span[contains(text(),'Practice Form')]]")).click();

}

//@AfterMethod
//public void closeDriver() {
//driver.quit();
}
//}

