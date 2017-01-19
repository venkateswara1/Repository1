package pack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.AfterMethod;

public class NewTest {
	
	//change1
	//change2
	//changes by preethi
	//changes by venkatesh
	//changes by preethi2
	//changes by preethi2
	//change by v
  @Test
  public void f() {
	  System.out.println("1kjhdsf");
	  
	  List<String> l1=new ArrayList<String>();
	  l1.add("aaa");
	  l1.add("bbb");
	  l1.add("ccc");
	  List<String> l2=new ArrayList<String>();
	  l2.add("aaa");
	  System.out.println(l1.contains(l2.get(0)));
	  System.out.println("Changes by Aparna");
  }
  
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
