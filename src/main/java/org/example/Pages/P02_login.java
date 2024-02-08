package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P02_login extends PageBase {
    public P02_login(WebDriver driver) {
        super(driver);
    }

    By emailField = By.id("Email");
    By passwordFeild = By.id("Password");
    By loginButton = By.cssSelector("a.ico-login");
    By errormessage = By.cssSelector(".validation-summary-errors");
    By myAccounttab = By.className("ico-account");


    public void login(String type, String username, String password) {
        if (type.equals("valid")) {
            driver.findElement(emailField).sendKeys(username);
            driver.findElement(passwordFeild).sendKeys(password);
        } else if (type.equals("invalid")) {
            driver.findElement(emailField).sendKeys(username);
            driver.findElement(passwordFeild).sendKeys(password);
        }
    }


    public void clickOnLoginButton() {
        ClickOnElement(loginButton);
    }

    public boolean isMyAccountTabDisplayed() {
        return driver.findElement(myAccounttab).isDisplayed();
    }
        public String getCurrentUrl1 () {
            return driver.getCurrentUrl();
        }

        public String getErrorMessage () {
            return driver.findElement(errormessage).getText();
        }


    }
