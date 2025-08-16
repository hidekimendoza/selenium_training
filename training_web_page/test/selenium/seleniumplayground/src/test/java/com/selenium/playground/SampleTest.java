package com.selenium.playground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SampleTest {

    public static void main(String[] args) {
        /*
         * Creating CSS Selector using attributes 
         * syntax: TagName[Att1=Value]
         * In case Att 1 is 'id' or 'class'  then we can use following symbols:
         *      id => # (hash)
         *      class => . (dot)
         * ExampleL 1. div#u123 2. span.layerParent
         */
        System.setProperty("webdriver.chrome.driver", "/home/hidekim/Downloads/chromedriver-linux64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        System.out.println(driver.getTitle());

        driver.findElement(By.cssSelector("i.hm-icon"));

        // ^ => starts with $= => ends with *= => contains
        driver.findElement(By.cssSelector("input[data-testid$=il]."));

        // Get values for dynamic elements
        // Note in css we cannot use text

        // [][] => and [],[] => or 
        // Or example
        //input[value='Log in'], input[value='Sign in']
    }
}
