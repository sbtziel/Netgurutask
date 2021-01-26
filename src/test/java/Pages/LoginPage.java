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
    @FindBy(id ="SubmitLogin")
    private WebElement LoginButton;
    @FindBy(id= "email")
    private WebElement enterLoginEmail;
    @FindBy(id ="passwd")
    private static WebElement enterLoginPass;
    @FindBy(css = "#center_column > .alert li")
    private WebElement PasswordAlert;

    private void enterEmail(String emailAddress) {
        enterEmail.sendKeys(emailAddress);
    }

    private void FillPassword() {
        enterLoginPass.sendKeys("MissingEmail");
    }

    private void AssertMissingemail() {
        String EXPECTED_MESSAGE ="An email address required.";
        Assert.assertEquals(EXPECTED_MESSAGE,PasswordAlert.getText());
    }

    boolean isSignInLinkDisplayed(WebElement element) {
        if(element.isDisplayed());
           return true;
    }
    public void Login() {
        LoginButton.click();
    }




    public LoginPage MissingPassword(){
        AssertMissingemail();
                return this;
    }


    public RegisterPage SubmitValidEmail() {
        enterEmail(getSaltString()+"@gmail.com");
        createAccountButton.click();
        return new RegisterPage();
    }

    public LoginPage EnterPassword(){
        FillPassword();
        return this;
    }

    public LoginPage Enteremail(){
        FillPassword();
        return this;
    }
    public LoginPage AssertValidisVisible(){
        isSignInLinkDisplayed(LoginButton);
        return this;
    }
    public LoginPage PressLoginButton(){
        Login();
        return this;
    }


}
