package org.example.StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_HomePage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class D03_currenciesStepDef {
    P03_HomePage p3 = new P03_HomePage();

    @Given("user login successfully")
    public void userLoginSuccessfully() {
            p3.LoginIcon().click();
            p3.Email().sendKeys("HHHH@aaa.com");
            p3.password().sendKeys("12378900");
            p3.LoginButton().click();
        }

    @When("we choose from the dropdown the euro")
    public void we_choose_from_the_dropdown_the_euro() {
        Select chooseEuro_dollar = new Select(p3.currency());
        chooseEuro_dollar.selectByIndex(1);
    }
    @Then("all items will be changed to euro")
    public void all_items_will_be_changed_to_euro() {
        for(int i = 0;i<p3.items().size();i++){
            String text_for_items = p3.items().get(i).getText();
            Assert.assertTrue(text_for_items.contains("€"));
        }

    }
}



