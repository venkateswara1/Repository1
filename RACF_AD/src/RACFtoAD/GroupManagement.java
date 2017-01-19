package RACFtoAD;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;

public class GroupManagement extends Helper
{
	//TODO GROUP MANAGEMENT PAGE
	@Test(priority =1)
  public void ToAddGroup() throws InterruptedException
  {
		
	/*  AddGroup("BA", "BA");
	  AddGroup("Analyst", "App dev");
	  AddGroup("Tech Analyst", "Director");
	  AddGroup("Prg Analyst", "Director");
	  AddGroup("Design Analyst", "Director");*/
	/*  AddGroup("CEO", "Director");
	  AddGroup("CTO", "Director");
	  AddGroup("CFO", "Director");
	  AddGroup("Founder", "Director");
	  AddGroup("Manager", "Director");
	  AddGroup("Test Engineer", "Director");
	  AddGroup("Senior Developer", "Director");
	  AddGroup("VP", "Director");
	  AddGroup("TL", "Director");
	  AddGroup("PMO", "Director");
	  AddGroup("IS Memeber", "Director");*/
  }
  

	
/*	@Test(priority =2)
	  public void ToEditGroupDesc() throws InterruptedException
	  {
		  EditGroup("BA", "Businesss Analyst");
	  }
	
@Test(priority =3)
  public void Deletegroup() throws InterruptedException
	{
	    NavigateTo("Group");
	    deletegroup("Prg Analyst");
	}
	
@Test(priority =4)
  public void DeleteGroups() throws InterruptedException
  {
		NavigateTo("Group");
		String [] ToBeDeleted = {"Design Analyst","Tech Analyst"};
		DeleteMultiple(ToBeDeleted);
  }

@Test(priority =5)
public void UserAssignmentToGroup_CheckIfUsersAreDisplayed() throws InterruptedException
{
	String [] UsersToAssign= {"caparna","ndeepak","pvaidhya","pkaveri"};
	ToAssignUsersToGroup("Analyst",UsersToAssign);
}

@Test(priority =6)
public void UserUnAssignmentFromGroup_CheckIfusersAreUnassigned() throws InterruptedException
{
	String [] UsersToUnassign = {"pvaidhya","ndeepak"};
	UnassignUsersFromGroup("Analyst",UsersToUnassign);
	
}*/

@Test(priority =7)
public void DeleteAllUserInGroup_CheckIftheGroupIsActive() throws InterruptedException
{
	TocheckIfUsersOfGroupAreDeletedTheGroupIsActive("Analyst");
}
/*
@Test(priority =8)
public void DeleteRole_CheckIfTheGroupIsInactive()
{
		  
}

@Test(priority =9)
public void AddApplicationModuleRoleGroupAndDeleteModule_CheckIfTheGroupIsInactive()
{
		  
}

@Test(priority =10)
public void AddApplicationActionRoleGroupAndDeleteModule_CheckIfTheGroupIsInactive()
{
		  
}

@Test(priority =11)
public void DeleteApplication_CheckIfTheGroupIsInactive()
{
		  
}*/










  
  
  
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
		
		driver.get("http://192.168.10.15:7086");
		driver.navigate().to("http://caparna:Undertakerjohn@9@192.168.10.15:7086"); 
	}


  @AfterTest
	public void afterTest() {
		driver.quit();
	}


}
