package Module2assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iFrames {
		public static void main(String[] args) {
               WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();    //navigates to the Browser
			    driver.get("http://demo.guru99.com/test/guru99home/"); 
			       // navigates to the page consisting an iframe

			       driver.manage().window().maximize();
			       driver.switchTo().frame("a077aa5e"); //switching the frame by ID

					System.out.println("iframes done");
		     		driver.findElement(By.xpath("html/body/a/img")).click();
		  		    
		     		driver.close();
		     		
		       

		  		
		      }

		}

