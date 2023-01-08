package Module2assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webtableassigment1 {
	
	 public static void main(String[] args) throws Exception{

		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\902590\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		 WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();

		 driver.get("https://demo.guru99.com/test/web-table-element.php");

		 List<WebElement> tableEntries = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));

		 for(int index = 1; index <= tableEntries.size(); index++) {
		 String entryXpath = "//table[@class='dataTable']/tbody/tr[" +  index + "]/td/a";
		 WebElement entry = driver.findElement(By.xpath(entryXpath));
		 System.out.println(entry.getText());
		 }
		 
		 driver.navigate().forward();
		 
		 driver.get("https://demo.guru99.com/test/login.html");
		 driver.findElement(By.id("email")).sendKeys("Admin123@gmail.com");
		 driver.findElement(By.id("passwd")).sendKeys("Admin123");
		 driver.findElement(By.tagName("button")).click();
		 

		 driver.close();

		 }

}
