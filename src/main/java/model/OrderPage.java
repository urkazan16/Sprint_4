package model;

import model.constants.ElementsOrderPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrderPage {
    private WebDriver driver;

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean setFormOrder() {
        return driver.findElement(ElementsOrderPage.FORM_ORDER).isDisplayed();
    }

    public void isWaitOrderDisplayed(By eaitElement) {
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait2.until(ExpectedConditions.visibilityOfElementLocated(eaitElement));
    }

    public void scrollPage(By scrollElement) {
        WebElement element = driver.findElement(scrollElement);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void setUsername(String username) {
        driver.findElement(ElementsOrderPage.USER_FIELD).sendKeys(username);
    }

    public void setSurname(String surname) {
        driver.findElement(ElementsOrderPage.SURNAME_FIELD).sendKeys(surname);
    }

    public void setAddress(String address) {
        driver.findElement(ElementsOrderPage.ADDRESS_FIELD).sendKeys(address);
    }

    public By setSubway(String station) {
        return By.xpath(".//button/div[text()='" + station + "']");
    }

    public void setMetroStation(String subwayStation) {
        driver.findElement(ElementsOrderPage.METRO_STATION_FIELD).click();
        isWaitOrderDisplayed(setSubway(subwayStation));
        scrollPage(setSubway(subwayStation));
        driver.findElement(setSubway(subwayStation)).click();
    }

    public void setPhone(String phone) {
        driver.findElement(ElementsOrderPage.PHONE_FIELD).sendKeys(phone);
    }

    public void clickNext() {
        driver.findElement(ElementsOrderPage.NEXT_BUTTON).click();
    }

    public void setDeliveryDate(String deliveryDate) {
        driver.findElement(ElementsOrderPage.DELIVERY_DATE_FIELD).sendKeys(deliveryDate);
    }

    public By setPeriod(String rentalPeriod) {
        return By.xpath(".//div[text()='" + rentalPeriod + "']");
    }

    public void setRentalPeriod(String period) {
        driver.findElement(ElementsOrderPage.RENTAL_PERIOD_FIELD).click();
        isWaitOrderDisplayed(setPeriod(period));
        driver.findElement(setPeriod(period)).click();
    }

    public void clickScooterColorBlackReal() {
        driver.findElement(ElementsOrderPage.COLOR_BLACK_PEARL_FIELD).click();
    }

    public void clickScooterColorGrayHopelessness() {
        driver.findElement(ElementsOrderPage.COLOR_GRAY_HOPELESSNESS_FIELD).click();
    }

    public void setCourierComment(String courierComment) {
        driver.findElement(ElementsOrderPage.COURIER_COMMENT_FIELD).sendKeys(courierComment);
    }

    public void clickOrderFormButton() {
        driver.findElement(ElementsOrderPage.ORDER_FORM_BUTTON).click();
    }

    public void clickOrderYesFormButton() {
        isWaitOrderDisplayed(ElementsOrderPage.ORDER_YES_FORM_BUTTON);
        driver.findElement(ElementsOrderPage.ORDER_YES_FORM_BUTTON).click();
    }

    public String getOrderIsProcessed() {
        return driver.findElement(ElementsOrderPage.ORDER_IS_PROCESSED).getText();
    }

    public void completingTheOrderForm(String name, String surname, String address, String metro, String phone, String rentalPeriod, String date, String comment) {
        setUsername(name); // *
        setSurname(surname); // *
        setMetroStation(metro); // *
        setAddress(address); // *
        setPhone(phone); // *
        clickNext();
        setRentalPeriod(rentalPeriod); // *
        setDeliveryDate(date); // *
        clickScooterColorBlackReal();
        setCourierComment(comment);
    }

}
