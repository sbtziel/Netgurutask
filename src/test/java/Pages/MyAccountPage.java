package Pages;

import Config.DriverConfig;
import Utility.User;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends DriverConfig {

    private User randomuser;

    public MyAccountPage(User randomuser) {
        this.randomuser = randomuser;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@title=\"Information\"]")
    private WebElement MyPersonalInformation;

    @FindBy(xpath = "//input[@value='Nane']")
    private WebElement Name;

    @FindBy(xpath = "//input[@id='firstname']")
    private WebElement Firstname;

    @FindBy(xpath = "//input[@id='lastname']")
    private WebElement LastName;

    public MyAccountPage PressSubmitButton() {
        MyPersonalInformation.click();
        return this;
    }

    public void AssertNameLastname() {
        String EXPECTED_Name = randomuser.getName();
        String EXPECTED_Lastname = randomuser.getLastname();
        Assert.assertEquals(EXPECTED_Name, Firstname.getAttribute("value"));
        Assert.assertEquals(EXPECTED_Lastname, LastName.getAttribute("value"));
    }
}
