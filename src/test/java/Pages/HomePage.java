package Pages;

import Config.DriverConfig;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends DriverConfig {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(partialLinkText = "Sign in")
    private WebElement signInButton;

    private void ClickSignInButton() {
        signInButton.click();
    }


    public LoginPage enterSignInPage() {
        ClickSignInButton();
        return new LoginPage();
    }

}
