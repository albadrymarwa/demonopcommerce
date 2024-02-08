package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterResultPage extends PageBase{
    By registerText = By.cssSelector("div.result");

    public RegisterResultPage(WebDriver driver) {
        super(driver);
    }
    public String registrationCompletedText (){
        String registerCompletedText = driver.findElement(registerText).getText();
                return registerCompletedText;
    }
}
