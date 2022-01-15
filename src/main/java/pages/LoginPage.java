package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by tairovich_jr on 2022-01-15.
 */
public class LoginPage extends CommonPage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //web element

    @FindBy(id = "email")
    WebElement emailInput;

    @FindBy(id = "passwd")
    WebElement passwdInput;

    @FindBy(id = "SubmitLogin")
    WebElement signInButton;


    public void signIn(String email, String password){
        emailInput.sendKeys(email);
        passwdInput.sendKeys(password);
        signInButton.click();
    }



}
