package Module2assignment;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v104.debugger.model.CallFrame;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windows {
	public static void main(String[] args) throws InterruptedException  {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/popup.php");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
	 String MainWindow =  driver.getWindowHandle();
	Set<String> a1 = driver.getWindowHandles();
	System.out.println(a1);
	Iterator<String> M1 = a1.iterator();
	while(M1.hasNext()) {
		String Childwindow = M1.next();
		
		
		if(!MainWindow.equalsIgnoreCase(Childwindow )) {
			driver.switchTo().window(Childwindow);
			Thread.sleep(2000);
			String a = "/html/body";
			driver.switchTo().frame(a);
			//CallFrame
			//driver.findElement(By.xpath("//body/form[1]"));
			driver.findElement(By.name("emailid")).sendKeys("Admin@gmail.com");
			driver.findElement(By.name("btnLogin")).click();
			driver.close();
		}
		driver.switchTo().window(MainWindow);
		}
	}

    
	// Closing the Child Window.
	                       // driver.close();
	            }
	        
	        // Switching to Parent window i.e Main Window.
	     // driver.switchTo().window(MainWindow);
	    
	 


