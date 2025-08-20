package com.selenium.playground;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Test1 {
  @Test(groups = { "functest", "checkintest" })
  public void testTitlePageContent() {
    String url = "file:/home/hidekim/projects/personal_portafolio/selenium_training/training_web_page/src/main/index.html";
    System.setProperty("webdriver.chrome.driver", "/home/hidekim/Downloads/chromedriver-linux64/chromedriver");

    ChromeDriver driver = new ChromeDriver();

    driver.get(url);

    System.out.println(driver.getTitle());
    WebElement title = driver.findElement(By.xpath("//h1[@id='selenium-playground-0']"));

    String titleString =  title.getText();
    System.out.println(titleString);

    Assert.assertEquals(titleString, "Selenium playground");
  }

  @Test(groups = {"functest", "checkintest"} )
  public void testMethod2() {
  }

  @Test(groups = { "functest" })
  public void testMethod3() {
  }
}