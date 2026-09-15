package elements;

import browser.Driver;
import config.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WaitManager;

import java.time.Duration;

public class Button extends Element{
    public Button(By locator) {
        super(locator);
    }

    public void buttonClick(){
        getElement().click();
    }
    public void buttonClickWithAtr(String attr){
        WebElement element = getElement();
        new org.openqa.selenium.interactions.Actions(Driver.getDriver())
                .moveToElement(element)
                .perform();

        WaitManager.getWait().until(driver -> {
            element.click();
            return "true".equals(element.getAttribute(attr));
        });
    }

    public String getButtonText(){
       return getText();
    }
}
