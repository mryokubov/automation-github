package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by tairovich_jr on 2022-01-15.
 */
public class UserAccountPage extends CommonPage{

    public UserAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[text()='My personal information']")
    WebElement myPersonalInfoTab;

    @FindBy(id = "old_passwd")
    WebElement oldPasswdInput;

    @FindBy(id = "passwd")
    WebElement newPasswordInput;

    @FindBy(id = "confirmation")
    WebElement confirmNewPasswrdInput;

    @FindBy(name = "submitIdentity")
    WebElement saveBtn;

    public void clickOnMyPersonalTab(){
        myPersonalInfoTab.click();
    }

    public void changePassword(String oldPass, String newPass){
        oldPasswdInput.sendKeys(oldPass);
        newPasswordInput.sendKeys(newPass);
        confirmNewPasswrdInput.sendKeys(newPass);
        saveBtn.click();
    }

}
