package Tests;

import Config.DriverConfig;
import Pages.HomePage;
import org.junit.Test;

public class RegisteTests  extends DriverConfig {

    @Test
    public void userShouldSuccessfullyRegister()
    {
        new HomePage().
                 enterSignInPage()
                .SubmitValidEmail()
                .RegisterWithValidData();
    }
}
