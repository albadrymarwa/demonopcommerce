package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.HomePage;
import org.example.Pages.P01_register;
import org.example.Pages.RegisterResultPage;
import org.testng.Assert;

import static base.TestBase.driver;

public class D01_registerStepDef {
    HomePage homePageObject =new HomePage(driver);
    P01_register p01_registerObject =new P01_register(driver);
    RegisterResultPage registerResultPageObject =new RegisterResultPage(driver);
    @Given("user is in home page")
    public void user_is_in_home_page() {
       Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
    }
    @When("user clicks on register button")
    public void user_clicks_on_register_button() {
homePageObject.ClickOnRegisterTab();
    }
    @Then("user is redirected to register page")
    public void user_is_redirected_to_register_page() {

    }
    @When("users enters his first name")
    public void users_enters_his_first_name() {
        p01_registerObject.enterFirstName();

    }

    @When("enters his last name")
    public void enters_his_last_name() {
        p01_registerObject.enterLastName();
    }
    @When("select the day of  birth date")
    public void select_the_day_of_birth_date() {
       p01_registerObject.selectBirthDayDate();

    }

    @When("select the month of  birth date")
    public void select_the_month_of_birth_date() {
        p01_registerObject.selectBirthDateMonth();

    }

    @When("select the year  of  birth date")
    public void select_the_year_of_birth_date() {
       p01_registerObject.selectBirthDayDateYear();
    }

    @When("enters his email")
    public void enters_his_email() {
        p01_registerObject.enterEmail();

    }

    @When("enters his password")
    public void enters_his_password() {
        p01_registerObject.enterPasswordField();
    }

    @When("enters the same passwords in confirm password")
    public void enters_the_same_passwords_in_confirm_password() {
       p01_registerObject.enterConfirmPassword();
    }

    @When("clicks on register button")
    public void clicks_on_register_button() {
        p01_registerObject.clickOnRegisterButton();
    }

    @Then("user is redricted to register result page")
    public void user_is_redricted_to_register_result_page() {
Assert.assertEquals(registerResultPageObject.registrationCompletedText(),"Your registration completed");
    }


    @And("select gender")
    public void selectGender() {p01_registerObject.selectGender();
    }



}
