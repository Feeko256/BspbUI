package elements;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import utils.WaitManager;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public abstract class Element {
    protected final By locator;
    protected final String elementName;

    protected Element(By locator, String elementName) {
        this.locator = locator;
        this.elementName = elementName;
    }

    @Step("Получен элемент [{this.elementName}]")
    public WebElement getElement() {
        try {
            return WaitManager.getWait().until(visibilityOfElementLocated(locator));
        } catch (TimeoutException e) {
            throw new RuntimeException(e);
        }
    }

    @Step("Получен текст элемента [{this.elementName}]")
    protected String getText() {
        return getElement().getText();
    }
}
