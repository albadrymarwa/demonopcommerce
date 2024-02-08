package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_homePage;

import static base.TestBase.driver;

public class D06_homeslidersStepdeff {


        P03_homePage p03HomePageobject = new P03_homePage(driver);
        @When("user clicks on the first slider")
        public void user_clicks_on_the_first_slider() {
           p03HomePageobject.clickFirstSlider();
        }

        @Then("user should be redirected to {string}")
        public void user_should_be_redirected_to (String expectedURL) {
p03HomePageobject.waitForURLToContain(expectedURL);
        }

    @Given("user is on home page")
    public void userIsOnHomePage() {

    }

    @When("user clicks on the second  slider")
    public void userClicksOnTheSecondSlider() {
        p03HomePageobject.clickSecondSlider();
    }

    @Then("user should be redirected to{string}")
    public void userShouldBeRedirectedTo(String arg0) {
        p03HomePageobject.waitForURLToContain(arg0);
    }
}
