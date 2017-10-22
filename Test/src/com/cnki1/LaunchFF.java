package com.cnki1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

/**
 * @v Created by Administrator on 2017/8/26 0026.
 */
public class LaunchFF {
    /**
     *
     */
    @Test
    public void launchFireFox() {
        //double d = 20.0 ;
        System.setProperty("webdriver.chrome.driver", "E:\\工作\\自动化\\chromedriver.exe");
        WebDriver web = new ChromeDriver();
        web.get("http://www.baidu.com");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        web.findElement(By.id("kw")).sendKeys("test");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        web.quit();

    }

    /**
     *test
     */
    @Test
    public int testLan() {
        int a = 12;
        int b = 11;
        return a > b ? 1 : 2;

    }

}
