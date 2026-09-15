package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import utils.WaitManager;

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
