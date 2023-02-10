import io.github.bonigarcia.wdm.WebDriverManager;
import model.MainPage;
import model.OrderPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


@RunWith(Parameterized.class)
public class TestOrderScooter {
    private final String name;
    private final String surname;
    private final String address;
    private final String metro;
    private final String phone;
    private final String rentalPeriod;
    private final String date;
    private final String comment;
    private WebDriver driver;

    public TestOrderScooter(String name, String surname, String address, String metro, String phone, String rentalPeriod, String date, String comment) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.metro = metro;
        this.phone = phone;
        this.rentalPeriod = rentalPeriod;
        this.date = date;
        this.comment = comment;
    }

    @Parameterized.Parameters
    public static Object[][] getCredentials() {
        return new Object[][]{
                {"Максим", "Жадобов", "г.Москва ул.Груздева д.5", "Стрешнево", "+7905314620", "пятеро суток", "10.03.2023", ""},
                {"Иванко", "Петровски", "г.Москва ул.Петровская д.5", "Преображенская площадь", "+7903454351", "сутки", "22.09.2023", "Сгенерируй тестовые данные (свою учётку и несколько случайных)"}
        };
    }

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
    public void checkOrderUserOne() {
        MainPage objMainPage = new MainPage(driver);
        OrderPage objOrderPage = new OrderPage(driver);
        objMainPage.open();
        objMainPage.clickOrderButtonMain();
        objOrderPage.completingTheOrderForm(name, surname, address, metro, phone, rentalPeriod, date, comment);
        objOrderPage.clickOrderFormButton();
        objOrderPage.clickOrderYesFormButton();
        Assert.assertTrue(objOrderPage.getOrderIsProcessed().contains("Заказ оформлен"));
    }

    @After
    public void quit() {
        driver.quit();
    }
}