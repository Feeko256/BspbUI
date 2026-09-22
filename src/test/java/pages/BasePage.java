package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import utils.WaitManager;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public abstract class BasePage {
    private final By locator;
    protected final String pageName;

    protected BasePage(By locator, String pageName) {
        this.locator = locator;
        this.pageName = pageName;
    }

    @Step("Проверка существования страницы [{this.pageName}]")
    public Boolean isDisplayed() {
        try {
            WaitManager.getWait().until(visibilityOfElementLocated(locator));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }
}
