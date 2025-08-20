package com.selenium.playground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PlaygroundTest {

    @Test(groups = {"functest", "buttons"})
    public void testButtons(){

    }

    public static void main(String[] args) {
        String url = "file:/home/hidekim/projects/personal_portafolio/selenium_training/training_web_page/src/main/index.html";

        System.setProperty("webdriver.chrome.driver", "/home/hidekim/Downloads/chromedriver-linux64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get(url);
        System.out.println(driver.getTitle());

        driver.findElement(By.cssSelector("i.hm-icon"));

        // ^ => starts with $= => ends with *= => contains
        driver.findElement(By.cssSelector("input[data-testid$=il]."));
    }
}
