package RACFtoAD;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;

public class UserManagement extends Helper
{
  @Test(priority=1)
  public void UserManagement_ModuleAccessFromDashboard() throws InterruptedException
  {
	driver.get("http://192.168.10.15:7086");
	driver.navigate().to("http://caparna:Undertakerjohn@10@192.168.10.15:7086"); 
	
	CheckAvailability(CreateWebElement(XpathUserModule, "User Management"), "UserManagement");
	ClickEvent(CreateWebElement(XpathUserModule, "User Management"), "UserManagement");
	Thread.sleep(3000);
  }
  
  @Test(priority=2)
  public void UserManagement_AddUser() throws InterruptedException
  {
	/*  System.out.println("In method 2 main block");
	 //Expected Validation messages
	  String ExpectedMessages[] = {"Invalid Username. Please enter a valid Username.","Username already exists. Please enter different Username.","The Username field is required.","User added successfully."};
	  String XpathMessageDiv[] = {"//*[@id='page-content']/div/div/div[1]/div[1]","//*[@id='frmUser']/div/div[2]/div/div/div/div[2]/div/div[2]/div"};
	  String XpathUserNameTextBox = "//*[@id='UserName']";
	  String XpathCancel ="//*[@id='frmUser']/div/div[3]/div/div[2]/input[2]";
	  
	  String XpathAddUserButton = "//*[@id='page-content']/div/div/div[1]/div[2]/div/div/button/b";
	
	  String NewUserName = "adivyapoorani";
	  String ExistingUserName = "caparna";
	  String InvalidUsername = "rganesh";
	  String NullUserName =" ";
	  String XpathSearchButton = "//*[@id='btnCheck']/i";
	  String XpathAddButton = "//*[@id='btnSave']";
	  
	  	//To check if the user enters the valid user name
	  	
	  		System.out.println("In try block");
	  		Add(XpathAddUserButton,XpathUserNameTextBox, NewUserName, XpathSearchButton, XpathAddButton);
	  	//	Assert.assertEquals(ExpectedMessages[3],GetText(XpathMessageDiv[0]));
	  		Thread.sleep(5000);
	  		
	  		Add(XpathAddUserButton,XpathUserNameTextBox, ExistingUserName, XpathSearchButton, XpathAddButton);
	  	//	Assert.assertEquals(ExpectedMessages[1],GetText(XpathMessageDiv[1]));
	  		ClickEvent(CreateWebElement(XpathCancel, "Cancel Button"), "Cancel Button");
	  		Thread.sleep(5000);
	 
	  		Add(XpathAddUserButton,XpathUserNameTextBox, InvalidUsername, XpathSearchButton, XpathAddButton);
	  	//	Assert.assertEquals(ExpectedMessages[0],GetText(XpathMessageDiv[1]));
	  		ClickEvent(CreateWebElement(XpathCancel, "Cancel Button"), "Cancel Button");
	  		Thread.sleep(5000);
	  		
	  //	Add(XpathAddUserButton,XpathUserNameTextBox, NullUserName, XpathAddButton);
	//  	Assert.assertEquals(ExpectedMessages[2],GetText(XpathMessageDiv[1]));
	  		ClickEvent(CreateWebElement(XpathCancel, "Cancel Button"), "Cancel Button");
	  		Thread.sleep(5000);*/
	  
		Add("rvidya");
	  	
  }
  
  @Test(priority=3)
  public void UserManagement_DeleteUser() throws InterruptedException
  {  
	  
/*CheckAvailability(CreateWebElement("//*[@id='mainnav-menu']/li[3]/a/i", "Application module"), "Application module");
	ClickEvent(CreateWebElement("//*[@id='mainnav-menu']/li[3]/a/i", "Application module"), "Application module");
	
	
	String [] ToBeDeleted = {"Test26","Test56"};
	DeleteMultiple(ToBeDeleted);*/
	
	//*[@id='tblDataResult']/tbody/tr[1]/td[2]
	//*[@id="tblDataResult"]/tbody/tr/td[1]/center/input
	  deleteuser("rvidya");
	  
  }
  
  @Parameters({ "browser" })
  @BeforeTest
	public void beforeTest(String browser) {
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
	}


  @AfterTest
	public void afterTest() {
		driver.quit();
	}

}



