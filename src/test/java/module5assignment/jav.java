package module5assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Module2assignment.JavascriptExecutor;
import io.github.bonigarcia.wdm.WebDriverManager;

public class jav {
	
		public static void main(String[] args) throws Exception {
			

		    
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			 driver.manage().window().maximize();
			driver.get("https://jqueryui.com/");
			JavascriptExecutor js =  (JavascriptExecutor) driver;
			WebElement link = driver.findElement(By.linkText("Draggable"));
		    js.excutescript("argument[0].click()", link);	
		  ;			
		    		
			WebElement b = driver.findElement(By.linkText("Draggable"));
			js.excutescript(argument[0].c link)
			//String a = "/html[1]/body[1]";
			driver.switchTo().frame(0);
			
			
			WebElement drag = driver.findElement(By.id("draggable"));
			Actions act = new Actions(driver);
			
		act.clickAndHold(drag).moveByOffset(120, 110).build().perform();
		Thread.sleep(2000);



}
