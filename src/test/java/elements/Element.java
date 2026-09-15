package elements;

import browser.Driver;
import config.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WaitManager;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public abstract class Element {
    protected final By locator;

    protected Element(By locator) {
        this.locator = locator;
    }

    protected WebElement getElement() {
        try {
            return WaitManager.getWait().until(elementToBeClickable(locator));
        } catch (TimeoutException e) {
            throw new RuntimeException(e);
        }
    }

    protected String getText(){
        return getElement().getText();
    }
}
