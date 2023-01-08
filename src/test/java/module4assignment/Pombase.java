package module4assignment;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pombase {
	public static WebDriver driver;
	
//	@BeforeMethod
//	public void beforeMethod() {
	public static void main(String[] args) throws Exception {
		
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
			 driver.get("https://itechnotion.com/what-will-be-the-cost-of-an-app-like-justdial-its-indias-no-1-local-business-directory/");
			 driver.getTitle();
		WebElement headers =	 driver.findElement(By.tagName("header"));
		 String text = (headers.getText());
		 System.out.println("all headers");
		System.out.println(headers.getText());
		
		driver.findElement(By.linkText("Products")).click();
		driver.findElement(By.linkText("vDoctor")).click();
		driver.findElement(By.cssSelector("header.defaultscroll.sticky:nth-child(2) div.container div:nth-child(4) ul.navigation-menu.nav-right li:nth-child(2) > a:nth-child(1)")).click();
		WebElement features = driver.findElement(By.xpath("//body/section[@id='nfeatures']/div[1]/div[2]"));
		String text2 = (features.getText());
		System.out.println("all Features");
		System.out.println(features.getText());
	
		driver.findElement(By.xpath("//a[contains(text(),'Technology')]")).click();
		WebElement tech =	 driver.findElement(By.xpath("//body/section[3]/div[1]/div[4]"));
		 String text3 = (tech.getText()); 
		 System.out.println("all technologies");
		System.out.println(tech.getText());
		
		driver.findElement(By.xpath("//header/div[1]/div[2]/a[1]")).click();
		driver.switchTo().frame(driver.findElement(By.id("hs-form-iframe-0")));
		driver.findElement(By.name("firstname")).sendKeys("Admin12");
		driver.findElement(By.name("email")).sendKeys("163shashikumar@gmail.com");
		driver.findElement(By.name("country")).sendKeys("India");
		driver.findElement(By.name("message")).sendKeys("I like Testing");
		driver.findElement(By.id("voomplatform4-e83e7559-32cd-4d21-8fe5-970edce9bc8e")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/form[1]/div[6]")).submit();
		
		
		
		

		
	}}
		
	

