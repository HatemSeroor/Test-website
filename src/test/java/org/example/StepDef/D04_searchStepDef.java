package org.example.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class D04_searchStepDef {
    public static Assert softAssert;
    P03_HomePage P4 = new P03_HomePage();
    public String p;

    @When("user search with product name in search bar {string}")
    public void userSearchWithProductNameInSearchBar(String productName) {
        p = productName;
        P4.productName(productName);
    }

    @And("click on search button")
    public void clickOnSearchButton() {
        P4.clickButton();
    }

    @Then("verify that search done with valid Url Product")
    public void verifyThatSearchDoneWithValidUrlProduct() {

        softAssert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="));
    }

    @And("get number of search")
    public void getNumberOfSearch() {
        P4.NumberSearch();
    }

    // m4 sah8alaaaa
    @And("verify each result contains the search word {string}")
    public void verifyEachResultContainsTheSearchWord(String Name) {
        //  By mySelector = By.className("product-title");
//        List<WebElement> myElements = Hooks.driver.findElements(mySelector);
//        for (WebElement e : myElements) {
//            String y = e.getText();
//            Assert.assertTrue(y.contains(Name));
//        }
    }

    // SKU
    @When("user search with SKU in search bar {string}")
    public void userSearchWithSKUInSearchBar(String SKu) {
        P4.ProductSKU(SKu);
    }
    @And("click on product")
    public void clickOnProduct() {
        P4.ClickOnProduct();
    }

    @Then("verify that SKU is same as search {string}")
    public void verifyThatSKUIsSameAsSearch(String Nsku) {
        String sku = Hooks.driver.findElement(By.className("sku")).getText();
        Assert.assertTrue(sku.contains(Nsku));
    }
}



