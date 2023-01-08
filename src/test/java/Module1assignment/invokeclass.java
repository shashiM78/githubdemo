package Module1assignment;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class invokeclass {
	public static void main(String[] args) throws Exception {
		//System.setProperty("webdriver.chrome.driver",
		WebDriverManager.chromedriver().setup();
		WebDriver driverChrome = new ChromeDriver();
		Thread.sleep(2000);
		driverChrome.get("https://www.amazon.in/");
		driverChrome.manage().window().maximize();
		driverChrome.navigate().forward();
		driverChrome.get("https://www.facebook.com");

		String expTitle = "Facebook – log in or sign up";
		String actTitle = driverChrome.getTitle();
		if (expTitle.equals(actTitle)) {
		System.out.println("Tc passed");
		} else {
		System.out.println("TC Failed");
		}

		driverChrome.navigate().forward();
		driverChrome.close();

		System.clearProperty("webdriver.chrome.driver");
		//System.setProperty("webdriver.ie.driver", "./src/main/resources/IEDriverServer.exe");
		//
		WebDriverManager.edgedriver().setup();
		WebDriver driverIE = new EdgeDriver();
		//WebDriver driverIE = new InternetExplorerDriver();
		 driverIE.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driverIE.get("https://www.amazon.in/");
		 driverIE.navigate().forward();
		  driverIE.get("Facebook – log in or sign up");
		  driverIE.navigate().back();
		 Thread.sleep(2000);
		 driverIE.navigate().forward();
		 driverIE.close();
		// System.clearProperty("webdriver.InternetExplorerDriver");
		System.clearProperty("webdriver.microsoft edge.driver");
		 
		//webdriver driver = new Edge();
		

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Downloads\\geckodriver-v0.32.0-win32");
		WebDriver driverFireFox = new FirefoxDriver();
		driverFireFox.get("https://www.carwale.com/");
		Thread.sleep(2000);
		driverFireFox.close();

		}


}
