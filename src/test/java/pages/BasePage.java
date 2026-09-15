package pages;

import browser.Driver;
import config.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WaitManager;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public abstract class BasePage {
    private final By locator;

    protected BasePage(By locator) {
        this.locator = locator;
    }

    public Boolean isDisplayed() {
        try {
            WaitManager.getWait().until(visibilityOfElementLocated(locator));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }
}
