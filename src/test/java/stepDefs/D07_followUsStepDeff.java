package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_homePage;
import org.testng.Assert;

import static base.TestBase.driver;

public class D07_followUsStepDeff {
    P03_homePage p03_homePageobject = new P03_homePage(driver);
    @Given("User is on homepage")
    public void user_is_on_homepage() {
    }
    @When("user opens facebook link")
    public void user_opens_facebook_link() {
        p03_homePageobject.openFacebookLInk();
    }
    @Then("facebook Page is opend in a new tab")
    public void facebook_page_is_opend_in_a_new_tab() {
        Assert.assertEquals("https://www.facebook.com/nopCommerce",p03_homePageobject.SwitchToNewTabAndReturnURL());
    }
    @When("user opens twitter link")
    public void user_opens_twitter_link() {
        p03_homePageobject.openTwitterLinl();
    }
    @Then("twitter Page is opend in a new tab")
    public void twitter_page_is_opend_in_a_new_tab() {
        Assert.assertEquals("https://twitter.com/nopCommerce",p03_homePageobject.SwitchToNewTabAndReturnURL());
    }
    @When("user opens rss  link")
    public void user_opens_rss_link() {
        p03_homePageobject.openRssLink();
    }
    @Then("rss Page is opend in a new tab")
    public void rss_page_is_opend_in_a_new_tab() {
        Assert.assertEquals("https://demo.nopcommerce.com/new-online-store-is-open",p03_homePageobject.SwitchToNewTabAndReturnURL());
    }
    @When("user opens yputube  link")
    public void user_opens_yputube_link() {
        p03_homePageobject.openYoutubeLink();
    }
    @Then("youtube Page is opend in a new tab")
    public void youtube_page_is_opend_in_a_new_tab() {
        Assert.assertEquals("https://www.youtube.com/user/nopCommerce",p03_homePageobject.SwitchToNewTabAndReturnURL());
    }

}
