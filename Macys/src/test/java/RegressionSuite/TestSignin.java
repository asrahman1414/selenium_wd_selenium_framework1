package RegressionSuite;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.Homepage;
import regression.SignInClass;

public class TestSignin extends CommonAPI {
    SignInClass sign;

    @BeforeMethod
    public void initialize() {
        sign = PageFactory.initElements(driver, SignInClass.class);
    }
      @Test
     public void testsignin() {
        sign.setSignIn("asrahman", "rahman123");
      }

}
