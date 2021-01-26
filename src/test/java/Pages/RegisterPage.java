package Pages;

import Config.DriverConfig;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class RegisterPage extends DriverConfig {

    String pass = "sample123";

    RegisterPage(){
        PageFactory.initElements(driver, this);

    }


    @FindBy(id = "id_gender1")
    private WebElement maleTitleRadioBtn;

    @FindBy(id = "customer_firstname")
    private WebElement customerFirstnameInput;

    @FindBy(id = "customer_lastname")
    private WebElement customerLastnameInput;

    @FindBy(id = "passwd")
    private WebElement passwordInput;

    @FindBy(id = "days")
    private WebElement birthdayDaySelect;

    @FindBy(id = "months")
    private WebElement birthdatMonthSelect;

    @FindBy(id = "years")
    private WebElement birthdayYearSelect;

    @FindBy(id = "address1")
    private WebElement addressLineInput;

    @FindBy(id = "city")
    private WebElement cityInput;

    @FindBy(id = "id_state")
    private WebElement stateSelect;

    @FindBy(id = "postcode")
    private WebElement zipCodeInput;

    @FindBy(id = "phone_mobile")
    private WebElement phoneNumberInput;

    @FindBy(id = "submitAccount")
    private WebElement submitFormBtn;

    @FindBy(css = "#center_column > .alert li")
    private List<WebElement> alertMessageContent;



    private void FillGender() { maleTitleRadioBtn.click(); }

    private void FillPhoneNumber(){ phoneNumberInput.sendKeys("123123123123123"); }

    private  void fillZipCode(){ zipCodeInput.sendKeys("11234"); }

    private void fillCity(){ cityInput.sendKeys("City"); }

    private  void FillAdress(){ addressLineInput.sendKeys("RandomAdress"); }

    private void SelectStateFromDropdown(){ new Select(stateSelect).selectByValue("4"); }

    private void fillUserPassword()
    {
        passwordInput.sendKeys("Samplepassword123");
    }

    private void SelectBirthFromDropdown()
    {
        new Select(birthdayDaySelect).selectByValue("4");
        new Select(birthdatMonthSelect).selectByValue("10");
        new Select(birthdayYearSelect).selectByValue("1990");
    }

    private void fillUserName ()
    {
        customerFirstnameInput.sendKeys("Name");
        customerLastnameInput.sendKeys("LastName");
    }



    public RegisterPage RegisterWithValidData(){
        fillUserName();
        FillGender();
        fillCity();
        FillAdress();
        FillPhoneNumber();
        SelectBirthFromDropdown();
        SelectStateFromDropdown();
        fillUserPassword();
        fillZipCode();
        submitFormBtn.click();
        return this;
    }
}
