package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.MainPage;

import java.time.Duration;

/**
 * Created by tairovich_jr on 2022-01-15.
 */
public class UpdatePasswordEndToEndTest {

    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        driver.manage().deleteAllCookies();
    }

    @Test
    public void updateUserPasswordTest(){
        driver.get("http://automationpractice.com");

        MainPage mainPage = new MainPage(driver);

        mainPage.clickSignIn();




    }

    @AfterMethod
    public void cleanUp(){
    //    driver.quit();
    }
}
