package org.example.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_HomePage;
import org.testng.Assert;

public class D08_WishlistStepDef {
    P03_HomePage p8 = new P03_HomePage();

    @Given("user login successful")
    public void user_login_successful() {
        p8.LoginIcon().click();
        p8.Email().sendKeys("HHHH@aaa.com");
        p8.password().sendKeys("12378900");
        p8.LoginButton().click();
    }

    @When("user find the feature product and choose wish product")
    public void userFindTheFeatureProductAndChooseWishProduct() {
        p8.product();
    }

    @Then("Success massage will appear")
    public void successMassageWillAppear() {
        String SM = p8.SuccessMassage().getText();
        Assert.assertEquals(SM, "The product has been added to your wishlist");
    }

    @And("wait until the massage disappear")
    public void waitUntilTheMassageDisappear() throws InterruptedException {
        Thread.sleep(5000);
    }

    @Then("click in wishlist button at the top")
    public void clickInWishlistButtonAtTheTop() {
        p8.clickWishlistButton();
    }

    @And("check the quantity")
    public void checkTheQuantity() {
        p8.AssertQuantity();

    }


}
