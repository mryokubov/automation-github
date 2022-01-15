package tests;

import creds.UserCredentials;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.UserAccountPage;
import static creds.UserCredentials.*;
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
    public void updateUserPasswordTest() throws InterruptedException {
        driver.get("http://automationpractice.com");

        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        UserAccountPage userPage = new UserAccountPage(driver);

        mainPage.clickSignIn();
        loginPage.signIn("breitenberg.antonio@gmail.com",OLD_PASSWORD);
        userPage.clickOnMyPersonalTab();
        userPage.changePassword(OLD_PASSWORD,NEW_PASSWORD);

    }

    @AfterMethod
    public void cleanUp() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
