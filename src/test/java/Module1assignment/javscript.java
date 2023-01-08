package Module1assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javscript {
	public static void main(String[] args) throws IOException{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 //Launching URL 
		 
		driver.get("https://jqueryui.com/");
		
		//using javascriptExecutor
		
		WebElement link = driver.findElement(By.linkText("Draggable"));
	    JavascriptExecutor js = (JavascriptExecutor) driver;  
	             js.executeScript("arguments[0].click();",link);		
	    		
	//switching to frame
		
		driver.switchTo().frame(0);
		
		//Action  moveByoffset is used for dragging the element
		WebElement drag = driver.findElement(By.id("draggable"));
		Actions act = new Actions(driver);
		
	act.clickAndHold(drag).moveByOffset(120, 110).build().perform();
	
	
     //Taking screenshot
		
	 File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
     
     //Copy the file to a location 
     
         FileUtils.copyFile(screenshot, new File(".//ScreenshotPageScreenshot.png"));
    
 
     System.out.println("The Screenshot is captured.");
     
     //closing the webdriver
     driver.quit();
     }
}     
	
		
	 
 




