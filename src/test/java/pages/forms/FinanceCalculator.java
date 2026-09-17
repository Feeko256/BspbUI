package pages.forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class FinanceCalculator extends BasePage {
    private static final String CALCULATOR_FORM_LOCATOR = "//*[contains(@class, \"chakra-tabs__tab-panels\")]";

    protected FinanceCalculator() {
        super(By.xpath(CALCULATOR_FORM_LOCATOR));
    }

    protected WebElement getCalculatorForm() {
        if (isDisplayed()) {
            {
                return null;
            }
        }
        return null;
    }
}
