package regression;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInClass extends CommonAPI {

    @FindBy(xpath = "//*[@id=\'myRewardsLabel-status\']/span[1]")
    WebElement SignInText;

    @FindBy(xpath = "//*[@id=\'email\']")
    WebElement username;

    @FindBy(xpath = "//*[@id=\'pw-input\']")
    WebElement Password;

    @FindBy(xpath = "//*[@id=\'sign-in\']")
    WebElement SignIn;

    public void setSignIn(String email, String pass) {
        SignInText.click();
        username.sendKeys(email);
        Password.sendKeys(pass);
        SignIn.click();

    }
}
