package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
public class FirstTest {
    public static WebDriver driver;
    protected String URL;

    @Test
    public void Test(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\KAROL\\Desktop\\automaty\\crm-selenium\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();//delete capabilites
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.get("https://www.google.pl/");

    }

   /* @AfterMethod
    public void tearDown(){
        //driver.close();
        //driver.quit();
    }*/
}
