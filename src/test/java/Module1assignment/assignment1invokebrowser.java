package Module1assignment;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment1invokebrowser {
	
	static WebDriver  driver;
	public static void main(String[] args) throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver1 = new ChromeDriver();
		  driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver1.manage().window().maximize();
			driver1.get("https://www.amazon.in/");
			String a = driver1.getCurrentUrl();
			if(a.equalsIgnoreCase("https://www.amazon.in/")) {
				System.out.println("TC1 passed");
			}
			else {
				System.out.println("TC1 failed");
			}
			
			
			driver1.navigate().forward();
			driver1.get("https://www.facebook.com");
			String b = driver1.getCurrentUrl();
			if(b.equalsIgnoreCase("https://www.facebook.com")) {
				System.out.println("TC2 passed");
			}
			else {
				System.out.println("TC2 failed");
			}
			
		driver1.navigate().forward();
			String expTitle = "Facebook – log in or sign up";
		    String actTitle = driver1.getTitle();
			
			if (expTitle.equals(actTitle)) {
				System.out.println("Tc passed");
			}else {
				System.out.println("TC Failed");
			}
			
			 driver1.navigate().forward();
			 driver1.quit();
			 System.clearProperty("webdriver.chrome.driver");
			 
			 //invoking edgedriver inplace of internetexplore
			 
		WebDriverManager.edgedriver().setup();
		 WebDriver driver2 = new EdgeDriver();
		 driver2.get("https://www.amazon.in");
		 System.out.println("moved to otherpage");
		driver2.get("https://www.facebook.com");
			 Thread.sleep(3000);
			driver2.navigate().back();
			System.out.println("backward");
			//#forward in history
			 Thread.sleep(3000);
			driver2.navigate().forward();
			System.out.println("Page navigated after forward");
			
			 driver2.quit();
	    System.clearProperty("webdriver.EdgeDriver");
		
	   //invoking firefox
	    
	    System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Downloads\\geckodriver-v0.32.0-win32");
		 WebDriver driver3 = new FirefoxDriver();
		  driver3.get("https://www.facebook.com");
		 
		 driver3.quit();
		 System.clearProperty("webdriver.gecko.driver");
		 
	
	
	
}}
