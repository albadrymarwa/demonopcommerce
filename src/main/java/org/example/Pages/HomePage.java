package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    By resisterTab = By.className("ico-register");
    public void ClickOnRegisterTab (){ClickOnElement(resisterTab);}
    By loginButton =By.className("ico-login");



    public void clickOnLoginButton (){
        ClickOnElement(loginButton);
    }
}
