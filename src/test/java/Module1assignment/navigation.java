package Module1assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class navigation {

	public static void main(String[] args) {
		
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();

	//#url 1 launch
	//driver2.get("https://www.amazon.in");
	//#url 2 launch
	//driver2.get("https:https://www.facebook.com");
	//#back in history
	//driver2.navigate().back();
	System.out.println("Page navigated after back: ' + driver.title");
	//#forward in history
//	driver2.navigate().forward();
	System.out.println("Page navigated after forward: ' + driver.title");
	
	//driver2.quit();

}
}