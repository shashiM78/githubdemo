package Module2assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowsassignment2 {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Launching the site.
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
		ArrayList<String> tabList = new ArrayList<String> (driver.getWindowHandles());
		System.out.println(tabList.toString());
		for(String tab : tabList) {
		driver.switchTo().window(tab);
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());
		if(driver.getCurrentUrl().contains("articles_popup")) {
		System.out.println(tab);
		driver.findElement(By.name("emailid")).sendKeys("Admin123@gmail.com");
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(3000);
		
		}
		}
		//driver.quit();
	}}