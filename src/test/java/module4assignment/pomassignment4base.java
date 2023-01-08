package module4assignment;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pomassignment4base {
	
	
public static WebDriver driver;

	public void initialization() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://itechnotion.com/what-will-be-the-cost-of-an-app-like-justdial-its-indias-no-1-local-business-directory/"); 
	}
	
	
	
	
	 @DataProvider
		public Object[][] getDataFromexcel() {
 	   String filepath  = "./src/test/java/module4assignment/POMExcelTestdata1.xlsx";
			ExcelUtil reader = new ExcelUtil(filepath, "data");
			return reader.getData();
		
		}
	public void tearDown() {
		driver.quit();
	}
	}


