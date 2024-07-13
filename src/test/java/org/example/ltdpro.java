package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class  ltdpro extends BrowserSetup {
    @Test
    public void testpage() throws InterruptedException {

        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement autocompleteTextBox = browser.findElement(By.id("autocomplete"));
        autocompleteTextBox.sendKeys("Lal keno?");
        WebElement radiobtn = browser.findElement(By.className("radioButton"));
        radiobtn.click();
        WebElement option1 = browser.findElement(By.name("checkBoxOption1"));
        option1.click();
        WebElement title = browser. findElement(By.tagName("h1"));
        System.out.println(title.getText());
       // WebElement linkText = browser.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material"));
        //linkText.click();
       //WebElement partialLinktext = browser.findElement(By.partialLinkText("InterviewQues/ResumeAssistance/Material"));
       //partialLinktext.click();

    }
}
