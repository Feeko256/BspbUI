package pages;

import org.openqa.selenium.By;

public class BusinessPage extends BasePage {
    private static final String BUSINESS_PAGE_LOCATOR = "//*[text()='Банковские услуги для бизнеса']";

    private static final String PAGE_NAME = "BusinessPage";

    public BusinessPage() {
        super(By.xpath(BUSINESS_PAGE_LOCATOR), PAGE_NAME);
    }
}
