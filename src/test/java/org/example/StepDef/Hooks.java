package org.example.StepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hooks {
    public static WebDriver driver;

    @Before
    public static void open_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://demo.nopcommerce.com/");
    }

//    public static void OpenHomePage(){
//        driver.get("https://demo.nopcommerce.com/");
//    }

    @After
    public static void quik() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
