package Module1assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment2checkboxs {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Technical Stuff\\chromedriver_win32\\chromedriver.exe");

//		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.guru99.com/test/radio.html");
		
		JavascriptExecutor ex = (JavascriptExecutor) driver;
		
		
		WebElement radioButton1 = driver.findElement(By.id("vfb-7-1"));
		ex.executeScript("arguments[0].click();", radioButton1);
		Thread.sleep(3000);
		
		WebElement radioButton2 = driver.findElement(By.id("vfb-6-1"));
		ex.executeScript("arguments[0].click();", radioButton2);
		Thread.sleep(3000);
		
		WebElement radioButton3 = driver.findElement(By.id("vfb-6-2"));
		ex.executeScript("arguments[0].click();", radioButton3);
		Thread.sleep(3000);
		
		driver.navigate().forward();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement ddown = driver.findElement(By.name("country"));
		Select  select = new Select(ddown);
		select.selectByValue("KUWAIT");
		
		Thread.sleep(2000);
		driver.close();
            
}
}
