package org.example.StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_HomePage;

public class D07_followUsStepDef {
    P03_HomePage P7 = new P03_HomePage();
    @Given("user login successf")
    public void userLoginSuccessf() {
        P7.LoginIcon().click();
        P7.Email().sendKeys("HHHH@aaa.com");
        P7.password().sendKeys("12378900");
        P7.LoginButton().click();
    }

    @When("user opens facebook link")
    public void user_opens_facebook_link() {
        P7.OpenFBLink();
    }

    @Then("Check Facebook is opened in new tab")
    public void checkFacebookIsOpenedInNewTab() {
        P7.AssertFB();
    }

    @When("user opens Twitter link")
    public void userOpensTwitterLink() {
        P7.OpenTWLink();
    }

    @Then("Check Twitter is opened in new tab")
    public void checkTwitterIsOpenedInNewTab() {
        P7.AssertTW();
    }

    @When("user opens RSS link")
    public void userOpensRSSLink() {
        P7.OpenRSSLink();
    }

    @Then("Check RSS is opened in new tab")
    public void checkRSSIsOpenedInNewTab() {
        P7.AssertRSS();
    }

    @When("user opens Youtube link")
    public void userOpensYoutubeLink() {
        P7.OpenYTLink();
    }

    @Then("Check Youtube is opened in new tab")
    public void checkYoutubeIsOpenedInNewTab() {
        P7.AssertYT();
    }
}
