package com.automation.tests.day2;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) throws InterruptedException {

        //to start selenium script we need:
        //setup webdriver and vreate webdriver object

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // In selenium, everything starts from WebDriver interface
        driver.get("http://google.com"); // to open a website
        Thread.sleep(3000);
        
        
        String title = driver.getTitle(); // returns <title> some title </title>
        System.out.println("title = " + title);
        String expectedTitle = "Google";
        if(expectedTitle.equals(title)){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }

        driver.close();

    }
}



































