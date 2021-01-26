package Tests;

import Config.DriverConfig;
import Pages.HomePage;
import org.junit.Test;

public class LoginUserPositive extends DriverConfig {

    @Test
    public void userShouldSuccessfullyRegister() {
        new HomePage()
                .enterSignInPage()
                .Enteremail()
                .PressLoginButton()
                .MissingPassword();

    }

}
