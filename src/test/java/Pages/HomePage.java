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

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
    private WebElement Dresses;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[2]/a")
    private WebElement EveningDresses;

    public LoginPage enterSignInPage() {
        signInButton.click();

        return new LoginPage();
    }
}
