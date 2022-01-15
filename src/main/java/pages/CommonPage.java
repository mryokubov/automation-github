package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by tairovich_jr on 2022-01-15.
 */
public class CommonPage {
    private WebDriver driver;

    public CommonPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(partialLinkText = "Sign in")
    WebElement signInLink;

    @FindBy(partialLinkText = "Contact us")
    WebElement contactUsLink;


    public void clickSignIn(){
        signInLink.click();
    }

}
