package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends PageBase {
    public MyAccountPage(WebDriver driver) {

        super(driver);
    }
    By myAccounttab = By.className("ico-account");
    public String MyAccountTabIsDisplayed (){
        String myAccountTab;
        myAccountTab = driver.findElement(myAccounttab).getText();
        return myAccountTab;

    }
}
