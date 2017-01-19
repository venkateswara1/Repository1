package RACFtoAD;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;

public class Applications extends Helper {
	WebDriver driver;
  @Test
  public void Add_Application() throws InterruptedException 
  {
	 AddApplication("Ecommerce", "Ecommerce", "E trading");
	 AddApplication("Ecommerce1", "Ecommerce", "E trading");
	 AddApplication("Ecommerce2", "Ecommerce", "E trading");
	 AddApplication("Ecommerce3", "Ecommerce", "E trading");
	 AddApplication("Ecommerce4", "Ecommerce", "E trading");
	 AddApplication("Ecommerce5", "Ecommerce", "E trading");
	 AddApplication("Ecommerce6", "Ecommerce", "E trading");
	 AddApplication("Ecommerce7", "Ecommerce", "E trading");
	 AddApplication("Ecommerce8", "Ecommerce", "E trading");
	 AddApplication("Ecommerce9", "Ecommerce", "E trading");
	 AddApplication("Ecommerce10", "Ecommerce", "E trading");
	 AddApplication("Ecommerce11", "Ecommerce", "E trading");
	 AddApplication("Ecommerce12", "Ecommerce", "E trading");
	 AddApplication("Ecommerce13", "Ecommerce", "E trading");
	 AddApplication("Ecommerce14", "Ecommerce", "E trading");
	 AddApplication("Ecommerce15", "Ecommerce", "E trading");
	 AddApplication("Ecommerce16", "Ecommerce", "E trading");
	 AddApplication("Ecommerce17", "Ecommerce", "E trading");
	 AddApplication("Ecommerce18", "Ecommerce", "E trading");
	 AddApplication("Ecommerce19", "Ecommerce", "E trading");
	 AddApplication("Ecommerce20", "Ecommerce", "E trading");
	 
  }
  @Parameters({ "browser" })
  @BeforeTest
	public void beforeTest(String browser) throws InterruptedException {
		if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}

		else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "F:\\Widget\\Brow\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();

		} else if (browser.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "F:\\selenium\\IEDriverServer_Win32_2.53.1\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();

		}
		
		driver.get("http://192.168.10.15:7086");
		Thread.sleep(15000);
	//	driver.navigate().to("http://caparna:Undertakerjohn@10@192.168.10.15:7086"); 
	}


  @AfterTest
	public void afterTest() {
		driver.quit();
	}

}
