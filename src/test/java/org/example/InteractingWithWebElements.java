package org.example;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class InteractingWithWebElements extends BrowserSetup{

    @Test
    public void testElement() throws InterruptedException {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");

        getElement(By.xpath("(//input[@value='radio1'])[1]")).click();
        Thread.sleep(2000);
        getElement(By.xpath("(//input[@id='autocomplete'])[1]")).sendKeys("uri bab ba");
        Thread.sleep(2000);

        String OptionName = getElement(By.xpath("(//legend[normalize-space()='Switch To Alert Example'])[1]")).getText();
        System.out.println(OptionName);

        getElement(By.xpath("(//input[@id='autocomplete'])[1]")).clear();
        Thread.sleep(2000);

        String fontSize =  getElement(By.xpath("(//a[normalize-space()='Open Tab'])[1]")).getCssValue("background-color");
        System.out.println(fontSize);


        Boolean isSelect = getElement(By.xpath("(//input[@id='checkBoxOption2'])[1]")).isSelected();
        System.out.println(isSelect);

        browser.findElement(By.xpath("(//input[@id='checkBoxOption2'])[1]")).click();
        Thread.sleep(2000);
        isSelect = getElement(By.xpath("(//input[@id='checkBoxOption2'])[1]")).isSelected();
        System.out.println(isSelect);
        System.out.println("__________________________________");
        isSelect = getElement(By.xpath("(//input[@id='show-textbox'])[1]")).isSelected();
        System.out.println(isSelect);

        System.out.println("__________________________________");

        Boolean  isDisplay = displayStatus(By.xpath("(//input[@id='displayed-text'])[1]"));
        System.out.println(isDisplay);

        getElement(By.id("hide-textbox")).click();
        isDisplay =  displayStatus(By.xpath("(//input[@id='displayed-text'])[1]"));
        System.out.println(isDisplay);

        browser.get("https://www.google.com/");
        System.out.println("-----------------------------");
        Boolean isEnable = getElement (By.xpath("(//textarea[@id='APjFqb'])[1]")).isEnabled();
        System.out.println(isEnable);


    }

}
