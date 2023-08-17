package org.example.StepDef;

import io.cucumber.java.an.Y;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P01_register;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import sun.security.util.Password;

public class D01_registerStepDef {
    P01_register register = new P01_register();

    @Given("user go to register page")
    public void goRegisterPage() {
        register.RegisterLink();
    }

    @When("Select Gender {string}")
    public void selectGender(String Gender) {
        register.SelectGender(Gender);

    }

    @And("Enter FirstName {string}")
    public void enterFirstName(String FirstName) {
        register.FirstName(FirstName);
    }

    @And("Enter LastName {string}")
    public void enterLastName(String LastName) {
        register.LastName(LastName);
    }

    @And("Enter Day {string}")
    public void enterDay(String Day) {
        Select Select = new Select(register.Day());
        Select.selectByIndex(Integer.parseInt(Day));
    }

    @And("Enter month {string}")
    public void enterMonth(String Month) {
        Select Select = new Select(register.Month());
        Select.selectByIndex(Integer.parseInt(Month));
    }

    @And("Enter year {string}")
    public void enterYear(String Year) {
        Select Select = new Select(register.Year());
        Select.selectByValue(Year);
    }

    @And("Enter Reg_Email {string}")
    public void enterReg_Email(String Email) {
        register.Email(Email);
    }

    @And("Enter Reg_password {string}")
    public void enterReg_password(String Password) {
        register.Password(Password);
    }

    @And("Enter Conf_password {string}")
    public void enterConf_password(String ConPassword) {
        register.ConPassword(ConPassword);
    }

    @And("click on register button")
    public void clickOnRegisterButton() {
        register.RegButton();
    }

    @Then("verify that Iam register successfully")
    public void verifyThatIamRegisterSuccessfully() {
        register.ASSERT();
    }

    @And("click Continue")
    public void clickContinue() {
        register.Continue();
    }
}

