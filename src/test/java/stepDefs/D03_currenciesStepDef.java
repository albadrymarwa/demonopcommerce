package stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_homePage;

import static base.TestBase.driver;

public class D03_currenciesStepDef {
    P03_homePage p03HomePageobject = new P03_homePage(driver);
    @When("user select Euro currency from dropdown list")
    public void user_select_euro_currency_from_dropdown_list() {
        p03HomePageobject.selectEuroCurruncy();

    }


    @Then("Then Euro symbol \\(€) should be displayed on all products")
    public void thenEuroSymbol€ShouldBeDisplayedOnAllProducts() {

        p03HomePageobject.verifyEuroSymbolOnAllProducts();
    }
}
