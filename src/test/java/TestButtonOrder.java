import io.github.bonigarcia.wdm.WebDriverManager;
import model.MainPage;
import model.OrderPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class TestButtonOrder {
    private WebDriver driver;

    @Before
    public void startUpChrome() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--disable-dev-shm-usage");
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
    }

    //@Before
    public void startUpFirefox() {
        FirefoxOptions options = new FirefoxOptions();
        System.setProperty("webdriver.gecko.driver", "/Users/user/geckodriver/geckodriver");
        driver = new FirefoxDriver(options);
    }

    @Test
    public void checkOrderButtonHeader() {
        MainPage objMainPage = new MainPage(driver);
        OrderPage objOrderPage = new OrderPage(driver);
        objMainPage.open(); //+
        objMainPage.clickOrderButtonHeader();
        Assert.assertTrue(objOrderPage.setFormOrder());
    }

    @Test
    public void checkOrderButtonMain() {
        MainPage objMainPage = new MainPage(driver);
        OrderPage objOrderPage = new OrderPage(driver);
        objMainPage.open();
        objMainPage.clickOrderButtonMain();
        Assert.assertTrue(objOrderPage.setFormOrder());
    }

    @After
    public void quit() {
        driver.quit();
    }
}
