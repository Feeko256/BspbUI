package utils;

import browser.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsManager {
    private static Actions getActions() {
        return new Actions(Driver.getDriver());
    }

    public static void scrollToElement(WebElement element) {
        getActions().scrollToElement(element).perform();
    }

    public static void moveToElement(WebElement element) {
        getActions().moveToElement(element, 0, 0).moveToElement(element).perform();
    }

    public static void clickOnElement(WebElement element) {
        getActions().moveToElement(element).click().perform();
    }
}
