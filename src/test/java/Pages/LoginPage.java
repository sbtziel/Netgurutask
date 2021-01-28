package Pages;

import Config.DriverConfig;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utility.RandomEmail.getSaltString;

public class LoginPage extends DriverConfig {

    public LoginPage() {
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "SubmitCreate")
    private WebElement createAccountButton;
    @FindBy(id = "email_create")
    private WebElement enterEmail;
    @FindBy(id = "SubmitLogin")
    private WebElement LoginButton;
    @FindBy(id = "email")
    private WebElement enterLoginEmail;
    @FindBy(id = "passwd")
    private static WebElement enterLoginPass;
    @FindBy(xpath = "//div[@id='center_column']//div[@class='alert alert-danger']//ol//li")
    private WebElement PasswordA1lert;


    private void enterEmail(String emailAddress) {
        enterEmail.sendKeys(emailAddress);
    }

    private void FillPassword() {
        enterLoginPass.sendKeys("MissingEmail");
    }

    private void Login() {
        LoginButton.click();
    }

    private void ClickRegister() {
        createAccountButton.click();
    }

    private void AssertMissingemail() {
        String EXPECTED_MESSAGE = "An email address required.";
        System.out.println(PasswordA1lert.getText());
        Assert.assertEquals(EXPECTED_MESSAGE, PasswordA1lert.getText());
    }


    public LoginPage MissingPassword() {
        AssertMissingemail();
        return this;
    }


    public RegisterPage SubmitValidEmail() {
        enterEmail(getSaltString() + "@gmail.com");
        ClickRegister();
        return new RegisterPage();
    }

    public LoginPage EnterPassword() {
        FillPassword();
        return this;
    }

    public LoginPage PressLoginButton() {
        Login();
        return this;
    }


}
