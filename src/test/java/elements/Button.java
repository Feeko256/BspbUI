package elements;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import utils.WaitManager;

public class Button extends Element {
    protected final String buttonName;

    public Button(By locator, String buttonName) {
        super(locator, buttonName);
        this.buttonName = buttonName;
    }

    @Step("Нажал на кнопку [{this.buttonName}]")
    public void buttonClick() {
        getElement().click();
    }

    @Step("Нажал на кнопку с атрибутом")
    public void buttonClick(String attr) {
        var element = getElement();

        WaitManager.getWait().until(driver -> {
            element.click();
            return "true".equals(element.getAttribute(attr));//изучить
        });
    }

    public String getButtonText() {
        return getText();
    }
}
