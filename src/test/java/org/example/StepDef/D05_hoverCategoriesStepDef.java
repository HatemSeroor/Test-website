package org.example.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_HomePage;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.Random;

public class D05_hoverCategoriesStepDef {
    P03_HomePage P5 = new P03_HomePage();
    String text ;
    @Given("user login success")
    public void userLoginSuccess() {
            P5.LoginIcon().click();
            P5.Email().sendKeys("HHHH@aaa.com");
            P5.password().sendKeys("12378900");
            P5.LoginButton().click();
        }
    @When("hover on category list")
    public void hover_on_category_list() {
        P5.hoverOnCategory();
    }

    @And("click one sub_category")
    public void click_one_sub_category() {
        text = P5.clickSubCategories();
    }

    @Then("verify the text on it")
    public void verify_the_text_on_it() {
        String msg=Hooks.driver.findElement(By.className("page-title")).getText();
        Assert.assertEquals(msg , text);
    }
}
