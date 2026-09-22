package pages;

import org.openqa.selenium.By;

public class DepositPage extends BasePage {
    private static final String DEPOSIT_PAGE_LOCATOR = "//button[text()='Вклады и накопительный счёт']";

    private static final String PAGE_NAME = "DepositPage";

    public DepositPage() {
        super(By.xpath(DEPOSIT_PAGE_LOCATOR), PAGE_NAME);
    }
}
