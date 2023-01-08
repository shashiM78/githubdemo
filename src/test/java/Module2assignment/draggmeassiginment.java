package Module2assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder;

public class draggmeassiginment {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://jqueryui.com/");
		driver.findElement(By.linkText("Draggable")).click();
		//String a = "/html[1]/body[1]";
		driver.switchTo().frame(0);
		
		
		WebElement drag = driver.findElement(By.id("draggable"));
		Actions act = new Actions(driver);
		
	act.clickAndHold(drag).moveByOffset(120, 110).build().perform();
	Thread.sleep(2000);
		
		driver.quit();
	   }
		
	

}
