package Module1assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment2checkboxs {
	
	public static void main(String[] args) throws Exception {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.findElement(By.id("vfb-7-1")).click();
		driver.findElement(By.id("vfb-6-1")).click();
		driver.findElement(By.id("vfb-6-2")).click();
		driver.navigate().forward();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement ddown = driver.findElement(By.name("country"));
		Select  select = new Select(ddown);
		select.selectByValue("KUWAIT");
		
		Thread.sleep(2000);
		driver.close();
            
}
}
