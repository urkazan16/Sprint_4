package model;

import model.constants.ElementsMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {
    private WebDriver driver;
    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open(){
        driver.get(ElementsMainPage.URL);
    }

    public void scrollPage(By scrollElement){
        WebElement element = driver.findElement(scrollElement);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void isWaitOrderDisplayed(By eaitElement) {
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait2.until(ExpectedConditions.visibilityOfElementLocated(eaitElement));
    }

    public void clickOrderButtonHeader(){
        driver.findElement(ElementsMainPage.ORDER_BUTTON_HEADER).click();
    }

    public void clickOrderButtonMain(){
        driver.findElement(ElementsMainPage.ORDER_BUTTON_MAIN).click();
    }
    public String getTextTab(int number){
        scrollPage(ElementsMainPage.TABS);
        driver.findElement(ElementsMainPage.BUTTON_BLOCK_COOKIES).click();
        driver.findElements(ElementsMainPage.TABS).get(number).click();
        isWaitOrderDisplayed(ElementsMainPage.TABS);
        return driver.findElements(ElementsMainPage.TEXT_IN_TABS).get(number).getText();
    }
}
