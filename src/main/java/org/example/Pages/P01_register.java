package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class P01_register extends PageBase{
By firstNameField =By.id("FirstName");
By LastNameField = By.id("LastName");
//By daysDropDown = By.cssSelector("select[aria-invalid='false']");
    By daysDropDown = By.xpath("//select [@name='DateOfBirthDay']");
By monthDropDown =By.xpath("//select [@name='DateOfBirthMonth']");
By yearDropDown =By.xpath("//select [@name='DateOfBirthYear']");
By emailField = By.id("Email");
By passwordField = By.id("Password");
By confirmPasswordField = By.id("ConfirmPassword");
By registerdButton = By.id("register-button");
    public P01_register(WebDriver driver) {
        super(driver);
    }

    public void enterFirstName (){EnterText(firstNameField,"automation");}
    public void enterLastName (){EnterText(LastNameField,"tester");}
    public void selectBirthDayDate (){
        Select select = new Select(driver.findElement(daysDropDown));
        select.selectByVisibleText("1");
    }
    public void selectBirthDateMonth (){
        Select select = new Select(driver.findElement(monthDropDown));
        select.selectByIndex(8);
    }
    public void selectBirthDayDateYear (){
        Select  select = new Select(driver.findElement(yearDropDown));
        select.selectByIndex(2);
    }
    public void enterEmail (){
        EnterText(emailField,"test@example.com");}
    public void  enterPasswordField (){EnterText(passwordField,"P@ssw0rd");}
    public void enterConfirmPassword (){
        EnterText(confirmPasswordField, "P@ssw0rd");
    }
public void clickOnRegisterButton (){ClickOnElement(registerdButton);}
}
