package Tests;

import Config.DriverConfig;
import Pages.HomePage;
import org.junit.Test;

public class RegisterUserWithoutEmail  extends DriverConfig {

    @Test
    public void RegisterUserWithoutEmail(){

        new HomePage().
                 enterSignInPage()
                .SubmitValidEmail()
                .RegisterWithValidData();
    }
}
