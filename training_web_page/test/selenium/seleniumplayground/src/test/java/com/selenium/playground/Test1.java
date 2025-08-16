package com.selenium.playground;
import org.testng.annotations.Test;;

public class Test1 {
  @Test(groups = { "functest", "checkintest" })
  public void testMethod1() {
      assert 1 == 2;
  }

  @Test(groups = {"functest", "checkintest"} )
  public void testMethod2() {
  }

  @Test(groups = { "functest" })
  public void testMethod3() {
  }
}