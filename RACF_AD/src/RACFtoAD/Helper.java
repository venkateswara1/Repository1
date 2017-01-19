package RACFtoAD;


import java.io.File;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;





	public class Helper  {
		WebDriver driver;
		
		//Common data members
		String XpathGrid = "//*[@id='tblDataResult']/tbody/tr";
		String XpathSearchBox = "//*[@id='tblDataResult_filter']/label/input";
		String XpathDeleteSelected = "//*[@id='btnDeleteSelected']";
		//Xpath of all pages
		String XpathDashboard = "//*[@id='mainnav-menu']/li[1]/a/i";
		String XpathShowDropdown = "//*[@id='tblDataResult_length']/label/select";
		
		//Application
		String XpathAddApplictaion = "//*[@id='page-content']/div/div/div[1]/div[3]/div/div/button[2]/b";
		
	/*	String XpathApplicationManagement = "//*[@id='mainnav-menu']/li[3]/a/i";
		String XpathModuleManagement = "//*[@id='mainnav-menu']/li[4]/a/i";
		String XpathSubModuleManagement = "//*[@id='mainnav-menu']/li[5]/a/i";
		String XpathActionManagement = "//*[@id='mainnav-menu']/li[6]/a/i";
		String XpathRoleManagement = "//*[@id='mainnav-menu']/li[9]/a/i";
		String XpathRoleAssignment="//*[@id='mainnav-menu']/li[10]/a/i";
		String XpathUserManagement="//*[@id='mainnav-menu']/li[13]/a/i";
		String XpathReportManagement = "//*[@id='mainnav-menu']/li[14]/a/i";
		String XpathNotificationManagement = "//*[@id='mainnav-menu']/li[17]/a/i";
		String XpathSettingsPage = "//*[@id='mainnav-menu']/li[18]/a/i";*/
		
		
		
		//UserManagement related data members
		String XpathUserModule= "//*[@id='page-content']/div/div/div[1]/div/div[2]/div[2]/div[2]/div/div[1]/a/i";
		String XpathAddUserButton = "//*[@id='page-content']/div/div/div[1]/div[2]/div/div/button";
		String XpathUserGridDropdown = "//*[@id='tblDataResult_length']/label/select";
		String XpathYesButtonDeletePopUp = "//*[@class='bootstrap-dialog-footer-buttons']/button[1] ";
		String XpathNoButtonDeletePopUp = "//*[@class='bootstrap-dialog-footer-buttons']/button[2] ";
		
		String XpathUserNameTextBox = "//*[@id='UserName']";
		String XpathSearchButton = "//*[@id='btnCheck']/i";
		String XpathAddButton = "//*[@id='btnSave']";
		String XpathCancelButton ="//*[@id='frmUser']/div/div[3]/div/div[2]/input[2]";
		String XpathMessageDiv[] = {"//*[@id='page-content']/div/div/div[1]/div[1]","//*[@id='frmUser']/div/div[2]/div/div/div/div[2]/div/div[2]/div"};
		
		//Group Management related data members
		
		String XpathDashboardGroupManagement ="//*[@id='page-content']/div/div/div[1]/div/div[2]/div[2]/div[2]/div/div[2]/a/i" ;
		String XpathPulloutGroupManagement = "//*[@id='mainnav-menu']/li[14]/a";
		String XpathAddGroup= "//*[@id='page-content']/div/div/div[1]/div[3]/div/div/button[2]/b";
		String XPathGroupName = "//*[@id='GroupName']";
		String XPathGroupDescription = "//*[@id='GroupDescription']";
		String XpathSaveGroup = "//*[@id='btnSave']";
		String XpathEditIcon = "//*[@id='tblDataResult']/tbody/tr[1]/td[4]/span/a[1]/span/i";
		String XpathDeleteIcon = "//*[@id='tblDataResult']/tbody/tr[1]/td[4]/span/a[2]/span/i";
		String XpathUserAssignmentIcon = "//*[@id='tblDataResult']/tbody/tr[1]/td[4]/span/a[3]/span/i";
		String XpathUserAssignmentPopUpAllDropdown = "//*[@id='tblAssignUsersDataResult_length']/label/select";
		String XpathUsersGrid = "//*[@id='tblAssignUsersDataResult']/tbody/tr";
		String XpathSaveUsers = "//*[@id='btnSave']";
		String XpathAssignUserButton="//*[@id='page-content']/div/div/div[1]/div[5]/div/div/button[2]";
		String XpathUnassignUsersButton = "//*[@id='btnDeleteSelected']";
		String XpathUserAssignmentGroupAllDropdown = "//*[@id='tblDataResult_length']/label/select";
		String XpathAssignGroupSearchBox = "//*[@id='tblAssignUsersDataResult_filter']/label/input";
		String XpathCheckBox = "//*[@id='tblAssignUsersDataResult']/tbody/tr/td[1]/center/input";
		
		
		
		
		
		
	//	public String str;
		
		public void NavigateTo(String ScreenName) throws InterruptedException
		{
		String XpathApplicationManagement = "//*[@id='mainnav-menu']/li[3]/a/i";
		String XpathModuleManagement = "//*[@id='mainnav-menu']/li[4]/a/i";
		String XpathSubModuleManagement = "//*[@id='mainnav-menu']/li[5]/a/i";
		String XpathActionManagement = "//*[@id='mainnav-menu']/li[6]/a/i";
		String XpathRoleManagement = "//*[@id='mainnav-menu']/li[9]/a/i";
		String XpathRoleAssignment="//*[@id='mainnav-menu']/li[10]/a/i";
		String XpathGroupManagement="//*[@id='mainnav-menu']/li[10]/a/i";
		String XpathUserManagement="//*[@id='mainnav-menu']/li[9]/a";
		String XpathReportManagement = "//*[@id='mainnav-menu']/li[14]/a/i";
		String XpathNotificationManagement = "//*[@id='mainnav-menu']/li[17]/a/i";
		String XpathSettingsPage = "//*[@id='mainnav-menu']/li[18]/a/i";
		
		switch(ScreenName)
		{
		case "Application": CheckAvailability(CreateWebElement(XpathApplicationManagement, "Applictaion Management"), "Applictaion Management"); 
							ClickEvent(CreateWebElement(XpathApplicationManagement,"Applictaion Management"), "Applictaion Management");
							break;
		case "Module": 		CheckAvailability(CreateWebElement(XpathModuleManagement, "Module Management"), "Module Management"); 
							ClickEvent(CreateWebElement(XpathModuleManagement,"Module Management"), "Module Management");
							break;
		case "Sub-Module": 	CheckAvailability(CreateWebElement(XpathSubModuleManagement, "Sub Module Management"), "Sub Module Management"); 
							ClickEvent(CreateWebElement(XpathSubModuleManagement,"Sub Module Management"), "Sub Module Management");
							break;
		case "Action": 		CheckAvailability(CreateWebElement(XpathActionManagement, "Action Management"), "Action Management"); 
							ClickEvent(CreateWebElement(XpathActionManagement,"Action Management"), "Action Management");
							break;	
							
		case "Role": 		CheckAvailability(CreateWebElement(XpathRoleManagement, "Role Management"), "Role Management"); 
							ClickEvent(CreateWebElement(XpathRoleManagement, "Role Management"), "Role Management");
							break;
		
		case "Role-Assignment": CheckAvailability(CreateWebElement(XpathRoleAssignment, "Role Assignment"), "Role Assignment"); 
		ClickEvent(CreateWebElement(XpathRoleAssignment,"Role Assignment"), "Role Assignment");
		break;
		
		case "User": 	CheckAvailability(CreateWebElement(XpathUserManagement, "User Management"), "User Management"); 
		ClickEvent(CreateWebElement(XpathUserManagement, "User Management"), "User Management");
		break;
		
		case "Group": 	CheckAvailability(CreateWebElement(XpathGroupManagement, "Group Management"), " Group Management"); 
		ClickEvent(CreateWebElement(XpathGroupManagement,"Group Management"), " Group Management");
		break;
		
		case "Report": 	CheckAvailability(CreateWebElement(XpathReportManagement, "Report Management"), "Report Management"); 
		ClickEvent(CreateWebElement(XpathReportManagement,"Report Management"), "Report Management");
		break;
		
		case "Notification": 	CheckAvailability(CreateWebElement(XpathNotificationManagement, "Notification"), "Notification"); 
		ClickEvent(CreateWebElement(XpathNotificationManagement, "Notification"), "Notification");
		break;
		
		case "Settings": 	CheckAvailability(CreateWebElement(XpathSettingsPage, "Settings"), "Settings"); 
		ClickEvent(CreateWebElement(XpathSubModuleManagement, "Settings"), "Settings");
		break;
		
		default: System.out.println("Enter correct screenname");
		}
		}
		
		
		
	    public void screenshot(String str) throws Exception{
			
	    	DateFormat df=new SimpleDateFormat("yyyy-MMM-dd hh-mm-ss a");
	    	Date d=new Date();
	    	String time=df.format(d);
			File F = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(F, new File("F:\\Widget\\Workspace\\RACF_AD"+str+time+".png"));
			
		}
	    //To check the availability of element
	    public void CheckAvailability(WebElement Element, String FieldName)
	    {
	    	 System.out.println("In Helper class Check Availability");
	    	if (Element.isDisplayed())
	    	{
	    		System.out.println(FieldName+ "is available");
	    	}
	    	
	    	else
	    		Assert.fail(FieldName+ "is not available");
	     }
	    
	    
	    public void ClickEvent(WebElement Element,String FieldName)
	    {
	    	System.out.println("In Helper class create web element");
	    	if(Element.isEnabled())
	    	{
	    		System.out.println(FieldName+ "is enabled so click can be performed");
	    		Element.click();
	    	}
	    	else
	    		Assert.fail(FieldName+ "is not enabled");
	    	
	    }
	    
	   public WebElement CreateWebElement(String Xpath,String FieldName)
	   {
		   WebElement FieldName1= driver.findElement(By.xpath(Xpath));
		   return FieldName1;
	   }
	    
	   public void EnterText(String Xpath,String Text,String FieldName)
	   {
		   System.out.println("In Helper class Enter Text");
		   System.out.println(Xpath +Text +FieldName);
		   
		   try
		   {
			   driver.findElement(By.xpath(Xpath)).sendKeys(Text);
		   }
		   catch(Exception e)
		   {
			   System.out.println(FieldName +"is not present");
		   }
		   
	   }
	   
	   public String GetText(String Xpath)
	   {
		   return driver.findElement(By.xpath(Xpath)).getText();
	   }
	   public void SelectDropdown(String Xpath,String ValueToSelect)
	   {	
		   System.out.println("Inside Select method");
		   Select SelectValue = new Select(driver.findElement(By.xpath(Xpath)));
		   SelectValue.selectByVisibleText(ValueToSelect);
	   }
	   
	   public int ToFindRows(String XpathGrid)
	   {
		 return driver.findElements(By.xpath(XpathGrid)).size();
	   }
	   
	   // TODO USER MANAGEMENT
	   //To Add user
	   public void Add( String UserName) throws InterruptedException
	   {	
		   try{
		   
		   CheckAvailability(CreateWebElement(XpathAddUserButton, "Add User"), "Add User");
		   ClickEvent(CreateWebElement(XpathAddUserButton, "Add User"), "Add User");
		   Thread.sleep(2000);
		   
		   CheckAvailability(CreateWebElement(XpathUserNameTextBox, "User name text box"), "User name text box");
		   EnterText(XpathUserNameTextBox, UserName, "User name");
		   Thread.sleep(3000);
		   
		   CheckAvailability(CreateWebElement(XpathSearchButton, "Search button"), "Search button");
		   ClickEvent(CreateWebElement(XpathSearchButton, "Search button"), "Search button");
		   Thread.sleep(3000);
		   
		   CheckAvailability(CreateWebElement(XpathAddButton, "Save User"), "Save User");
		   ClickEvent(CreateWebElement(XpathAddButton, "Save User"), "Save User");
		   Thread.sleep(3000);
		   
		   int i=0;
		   CheckAvailability(CreateWebElement(XpathMessageDiv[i], "Message div"), "Message div");
		   System.out.println(GetText(XpathMessageDiv[i]));
		   
		   }
		   
		   catch(Exception e)
		   {
			int i=1;  
			CheckAvailability(CreateWebElement(XpathMessageDiv[i], "Message div"), "Message div");
			System.out.println(GetText(XpathMessageDiv[i]));
			   
			CheckAvailability(CreateWebElement(XpathCancelButton, "Cancel Button"),"Cancel Button");
			ClickEvent(CreateWebElement(XpathCancelButton, "Cancel Button"),"Cancel Button");
			
			
			
		   }
		   
	   }
	   
	   
/*	   //TO add user without using search button
	   public void Add(String XpathAddUserButton,String XpathUserNameTextBox, String UserName,String AddButton) throws InterruptedException
	   {	
		   System.out.println("In Helper class add2");
		   CheckAvailability(CreateWebElement(XpathAddUserButton, "Add User"), "Add User");
		   ClickEvent(CreateWebElement(XpathAddUserButton, "Add User"), "Add User");
		   Thread.sleep(3000);
		   
		   CheckAvailability(CreateWebElement(XpathUserNameTextBox, "User name text box"), "User name text box");
		   EnterText(XpathUserNameTextBox, UserName, "User name");
		   Thread.sleep(3000);
		   
		   CheckAvailability(CreateWebElement(AddButton, "Save User"), "Save User");
		   ClickEvent(CreateWebElement(AddButton, "Save User"), "Save User");
		   Thread.sleep(3000);
		    
	   }*/
	/*   //To add application
	   public void Add_Application(String XpathAddApplication,String XpathApplicationName,String ApplicationName, String XpathApplicationDescription,String ApplicationDescription, String XpathBusinessUnit, String BusinessUnit,String XpathAdd) throws InterruptedException
	   {
		   CheckAvailability(CreateWebElement(XpathAddApplication, "Add Application Button"), "Add Application Button");
		   ClickEvent(CreateWebElement(XpathAddApplication,  "Add Application Button"), "Add Application Button");
		   Thread.sleep(3000);
		   
		   CheckAvailability(CreateWebElement(XpathApplicationName, "Application Name"), "Application Name");
		   EnterText(XpathApplicationName, ApplicationName,"Application Name");
		   Thread.sleep(3000);
		   
		   CheckAvailability(CreateWebElement(XpathApplicationDescription, "Description"), "Description");
		   EnterText(XpathApplicationDescription, ApplicationDescription,"Application Description");
		   Thread.sleep(3000);
		   
		   CheckAvailability(CreateWebElement(XpathBusinessUnit, "Business Unit"), "Business Unit");
		   EnterText(XpathBusinessUnit, BusinessUnit,"Business Unit");
		   Thread.sleep(3000);
		   
		   CheckAvailability(CreateWebElement(XpathAdd, "Add Button"), "Add Button");
		   ClickEvent(CreateWebElement(XpathAdd, "AddButton"), "AddButton");
		   Thread.sleep(3000);
		   
	   }
	   //To add module/action
	   public void Add(String XpathAdd, String ApplicationName,String XpathApplicationDropdown,String XpathName, String Name,String XpathDesc,String Desc, String XpathAddButton) throws InterruptedException
	   {	
		   CheckAvailability(CreateWebElement(XpathApplicationDropdown, "App dropdown"), "App dropdown");
		   SelectDropdown(XpathApplicationDropdown, ApplicationName);
		   Thread.sleep(2000);
		   
		   CheckAvailability(CreateWebElement(XpathAdd, "Add Application Button"), "Add Application Button");
		   ClickEvent(CreateWebElement(XpathAdd,  "Add Application Button"), "Add Application Button");
		   Thread.sleep(2000);
		   
		   CheckAvailability(CreateWebElement(XpathAdd, "Add button"), "Add button");
		   ClickEvent(CreateWebElement(XpathAdd, "Add button"), "Add button");
		   Thread.sleep(6000);
		   
		   CheckAvailability(CreateWebElement(XpathName, "Name"), "Name");
		   EnterText(XpathName, Name, "Name");
		   Thread.sleep(3000);
		   
		   CheckAvailability(CreateWebElement(XpathDesc, "Description"), "Description");
		   EnterText(XpathDesc, Desc, "Description");
		   Thread.sleep(3000);
		   
		   CheckAvailability(CreateWebElement(XpathAddButton, "save Button"), "Save button");
		   ClickEvent(CreateWebElement(XpathAddButton, "save Button"), "Save button");
		   Thread.sleep(3000);
	   }
	   //To add sub module
	   public void Add(String XpathAdd,String ApplicationName,String XpathApplicationDropdown,String ModuleName,String XpathModuleDropdown,String XpathName,String Name,String XpathDesc,String Desc, String XpathAddButton) throws InterruptedException
	   {
		   CheckAvailability(CreateWebElement(XpathAdd, "Add Application Button"), "Add Application Button");
		   ClickEvent(CreateWebElement(XpathAdd,  "Add Application Button"), "Add Application Button");
		   Thread.sleep(2000);
		   
		   CheckAvailability(CreateWebElement(XpathApplicationDropdown, "Applictaion Dropdown"), "Applictaion Dropdown");
		   SelectDropdown(XpathApplicationDropdown, ApplicationName);
		   Thread.sleep(2000);
		   
		   CheckAvailability(CreateWebElement(XpathModuleDropdown, "Mod Name"), "Mod Name");
		   SelectDropdown(XpathModuleDropdown, ModuleName);
		   Thread.sleep(2000);
		   
		   CheckAvailability(CreateWebElement(XpathName, "Name"), "Name");
		   EnterText(XpathName, Name, "Name");
		   Thread.sleep(2000);
		   
		   CheckAvailability(CreateWebElement(XpathDesc, "Description"), "Description");
		   EnterText(XpathDesc, Desc, "Description");
		   Thread.sleep(2000);
		   
		   CheckAvailability(CreateWebElement(XpathAddButton, "Add Button"), "Add Button");
		   ClickEvent(CreateWebElement(XpathAddButton, "Add Button"), "Add Button");
		   Thread.sleep(3000);
		   
		   
	   }*/
	   //to add category name
	 
	   
	 //*[@id="tblDataResult"]/tbody/tr[5]/td[5]/span/a[2]/span/i
	   
	   
	public void deleteuser(String Name) throws InterruptedException
	   {	
			NavigateTo("User");
		  int RowNo = ToFindRows(XpathGrid);
		  EnterText(XpathSearchBox, Name, "Search Box");
		  
		  for(int i=1;i<=RowNo;i++)
		  {
			  for(int j=1;j<=2;j++)
			  {
				  String XpathInIteration = XpathGrid + "["+i+"]/td["+j+"]";
				  System.out.println(XpathInIteration);
				  
				  if(new String(GetText(XpathInIteration)).equals(Name))
				  {
					  int aValue = 2,tdValue=6;
					  String XpathDelete = XpathGrid + "["+i+"]/td["+tdValue+"]"+"/span/a["+aValue+"]";
					  System.out.println("In if loop"+XpathDelete);
					  CheckAvailability(CreateWebElement(XpathDelete, "Delete Button"), "Delete Button");
					  ClickEvent(CreateWebElement(XpathDelete, "Delete Button"), "Delete Button");
					  Thread.sleep(3000);
					  CheckAvailability(CreateWebElement(XpathYesButtonDeletePopUp, "Yes Button"), "Yes Button");
					  ClickEvent(CreateWebElement(XpathYesButtonDeletePopUp,"Yes Button"), "Yes Button");
					  Thread.sleep(5000);
					 
				  }
				  
			  }
		  }
		   
	   }

	

	   
   public void DeleteMultiple(String [] EntitiesToBeDeleted) throws InterruptedException
	   {	
		   SelectDropdown(XpathShowDropdown, "All");
		   int NoofEntitiesToBeDeleted = EntitiesToBeDeleted.length;
		   for(int i=0;i<NoofEntitiesToBeDeleted;i++)
		   {
			   String Name = EntitiesToBeDeleted[i];
			//   driver.findElement(By.xpath(XpathSearchBox)).clear();
			 //  EnterText(XpathSearchBox, Name, "Search Box");
			   int RowNo = ToFindRows(XpathGrid);
			   for(int k=1;k<=RowNo;k++)
				  {
					  	int j=2;
						  String XpathInIteration = XpathGrid + "["+k+"]/td["+j+"]";
						  System.out.println(XpathInIteration);
						  Thread.sleep(3000);
						  String StringToCompare = GetText(XpathInIteration);
						  if(new String(StringToCompare).equals(Name))
						  {
							  int tdValue=1;
							  String XpathCheckBox = XpathGrid +"["+k+"]/td["+tdValue+"]/center/input";
							  System.out.println(XpathCheckBox);
							  
							  CheckAvailability(CreateWebElement(XpathCheckBox, "Checkbox"), "Checkbox");
							  ClickEvent(CreateWebElement(XpathCheckBox, "Checkbox"), "Checkbox");
							  Thread.sleep(3000);
							  
							  break;
						 }
					  }
		   
	   }
		   	  CheckAvailability(CreateWebElement(XpathDeleteSelected, "Delete Selected"), "Checkbox");
			  ClickEvent(CreateWebElement(XpathDeleteSelected, "Delete Selected"), "Delete Selected");
			  Thread.sleep(3000);
		   
			  CheckAvailability(CreateWebElement(XpathYesButtonDeletePopUp, "Yes Button"), "Yes Button");
			  ClickEvent(CreateWebElement(XpathYesButtonDeletePopUp,"Yes Button"), "Yes Button");
			  Thread.sleep(5000);
	}	
   
   //TODO GROUPMANAGEMENT
   
   //To add new group 
   
   public void AddGroup(String GroupName,String GroupDesc) throws InterruptedException
   {
	  NavigateTo("Group");
	//   Thread.sleep(2000);
	   
	   CheckAvailability(CreateWebElement(XpathAddGroup, "Add Group"), "Add Group");
	   ClickEvent(CreateWebElement(XpathAddGroup, "Add Group"), "Add Group");
	   Thread.sleep(1000);
	   
	   CheckAvailability(CreateWebElement(XPathGroupName, "Group Name"), "Group Name");
	   EnterText(XPathGroupName, GroupName, "Group Name");
	   Thread.sleep(1000);
	   
	   CheckAvailability(CreateWebElement(XPathGroupDescription, "Group Desc"), "Group Desc");
	   EnterText(XPathGroupDescription, GroupDesc, "Group Desc");
	   Thread.sleep(1000);
	   
	   CheckAvailability(CreateWebElement(XpathSaveGroup, "SAve Group"), "SAve Group");
	   ClickEvent(CreateWebElement(XpathSaveGroup, "Save Group"), "Save Group");
	   Thread.sleep(3000);
   }
   
   public void EditGroup(String GroupName, String NewDescription) throws InterruptedException
   {
	   NavigateTo("Group");
	   Thread.sleep(2000);
	   
	   try
	   {
	   SelectDropdown(XpathShowDropdown, "All");
	   EnterText(XpathSearchBox, GroupName, "Search Box");
	   
	   CheckAvailability(CreateWebElement(XpathEditIcon, "Edit Group"), "Edit Group");
	   ClickEvent(CreateWebElement(XpathEditIcon, "Edit Group"), "Edit Group");
	   Thread.sleep(2000);
	   	   
	  
		  CheckAvailability(CreateWebElement(XPathGroupDescription, "Group Desc"), "Group Desc");
		  CreateWebElement(XPathGroupDescription, "Group desc").clear();
		  EnterText(XPathGroupDescription, NewDescription, "Group desc");
		  Thread.sleep(2000);
		  
		  CheckAvailability(CreateWebElement(XpathSaveGroup, "Save Group"), "Save Group");
		  ClickEvent(CreateWebElement(XpathSaveGroup, "Save Group"), "Save Group");
		  Thread.sleep(2000);
	
	  }
	   catch(Exception e)
	   {
		   System.out.println("No such element found.");
	   }
   }
   
   public void deletegroup(String Name) throws InterruptedException
   {	
	  int RowNo = ToFindRows(XpathGrid);
	  EnterText(XpathSearchBox, Name, "Search Box");
	  
	  for(int i=1;i<=RowNo;i++)
	  {
		  for(int j=1;j<=2;j++)
		  {
			  String XpathInIteration = XpathGrid + "["+i+"]/td["+j+"]";
			  System.out.println(XpathInIteration);
			  
			  if(new String(GetText(XpathInIteration)).equals(Name))
			  {
				  int aValue = 2,tdValue=4;
				  String XpathDelete = XpathGrid + "["+i+"]/td["+tdValue+"]"+"/span/a["+aValue+"]";
				  System.out.println("In if loop"+XpathDelete);
				  CheckAvailability(CreateWebElement(XpathDelete, "Delete Button"), "Delete Button");
				  ClickEvent(CreateWebElement(XpathDelete, "Delete Button"), "Delete Button");
				  Thread.sleep(3000);
				  CheckAvailability(CreateWebElement(XpathYesButtonDeletePopUp, "Yes Button"), "Yes Button");
				  ClickEvent(CreateWebElement(XpathYesButtonDeletePopUp,"Yes Button"), "Yes Button");
				  Thread.sleep(5000);
				
			  }
			  
		  }
	  }
	   
   }
   
  
   
   //TODO GROUP - ROLEASSIGNMENT
   //To assign the users to the group
  /* public void AssignUsersToGroup(String GroupName,String [] ListOfUsers) throws InterruptedException
   {
	   NavigateTo("Group");
	   Thread.sleep(2000);
	   int NoOfUsers = ListOfUsers.length;
	   
	   try
	   {
	   SelectDropdown(XpathShowDropdown, "All");
	   CheckAvailability(CreateWebElement(XpathSearchBox, "Search Box"), "Search Box");
	   EnterText(XpathSearchBox, GroupName, "Search Box");
	   
	   CheckAvailability(CreateWebElement(XpathUserAssignmentIcon, "UserAssignmentIcon"),"UserAssignmentIcon");
	   ClickEvent(CreateWebElement(XpathUserAssignmentIcon, "UserAssignmentIcon"),"UserAssignmentIcon");
	   Thread.sleep(2000);
	   
	   CheckAvailability(CreateWebElement(XpathAssignUserButton, "Assign User Button"), "Assign User Button");
	   ClickEvent(CreateWebElement(XpathAssignUserButton, "Assign User Button"), "Assign User Button");
	   Thread.sleep(5000);
	   
	   
	   CheckAvailability(CreateWebElement(XpathUserAssignmentPopUpAllDropdown, "All dropdown value"),"All dropdown value");
	   SelectDropdown(XpathUserAssignmentPopUpAllDropdown, "All");
	   
	   
	   for(int i=0;i<NoOfUsers;i++)
	   {
		   String Name = ListOfUsers[i];
		   int RowNo = ToFindRows(XpathUsersGrid);
		   System.out.println("Row Nos "+RowNo);
		   
		   for(int k=1;k<=RowNo;k++)
			  {
				  	int j=2;
					  String XpathInIteration = XpathUsersGrid + "["+k+"]/td["+j+"]";
					
					  System.out.println(XpathInIteration);
					//  Thread.sleep(1000);
					  String StringToCompare = GetText(XpathInIteration);
					  if(new String(StringToCompare).equals(Name))
					  {
						  int tdValue=1;
						  String XpathCheckBox = XpathUsersGrid +"["+k+"]/td["+tdValue+"]/center/input";
						  System.out.println(XpathCheckBox);
						  
						  CheckAvailability(CreateWebElement(XpathCheckBox, "Checkbox"), "Checkbox");
						  ClickEvent(CreateWebElement(XpathCheckBox, "Checkbox"), "Checkbox");
						  break;
					 
					 }
				  	
				  }
		  
	   }
	   CheckAvailability(CreateWebElement(XpathSaveUsers, "Save button in assign user pop up"), "Save button in assign user pop up");
	   ClickEvent(CreateWebElement(XpathSaveUsers, "Save button in assign user pop up"), "Save button in assign user pop up");
	  
	   }
	   catch(Exception e)
	   {
		   System.out.println(e);
	   }
   }*/
   
  public void ToAssignUsersToGroup(String GroupName, String [] ListOfUsers) throws InterruptedException
   {
	   NavigateTo("Group");
	   Thread.sleep(2000);
	   int NoOfUsers = ListOfUsers.length;
	   
	   try
	   {
	   SelectDropdown(XpathShowDropdown, "All");
	   CheckAvailability(CreateWebElement(XpathSearchBox, "Search Box"), "Search Box");
	   EnterText(XpathSearchBox, GroupName, "Search Box");
	   
	   CheckAvailability(CreateWebElement(XpathUserAssignmentIcon, "UserAssignmentIcon"),"UserAssignmentIcon");
	   ClickEvent(CreateWebElement(XpathUserAssignmentIcon, "UserAssignmentIcon"),"UserAssignmentIcon");
	   Thread.sleep(2000);
	   
	   for(int i=0;i<NoOfUsers;i++)
	   {
		   String Name = ListOfUsers[i];
		   
		   CheckAvailability(CreateWebElement(XpathAssignUserButton, "Assign Users Button"), "Assign Users Button");
		   ClickEvent(CreateWebElement(XpathAssignUserButton, "Assign Users Button"), "Assign Users Button");
		   
		   CheckAvailability(CreateWebElement(XpathAssignGroupSearchBox, "Search Box"), "Search Box");
		   EnterText(XpathAssignGroupSearchBox, Name, "Search Box");
		   
		   CheckAvailability(CreateWebElement(XpathCheckBox, "Check Box"), "Check Box");
		   ClickEvent(CreateWebElement(XpathCheckBox, "Check Box"), "Check Box");
		   
		   CheckAvailability(CreateWebElement(XpathSaveUsers, "Save button in assign user pop up"), "Save button in assign user pop up");
		   ClickEvent(CreateWebElement(XpathSaveUsers, "Save button in assign user pop up"), "Save button in assign user pop up");
	   }
	     
	   
	   }
	   catch (Exception e)
	   {
		   System.out.println(e);
	   }
	   
	   
	   
   }
   
   //TO unassign the users from the group
   
 /*  public void UnassignUsersFromGroup(String GroupName,String [] ListOfUsers) throws InterruptedException
   {
	   NavigateTo("Group");
	   Thread.sleep(2000);
	   int NoOfUsers = ListOfUsers.length;
	   
	   try
	   {
	   SelectDropdown(XpathShowDropdown, "All");
	   CheckAvailability(CreateWebElement(XpathSearchBox, "Search Box"), "Search Box");
	   EnterText(XpathSearchBox, GroupName, "Search Box");
	   
	   CheckAvailability(CreateWebElement(XpathUserAssignmentIcon, "UserAssignmentIcon"),"UserAssignmentIcon");
	   ClickEvent(CreateWebElement(XpathUserAssignmentIcon, "UserAssignmentIcon"),"UserAssignmentIcon");
	   Thread.sleep(2000);
	   
	  
	   
	   
	   CheckAvailability(CreateWebElement(XpathUserAssignmentGroupAllDropdown, "All dropdown value"),"All dropdown value");
	   SelectDropdown(XpathUserAssignmentGroupAllDropdown, "All");
	   
	   for(int i=0;i<NoOfUsers;i++)
	   {
		   String Name = ListOfUsers[i];
		   int RowNo = ToFindRows(XpathUsersGrid);
		 
		   
		   for(int k=1;k<=RowNo;k++)
			  {
				  	int j=5;
				  
					  String XpathInIteration = XpathUsersGrid + "["+k+"]/td["+j+"]";
					
					  System.out.println(XpathInIteration);
					  Thread.sleep(3000);
					  String StringToCompare = GetText(XpathInIteration);
					  if(new String(StringToCompare).equals(Name))
					  {
						  int tdValue=1;
						  String XpathCheckBox = XpathGrid +"["+k+"]/td["+tdValue+"]/center/input";
						  System.out.println(XpathCheckBox);
						  
						  CheckAvailability(CreateWebElement(XpathCheckBox, "Checkbox"), "Checkbox");
						  ClickEvent(CreateWebElement(XpathCheckBox, "Checkbox"), "Checkbox");
						  Thread.sleep(3000);
						  
						  break;
					 }
				  
			  }
		    CheckAvailability(CreateWebElement(XpathUnassignUsersButton, "unassign User Button"), "unassign User Button");
		   ClickEvent(CreateWebElement(XpathUnassignUsersButton, "unassign User Button"), "unassign User Button");
		   
		   CheckAvailability(CreateWebElement(XpathYesButtonDeletePopUp, "Yes Button"), "Yes Button");
		   ClickEvent(CreateWebElement(XpathYesButtonDeletePopUp, "Yes Button"), "Yes Button");
		   
	   }
	   
	  
	   
	   }
	   catch(Exception e)
	   {
		   System.out.println(e);
	   }
   }*/
  
//TO unassign the users from the group
  
   public void UnassignUsersFromGroup(String GroupName,String [] ListOfUsers) throws InterruptedException
   {
	   NavigateTo("Group");
	   Thread.sleep(2000);
	   int NoOfUsers = ListOfUsers.length;
	   
	   try
	   {
	   SelectDropdown(XpathShowDropdown, "All");
	   CheckAvailability(CreateWebElement(XpathSearchBox, "Search Box"), "Search Box");
	   EnterText(XpathSearchBox, GroupName, "Search Box");
	   
	   CheckAvailability(CreateWebElement(XpathUserAssignmentIcon, "UserAssignmentIcon"),"UserAssignmentIcon");
	   ClickEvent(CreateWebElement(XpathUserAssignmentIcon, "UserAssignmentIcon"),"UserAssignmentIcon");
	   Thread.sleep(2000);
	   
	   CheckAvailability(CreateWebElement(XpathShowDropdown,"Dropdown All select"),"Dropdown All select");
	   SelectDropdown(XpathShowDropdown,"All");
	   
	/*   for(int i=0;i<NoOfUsers;i++)
	   {
		   String Name = ListOfUsers[i];
		   int RowNo = ToFindRows(XpathGrid);
		
		   for(int k=1;k<=RowNo;k++)
			  {
				  	int j=5;
				  
					  String XpathInIteration = XpathGrid + "["+k+"]/td["+j+"]";
					
					  System.out.println(XpathInIteration);
					  Thread.sleep(3000);
					  String StringToCompare = GetText(XpathInIteration);
					  if(new String(StringToCompare).equals(Name))
					  {
						  int tdValue=1;
						  String XpathCheckBox = XpathGrid +"["+k+"]/td["+tdValue+"]/center/input";
						  System.out.println(XpathCheckBox);
						  
						  CheckAvailability(CreateWebElement(XpathCheckBox, "Checkbox"), "Checkbox");
						  ClickEvent(CreateWebElement(XpathCheckBox, "Checkbox"), "Checkbox");
						  Thread.sleep(3000);
						  
						  break;
					 }
				  
			  }
		    CheckAvailability(CreateWebElement(XpathUnassignUsersButton, "unassign User Button"), "unassign User Button");
		   ClickEvent(CreateWebElement(XpathUnassignUsersButton, "unassign User Button"), "unassign User Button");
		   
		   CheckAvailability(CreateWebElement(XpathYesButtonDeletePopUp, "Yes Button"), "Yes Button");
		   ClickEvent(CreateWebElement(XpathYesButtonDeletePopUp, "Yes Button"), "Yes Button");
		   
	   }*/
   }
   catch(Exception e)
	   {
	   	System.out.println(e);
	   }
	   }
   
   public void TocheckIfUsersOfGroupAreDeletedTheGroupIsActive(String GroupName) throws InterruptedException
   {
	   try
	   {
	   NavigateTo("Group");
	   
	   SelectDropdown(XpathShowDropdown, "All");
	   CheckAvailability(CreateWebElement(XpathSearchBox, "Search Box"), "Search Box");
	   EnterText(XpathSearchBox, GroupName, "Search Box");
	   
	   String XpathMessage ="//*[@id='page-content']/div/div/div[1]/div[6]";
	   String ActualMessage =GetText(XpathMessage);
	   String ExpectedMessage = "There are no User Groups available.";
	   
	   int RowNo = ToFindRows(XpathGrid);
	   System.out.println(RowNo);
	   
	   if(RowNo>0)
	   {
	   
	   for(int i=1;i<=RowNo;i++)
	   {
		   int tdValue = 2;
		   String XpathGroupName = XpathGrid+"["+i+"]/td["+tdValue+"]";
		   if(new String(GetText(XpathGroupName)).equals(GroupName))
		   {
			   tdValue = 4;
			   String XpathUserAssignIcon = XpathGrid+"["+i+"]/td["+tdValue+"]/span/a[3]/span/i";
			   CheckAvailability(CreateWebElement(XpathUserAssignIcon, "User Assignment Icon"), "User Assignment Icon");
			   ClickEvent(CreateWebElement(XpathUserAssignIcon, "User Assignment Icon"), "User Assignment Icon");
		   }
		   
		   CheckAvailability(CreateWebElement(XpathShowDropdown, "Dropdown Show"), "Dropdown Show");
			  SelectDropdown(XpathShowDropdown, "All");
			  
			  int NoOfUsers = ToFindRows(XpathGrid);
			  System.out.println(NoOfUsers);
			  String [] UsersAssigned = new String [NoOfUsers];
			  
			  for(int j=0;j<NoOfUsers;j++)
			  {
				   tdValue = 5;
				  
				  String XpathUserName = XpathGrid+"["+(j+1)+"]/td["+tdValue+"]";
				  UsersAssigned[j]= GetText(XpathUserName);
				  	  
				  deleteuser(UsersAssigned[j]);
				  
				}
			  NavigateTo("Group");
		   
	   }
	   
	  
	  
	  
	  Assert.assertEquals(ActualMessage,ExpectedMessage);
	   }
	   else
	   {
		   Assert.assertEquals(ActualMessage,ExpectedMessage);
	   }
   }   
	   
	   catch(Exception e)
	   {
		   System.out.println(e);
	   } 
	   
   
   
   }
   
   //Datamembers for Application module
   String AppNameTextBoxId="//*[@id='ApplicationName']";
   String AppDescrTextBoxId = "//*[@id='ApplicationDescription']";
   String BusinessUnitTextBoxId="//*[@id='BusinessUnit']";
   String XpathSaveButton = "//*[@id='btnSave']";
   public void AddApplication(String ApplicationName, String AppDescription, String BusinessUnit) throws InterruptedException
   {
	   NavigateTo("Application");
	   
	   CheckAvailability(CreateWebElement(XpathAddApplictaion, "App Name"), "App Name");
	   ClickEvent(CreateWebElement(XpathAddApplictaion, "App Name"), "App Name");
	   
	   EnterText(AppNameTextBoxId, ApplicationName, "AppName");
	   EnterText(AppDescrTextBoxId, AppDescription, "App Descr");
	   EnterText(BusinessUnitTextBoxId,BusinessUnit,"BU");
	   
	   ClickEvent(CreateWebElement(XpathSaveButton,"Save"),"Save");
   }
   
   //Data Members for  Module
   
   String XpathApplicationDropdown ="//*[@id='selAppForModuleList']";
   String XpathAddModuleButton="//*[@id='page-content']/div/div/div[1]/div[4]/div/div/button[2]";
   String XpathModuleNameTextBox = "//*[@id='ModuleName']";
   String XpathModuleDesc = "//*[@id='ModuleDescription']";
 
   public void AddModule(String ApplicationName, String ModuleName, String ModuleDescription) throws InterruptedException
   {
	   NavigateTo("Module");
	   SelectDropdown(XpathApplicationDropdown, ApplicationName);
	   
	   ClickEvent(CreateWebElement(XpathAddModuleButton, "Add Mod"), "Add Mod");
	   EnterText(XpathModuleNameTextBox, ModuleName, "Mod Name");
	   EnterText(XpathModuleDesc, ModuleDescription, "Mod Descr");
	   
	   ClickEvent(CreateWebElement(XpathSaveButton,"Save"),"Save");
   }
   
   public void AddSubModule(String ApplicationName, String ModuleName,String SubmoduleName, String SubModuleDescription) throws InterruptedException
   {
	   NavigateTo("Sub-Module");
	   SelectDropdown(XpathApplicationDropdown, ApplicationName);
	   
	   
	   ClickEvent(CreateWebElement(XpathAddModuleButton, "Add Mod"), "Add Mod");
	   EnterText(XpathModuleNameTextBox, ModuleName, "Mod Name");
	   EnterText(XpathModuleDesc, SubModuleDescription, "Mod Descr");
	   
	   ClickEvent(CreateWebElement(XpathSaveButton,"Save"),"Save");
   }
   
  }
	
	
	//*[@id="tblDataResult"]/tbody/tr[1]/td[4]/span/a[3]/span/i
	   





	
	
	