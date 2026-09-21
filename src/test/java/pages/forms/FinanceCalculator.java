package pages.forms;

import browser.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.WaitManager;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class FinanceCalculator  {
    private static final String CALCULATOR_FORM_LOCATOR = "//*[contains(@class, \"chakra-tabs__tab-panels\")]";


    protected WebElement getElement() {
        try {
            return WaitManager.getWait().until(elementToBeClickable(By.xpath(CALCULATOR_FORM_LOCATOR)));
        } catch (TimeoutException e) {
            throw new RuntimeException(e);
        }
    }


    public void scrollTo() {
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollToElement(getElement());
    }


}
