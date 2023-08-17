package org.example.Pages;

import org.example.StepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class P01_register {
    public void RegisterLink() {
         Hooks.driver.findElement(By.className("ico-register")).click();
    }

    public void SelectGender(String Gender) {
        if (Gender.equals("male"))
             Hooks.driver.findElement(By.id("gender-male")).click();
        else
             Hooks.driver.findElement(By.id("gender-female")).click();
    }

    public void FirstName(String FN) {
         Hooks.driver.findElement(By.id("FirstName")).sendKeys(FN);
    }

    public void LastName(String LN) {
         Hooks.driver.findElement(By.id("LastName")).sendKeys(LN);
    }

    public WebElement Day() {
        return Hooks.driver.findElement(By.name("DateOfBirthDay"));
    }
    public WebElement Month() {
        return Hooks.driver.findElement(By.name("DateOfBirthMonth"));
    }
    public WebElement Year() {
        return Hooks.driver.findElement(By.name("DateOfBirthYear"));
    }
    public void Email(String EM) {
         Hooks.driver.findElement(By.id("Email")).sendKeys(EM);
    }
    public void Password(String PASS) {
         Hooks.driver.findElement(By.id("Password")).sendKeys(PASS);
    }
    public void ConPassword(String CPASS) {
         Hooks.driver.findElement(By.id("ConfirmPassword")).sendKeys(CPASS);
    }
    public void RegButton(){
         Hooks.driver.findElement(By.id("register-button")).click();
    }

    public void ASSERT() {
        String SuccessM = Hooks.driver.findElement(By.className("result")).getText();
        Assert.assertEquals(SuccessM, "Your registration completed");
    }

    public void Continue(){
         Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[2]/a")).click();
    }
}