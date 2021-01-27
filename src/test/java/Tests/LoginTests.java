package Tests;

import Config.DriverConfig;
import Pages.HomePage;
import org.junit.Test;

public class LoginTests extends DriverConfig {

    @Test
    public void LoginWithoutMailValidation()
    {
        new HomePage()
                .enterSignInPage()
                .EnterPassword()
                .PressLoginButton()
                .MissingPassword();
    }
}
