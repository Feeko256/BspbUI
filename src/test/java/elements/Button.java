package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.WaitManager;

public class Button extends Element {
    public Button(By locator) {
        super(locator);
    }

    public void buttonClick() {
        getElement().click();
    }

    public void buttonClick(String attr) {
        var element = getElement();

        WaitManager.getWait().until(driver -> {
            element.click();
            return "true".equals(element.getAttribute(attr));
        });
    }

    public String getButtonText() {
        return getText();
    }
}
