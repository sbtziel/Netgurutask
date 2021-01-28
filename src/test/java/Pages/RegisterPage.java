package Pages;

import Config.DriverConfig;
import Utility.User;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class RegisterPage extends DriverConfig {


    RegisterPage() {
        PageFactory.initElements(driver, this);
    }


    User randomUser = new User("SeleniumMamimie", "NazwiskoTez");


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


    private void FillGender() {
        maleTitleRadioBtn.click();
    }

    private void FillPhoneNumber() {
        phoneNumberInput.sendKeys("123123123123123");
    }

    private void fillZipCode() {
        zipCodeInput.sendKeys("11234");
    }

    private void fillCity() {
        cityInput.sendKeys("City");
    }

    private void FillAdress() {
        addressLineInput.sendKeys("RandomAdress");
    }

    private void SelectStateFromDropdown() {
        new Select(stateSelect).selectByValue("4");
    }

    private void fillUserPassword() {
        passwordInput.sendKeys("Samplepassword123");
    }

    private void PressSubmitButton() {
        submitFormBtn.click();
    }

    private void SelectBirthFromDropdown() {
        new Select(birthdayDaySelect).selectByValue("4");
        new Select(birthdatMonthSelect).selectByValue("10");
        new Select(birthdayYearSelect).selectByValue("1990");
    }

    private void fillUserName(String name, String lastname) {
        customerFirstnameInput.sendKeys(name);
        customerLastnameInput.sendKeys(lastname);
    }

    public MyAccountPage RegisterWithValidData() {
        fillUserName(randomUser.getName(),randomUser.getLastname());
        FillGender();
        fillCity();
        FillAdress();
        FillPhoneNumber();
        SelectBirthFromDropdown();
        SelectStateFromDropdown();
        fillUserPassword();
        fillZipCode();
        PressSubmitButton();
        return new MyAccountPage(randomUser);
    }
}
