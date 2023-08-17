package org.example.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P02_login;
import org.testng.Assert;

public class D02_loginStepDef {
    P02_login Login = new P02_login();

    @Given("Go to login page")
    public void login_page(){
        Login.login();
    }
    @When("Enter Valid email {string}")
    public void enterValidEmail(String EM) {
        Login.username(EM);
    }

    @And("Enter Valid password {string}")
    public void enterValidPassword(String PW) {
        Login.password(PW);
    }
    @When("Enter Invalid email {string}")
    public void enterInvalidEmail(String InEmail) {
        Login.username(InEmail);
    }

    @And("Enter Invalid password {string}")
    public void enterInvalidPassword(String InPassword) {
        Login.password(InPassword);
    }

    @And("Click on login icon")
    public void click(){
        Login.LoginButton();
    }
    @Then("Verify that the user had login successfully")
    public void Login_successfully() {
        Assert.assertTrue(Login.myaccont().isDisplayed());
    }
    @Then("Verify that the user had not login successfully")
    public void Login_Unsuccess(){
        Assert.assertTrue(Login.invalidation_massage().isDisplayed());
    }
}
