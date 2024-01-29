package day9;

import org.testng.annotations.Test;

public class TC001_MultipleTest {
  @Test(priority=2)
  public void test1() {
	  System.out.println("This is test1");
  }
  
  @Test(groups= {"sanity"},priority=3)
  public void test2() {
	  System.out.println("This is test2");
  }
  
  @Test(groups= {"sanity"},priority=1)
  public void test3() {
	  System.out.println("This is test3");
  }
  
  @Test(priority=0)
  public void test4() {
	  System.out.println("This is test4");
  }
}
