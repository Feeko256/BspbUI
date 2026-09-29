package pages.forms;

import org.openqa.selenium.By;
import pages.BasePage;

public class DepositCalculator extends BasePage {
    private static final String DEP_CALCULATOR_FORM_LOCATOR = "//*[contains(@class, \"chakra-tabs__tab-panels\")]";

    private static final String FORM_NAME = "DepositCalculatorForm";

    //p[text()='Ставка']/following-sibling::*

    public DepositCalculator() {
        super(By.xpath(DEP_CALCULATOR_FORM_LOCATOR), FORM_NAME);
    }

    public void changeGetPlace(){

    }

    public void changeCheckoutTime(){

    }

    public void changeDepositAmount(){

    }

    public void changeDepositTime(){

    }
}
