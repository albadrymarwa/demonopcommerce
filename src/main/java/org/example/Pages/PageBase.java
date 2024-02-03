package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageBase {
    WebDriver driver ;
    public PageBase(WebDriver driver){this.driver=driver;}

    public void ClickOnElement (By elementLocator){
        waitUntilElementPresence(elementLocator);
        scrollToElementView(elementLocator);
        driver.findElement(elementLocator).click();
    }

    public void EnterText (By elementLocator, String Text){
        waitUntilElementPresence(elementLocator);
        scrollToElementView(elementLocator);
        driver.findElement(elementLocator).sendKeys(Text);

    }
    public void waitUntilElementPresence(By elementLocator){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(elementLocator));
    }
    public void scrollToElementView (By elementLocator){
        WebElement element =driver.findElement(elementLocator);
        ((JavascriptExecutor)driver ).executeScript("arguments[0].scrollIntoView(true);",element);
    }
}
