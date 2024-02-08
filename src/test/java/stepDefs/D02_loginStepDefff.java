package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.HomePage;
import org.example.Pages.P02_login;
import org.testng.Assert;

import static base.TestBase.driver;

public class D02_loginStepDefff {
    P02_login p02LoginObject = new P02_login(driver);
    HomePage homePageobject = new HomePage(driver);
    @When("user clicks on login button")
    public void userClicksOnLoginButton() {
        homePageobject.clickOnLoginButton();

    }

    @Then("user is redricted to login page")
    public void userIsRedrictedToLoginPage() {
    }

    @When("user login with {string} {string} and {string}")
    public void userLoginWithAnd(String type, String username, String password) {
        p02LoginObject.login(type, username, password);
    }

    @And("user press on login button")
    public void userPressOnLoginButton() {
        p02LoginObject.clickOnLoginButton();
    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
       Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
       Assert.assertEquals(p02LoginObject.isMyAccountTabDisplayed());

      //  Assert.assertTrue(p02LoginObject.isMyAccountTabDisplayed());

    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
     //   assertTrue(p02LoginObject.getErrorMessage().contains("Login was unsuccessful."));

    }
}
