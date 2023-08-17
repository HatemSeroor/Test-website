package org.example.Pages;

import io.cucumber.messages.types.Hook;
import org.example.StepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class P02_login {
    public void login() {
         Hooks.driver.findElement(By.className("ico-login")).click();
    }
    public void username(String UN){

         Hooks.driver.findElement(By.className("email")).sendKeys(UN);
    }
    public void password(String Pass){

         Hooks.driver.findElement(By.className("password")).sendKeys(Pass);
    }
    public void LoginButton() {
         Hooks.driver.findElement(By.className("login-button")).click();
    }

    public WebElement myaccont(){
        return Hooks.driver.findElement(By.className("ico-account"));
    }
    public WebElement invalidation_massage(){
        return Hooks.driver.findElement(By.className("message-error"));
    }
}
