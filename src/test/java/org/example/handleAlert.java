package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class handleAlert extends BrowserSetup {

    @Test
    public void test_Alert() throws InterruptedException {
        browser.get("https://the-internet.herokuapp.com/javascript_alerts");

        clickOnElement(By.xpath("(//button[normalize-space()='Click for JS Alert'])[1]"));
        Thread.sleep(2000);
        Alert alert = browser.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        Thread.sleep(2000);
        clickOnElement(By.xpath("(//button[normalize-space()='Click for JS Confirm'])[1]"));
        alert = browser.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        System.out.println(getElement(By.xpath("(//p[@id='result'])[1]")).getText());

        clickOnElement(By.xpath("(//button[normalize-space()='Click for JS Prompt'])[1]"));
        alert = browser.switchTo().alert();
        System.out.println(alert.getText());
        alert.sendKeys("ki korbo");
        alert.accept();
        System.out.println(getElement(By.xpath("(//p[@id='result'])[1]")).getText());



    }
}
