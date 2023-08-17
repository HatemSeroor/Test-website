package org.example.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_HomePage;
import org.testng.Assert;

public class D06_homeSlidersStepDef {
    P03_HomePage P6 = new P03_HomePage();

    @When("find galaxy slider displayed")
    public void find_galaxy_slider_displayed() {
        P6.galaxySlider();
    }

    @Then("click on Galaxy")
    public void click_on_Galaxy() {
        P6.clickONGalaxy();
    }

    @And("verify that is Url change to Galaxy")
    public void verifyThatIsUrlChangeToGalaxy() {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/nokia-lumia-1020");
    }

    @When("find Iphone slider displayed")
    public void findIphoneSliderDisplayed() {
        P6.IphoneSlider();
    }

    @Then("click on Iphone")
    public void clickOnIphone() {
        P6.ClickONIphone();
    }

    @And("verify that is Url change to Iphone")
    public void verifyThatIsUrlChangeToIphone() {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/iphone-6");
    }


}
