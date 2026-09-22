package pages;

import org.openqa.selenium.By;

public class OsenDepositPage extends BasePage {
    private static final String OSEN_PAGE_LOCATOR = "//*[text()='«Осень»']";

    private static final String PAGE_NAME = "OsenPage";

    public OsenDepositPage() {
        super(By.xpath(OSEN_PAGE_LOCATOR), PAGE_NAME);
    }
}
