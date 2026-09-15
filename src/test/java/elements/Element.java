package elements;

import browser.Driver;
import config.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public abstract class Element {
    private final By locator;

    protected Element(By locator) {
        this.locator = locator;
    }

    protected WebElement getElement() {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(Config.WAIT_TIME));
            return wait.until(visibilityOfElementLocated(locator));
        } catch (TimeoutException e) {
            throw new RuntimeException(e);
        }
    }
}
