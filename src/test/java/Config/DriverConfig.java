package Config;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




import java.util.concurrent.TimeUnit;

public class DriverConfig {

    public WebDriver driver;

    @Before
    public void startTest() {
        String baseUrl = "http://automationpractice.com/index.php";
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @After
    public void QuitTest(){
        if (driver != null)
            driver.quit();
    }

}


