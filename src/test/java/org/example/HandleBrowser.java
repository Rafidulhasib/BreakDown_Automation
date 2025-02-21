package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class HandleBrowser {
    @Test
    public void workWithBrowser() throws InterruptedException {
        WebDriver  driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.manage().window().minimize();
        Thread.sleep(2000);
        driver.manage().window().fullscreen();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.bd-pratidin.com/");
        driver.close();
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        driver.quit();

    }

    @Test
    public void testWindowHandles() throws InterruptedException {
        WebDriver  driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.xpath("//*[text() ='Open Window']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text() ='Open Tab']")).click();
        Thread.sleep(2000);
        System.out.println(driver.getWindowHandle());

        List<String> Window_handles = new ArrayList<> (driver.getWindowHandles());
        for (String  handle : Window_handles) {
            System.out.println(handle);
        }

        driver.switchTo().window(Window_handles.get(1));
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println("******************************");

        driver.switchTo().window(Window_handles.get(2));
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());



        driver.quit();

    }


}
