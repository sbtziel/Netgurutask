package Tests;

import Config.DriverConfig;
import Pages.HomePage;
import org.junit.Test;

public class RegisterTests extends DriverConfig {

    @Test
    public void userShouldSuccessfullyRegister() {
        new HomePage().
                enterSignInPage()
                .SubmitValidEmail()
                .RegisterWithValidData()
                .PressSubmitButton()
                .AssertNameLastname();
    }
}
