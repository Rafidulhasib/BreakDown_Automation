package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandleAction extends BrowserSetup{
    @Test
    public void testHandleAction() throws InterruptedException {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        Actions actions = new Actions(browser);
        WebElement hoverElement = getElement(By.xpath("(//button[normalize-space()='Mouse Hover'])[1]"));
        actions.scrollToElement(hoverElement).build().perform();
        actions.scrollByAmount(0, 100).build().perform();
        actions.clickAndHold(hoverElement).build().perform();


        clickOnElement(By.xpath("(//button[normalize-space()='Mouse Hover'])[1]"));
        Thread.sleep(2000);
        clickOnElement(By.xpath("(//a[normalize-space()='Top'])[1]"));
        Thread.sleep(2000);

        clickOnElement(By.id("dropdown-class-example"));
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        Thread.sleep(2000);

        actions.sendKeys(Keys.ARROW_UP).build().perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.ARROW_UP).build().perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.ARROW_UP).build().perform();
        Thread.sleep(2000);

        actions.sendKeys( getElement(By.xpath("(//input[@id='autocomplete'])")),"Kobe Ashsos!");
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
        actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
        getElement(By.xpath("//input[@id='name']")).sendKeys(Keys.CONTROL, "v");
        Thread.sleep(2000);


    }
}
