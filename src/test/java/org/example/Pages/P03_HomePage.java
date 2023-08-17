package org.example.Pages;

import org.example.StepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class P03_HomePage {
    //Login
    public WebElement LoginIcon() {
        return Hooks.driver.findElement(By.className("ico-login"));
    }

    public WebElement Email() {
        return Hooks.driver.findElement(By.className("email"));
    }

    public WebElement password() {
        return Hooks.driver.findElement(By.className("password"));
    }

    public WebElement LoginButton() {
        return Hooks.driver.findElement(By.className("login-button"));
    }

    //END
    //CurrencyPage
    public WebElement currency() {
        return Hooks.driver.findElement(By.id("customerCurrency"));
    }

    public List<WebElement> items() {
        return Hooks.driver.findElements(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]"));
    }
    //END
    //SearchPage
    public void productName(String PName){
        Hooks.driver.findElement(By.id("small-searchterms")).sendKeys(PName);
    }
    public void clickButton(){
        Hooks.driver.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/button")).click();
    }
    public void NumberSearch(){
        int x = Hooks.driver.findElements(By.className("item-box")).size();
        System.out.println("number is " + x);
    }
    public void ProductSKU(String SKU){
        Hooks.driver.findElement(By.id("small-searchterms")).sendKeys(SKU);
    }
    public void ClickOnProduct(){
        Hooks.driver.findElement(By.className("product-title")).click();
    }
    //END
    //HoveringPage
    int num;
    Random rand = new Random();

    public void hoverOnCategory() {
        num = rand.nextInt(2);
        List<WebElement> categories = Hooks.driver.findElements(By.xpath("/html/body/div[6]/div[2]/ul[1]/li"));
        Actions actions = new Actions(Hooks.driver);
        actions.moveToElement(categories.get(num)).perform();
    }

    public String clickSubCategories() {
        List<WebElement> subcategories = Hooks.driver.findElements(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[" + (num +1) + "]/ul/li"));
        int num2 = rand.nextInt(2);
        System.out.println(num2);
        String S = subcategories.get(num2).getText();
        subcategories.get(num2).click();
        return S;
    }
    //END
    //SliderPage
    public void galaxySlider(){
        WebElement galaxy=  Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[1]/div[2]/a[1]"));
        Assert.assertTrue(galaxy.isDisplayed());
    }
    public void clickONGalaxy(){
        Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[1]/div[2]/a[1]")).click();
    }

    public void IphoneSlider(){
        WebElement Iphone = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[1]/div[2]/a[2]"));
        Assert.assertTrue(Iphone.isDisplayed());
    }
    public void ClickONIphone(){
        Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[1]/div[2]/a[2]")).click();
    }
    //END
    //FollowUSPage
    public void OpenFBLink() {
        Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[1]/a")).click();
    }
    public void AssertFB(){
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://www.facebook.com/nopCommerce"));
    }
    public void OpenTWLink(){
        Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[2]/a")).click();
    }
    public void AssertTW(){
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        System.out.println(tabs.size());
        Hooks.driver.switchTo().window(tabs.get(1));
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://twitter.com/"));
    }
    public void OpenRSSLink(){
        Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[3]/a")).click();
    }
    public void AssertRSS(){
        ArrayList<String> tabsRSS = new ArrayList<>(Hooks.driver.getWindowHandles());
        System.out.println(tabsRSS.size());
        Hooks.driver.switchTo().window(tabsRSS.get(1));
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://rss.com/"));
    }
    public void OpenYTLink(){
        Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[4]/a")).click();
    }
    public void AssertYT(){
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        System.out.println(tabs.size());
        Hooks.driver.switchTo().window(tabs.get(1));
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://www.youtube.com/user/nopCommerce"));
    }
    //END
    //WishlistPage
    public void product() {
        Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]")).click();
    }
    public WebElement SuccessMassage(){
        return Hooks.driver.findElement(By.className("content"));
    }
    public void clickWishlistButton(){
        Hooks.driver.findElement(By.className("wishlist-label")).click();
    }
    public void AssertQuantity(){
        int count = Hooks.driver.findElements(By.className("quantity")).size();
        Assert.assertTrue(count>0);
    }
    //END
}
