package model.constants;

import org.openqa.selenium.By;

public class ElementsMainPage {
    // URL
    public static final String URL = "https://qa-scooter.praktikum-services.ru/";
    // Кнопка заказать в заголовке
    public static final By ORDER_BUTTON_HEADER = By.cssSelector("div.Header_Nav__AGCXC button.Button_Button__ra12g");
    // Кнопка заказать в центре страницы
    public static final By ORDER_BUTTON_MAIN = By.xpath(".//div[@class='Header_Nav__AGCXC']/button[text()='Заказать']");
    // Поиск вкладок в блоке Вопросы о важном
    public static final By TABS = By.xpath(".//div[@class='accordion__heading']");
    // Поиск текста в вкладках в блоке Вопросы о важном
    public static final By TEXT_IN_TABS = By.cssSelector("div.accordion__panel p");
    // Кнопка в блоке Cookies
    public static final By BUTTON_BLOCK_COOKIES = By.cssSelector("button.App_CookieButton__3cvqF");

}
