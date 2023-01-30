package model.constants;

import org.openqa.selenium.By;

public class ElementsOrderPage {
    // Форма заказа
    public static final By FORM_ORDER = By.cssSelector("div.Order_Content__bmtHS");
    // Поле Имя
    public static final By USER_FIELD = By.xpath(".//input[contains(@placeholder, '* Имя')]");
    // Поле Фамилия
    public static final By SURNAME_FIELD = By.xpath(".//input[contains(@placeholder, '* Фамилия')]");
    // Поле Адрес
    public static final By ADDRESS_FIELD = By.xpath(".//input[contains(@placeholder, '* Адрес: куда привезти заказ')]");
    // Поле Станция метро
    public static final By METRO_STATION_FIELD = By.xpath(".//input[contains(@placeholder, '* Станция метро')]");
    // Поле Телефон
    public static final By PHONE_FIELD = By.xpath(".//input[contains(@placeholder, '* Телефон: на него позвонит курьер')]");
    // Кнопка Далее
    public static final By NEXT_BUTTON = By.cssSelector("button.Button_Middle__1CSJM");
    // Поле Когда привезти самокат дата
    public static final By DELIVERY_DATE_FIELD = By.xpath(".//input[contains(@placeholder, '* Когда привезти самокат')]");
    // Поле Срок аренды
    public static final By RENTAL_PERIOD_FIELD = By.className("Dropdown-control");
    // Цвет самоката чёрный жемчуг
    public static final By COLOR_BLACK_PEARL_FIELD = By.xpath(".//label[@for='black']");
    // Цвет самоката серая безысходность
    public static final By COLOR_GRAY_HOPELESSNESS_FIELD = By.xpath(".//label[@for='grey']");
    // Поле комментарий для курьера
    public static final By COURIER_COMMENT_FIELD = By.xpath(".//input[contains(@placeholder, 'Комментарий для курьера')]");
    // Кнопка Заказать в форме
    public static final By ORDER_FORM_BUTTON = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    // Кнопка Да
    public static final By ORDER_YES_FORM_BUTTON = By.xpath(".//button[text() = 'Да']");
    // Текст заголовка Заказ оформлен
    public static final By ORDER_IS_PROCESSED = By.cssSelector("div.Order_ModalHeader__3FDaJ");

}
