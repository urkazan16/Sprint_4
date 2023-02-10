import io.github.bonigarcia.wdm.WebDriverManager;
import model.MainPage;
import model.constants.Questions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import static org.junit.Assert.assertEquals;

public class TestQuestions {
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
    public void checkTextQuestionsTabOne() {
        MainPage objMainPage = new MainPage(driver);
        objMainPage.open();
        assertEquals(Questions.TEXT_PAYMENT_COURIER, objMainPage.getTextTab(0));
    }

    @Test
    public void checkTextQuestionsTabTwo() {
        MainPage objMainPage = new MainPage(driver);
        objMainPage.open();
        assertEquals(Questions.SEVERAL_SCOOTERS, objMainPage.getTextTab(1));
    }

    @Test
    public void checkTextQuestionsTabThree() {
        MainPage objMainPage = new MainPage(driver);
        objMainPage.open();
        assertEquals(Questions.TIME_IS_CALCULATED, objMainPage.getTextTab(2));
    }

    @Test
    public void checkTextQuestionsTabFour() {
        MainPage objMainPage = new MainPage(driver);
        objMainPage.open();
        assertEquals(Questions.ORDER_TODAY, objMainPage.getTextTab(3));
    }

    @Test
    public void checkTextQuestionsTabFive() {
        MainPage objMainPage = new MainPage(driver);
        objMainPage.open();
        assertEquals(Questions.EXTEND_ORDER_OR_RETURN, objMainPage.getTextTab(4));
    }

    @Test
    public void checkTextQuestionsTabSix() {
        MainPage objMainPage = new MainPage(driver);
        objMainPage.open();
        assertEquals(Questions.BRING_YOUR_CHARGER, objMainPage.getTextTab(5));
    }

    @Test
    public void checkTextQuestionsTabSeven() {
        MainPage objMainPage = new MainPage(driver);
        objMainPage.open();
        assertEquals(Questions.CANCEL_THE_ORDER, objMainPage.getTextTab(6));
    }

    @Test
    public void checkTextQuestionsTabEight() {
        MainPage objMainPage = new MainPage(driver);
        objMainPage.open();
        assertEquals(Questions.MKAD, objMainPage.getTextTab(7));
    }

    @After
    public void quit() {
        driver.quit();
    }
}
