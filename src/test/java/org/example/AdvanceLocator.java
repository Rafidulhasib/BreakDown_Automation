package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class AdvanceLocator extends BrowserSetup {
    @Test
    public void testPageLocator() throws InterruptedException {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");

        browser.findElement(By.cssSelector("input[value=\"radio2\"]")).click();
        Thread.sleep(1000);
        browser.findElement(By.xpath("//input[@value=\"radio3\"]")).click();
        Thread.sleep(1000);
        browser.findElement(By.cssSelector(("#checkBoxOption3"))).click();
        Thread.sleep(1000);
        browser.findElement(By.cssSelector((".radioButton"))).click();
        Thread.sleep(1000);
        String h1Text_CSS = browser.findElement(By.cssSelector("h1")).getText();
        System.out.println("Get by CSS Selector:"+h1Text_CSS);
        String h1Text_Xpath = browser.findElement(By.xpath("//h1")).getText();
        System.out.println("Get By Xpath Selector:"+h1Text_Xpath);

        browser.findElement((By.xpath("//*[@value=\"radio2\"]"))).click();
        Thread.sleep(1000);
        String text = (browser.findElement(By.cssSelector("div[id=\"checkbox-example\"] >fieldset>legend")).getText());
        System.out.println(text);
        text = browser.findElement(By.xpath("//div[@id=\"checkbox-example\"]/fieldset/legend")).getText();
        System.out.println(text);

        browser.findElement(By.cssSelector("input[name=\"radioButton\"][value=\"radio3\"]")).click();
        Thread.sleep(1000);
        browser.findElement(By.xpath("//input[@name=\"radioButton\"][@value=\"radio1\"]")).click();
        Thread.sleep(1000);

        browser.findElement(By.cssSelector("input[placeholder^=\"Enter \"]")).sendKeys("ore baba");
        Thread.sleep(1000);
        browser.findElement(By.xpath("//input[starts-with(@placeholder,\"Enter Your\")]")).sendKeys("  ki ekta obostha!");
        Thread.sleep(1000);
        browser.findElement(By.xpath("//input[contains(@placeholder,\"Your Name\")]")).sendKeys(" Abar ki ");
        Thread.sleep(1000);

        //table text
        String textTable = browser.findElement(By.xpath("//table[@name='courses']//tr/th[1]")).getText();
        System.out.println(textTable);
        textTable = browser.findElement(By.xpath("//table[@name='courses']//tr/th[last()]")).getText();
        System.out.println(textTable);
        textTable = browser.findElement(By.xpath("//table[@name='courses']//tr/th[2]")).getText();
        System.out.println(textTable);

        textTable = browser.findElement(By.cssSelector("table[name='courses']>tbody>tr>th:first-child")).getText();
        System.out.println(textTable);
        textTable = browser.findElement(By.cssSelector("table[name='courses']>tbody>tr>th:nth-child(2)")).getText();
        System.out.println(textTable);
        textTable = browser.findElement(By.cssSelector("table[name='courses']>tbody>tr>th:last-child")).getText();
        System.out.println(textTable);


        textTable = browser.findElement(By.xpath("//th[text()='Course'] / preceding-sibling::th")).getText();
        System.out.println(textTable);
        textTable = browser.findElement(By.xpath("//th[contains(text(),'Instructor')] /following-sibling::th[last()]")).getText();
        System.out.println(textTable);

        List<WebElement> tableData= (List<WebElement>) browser.findElements(By.xpath("//table[@name='courses']//td"));
        System.out.println(tableData.size());
        for (WebElement e: tableData) {
            System.out.println(e.getText());
        }
    }
}
