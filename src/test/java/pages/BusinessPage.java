package pages;

import org.openqa.selenium.By;

public class BusinessPage extends BasePage {
    private static final String BUSINESS_PAGE_LOCATOR = "//*[text()='Банковские услуги для бизнеса']";

    public BusinessPage() {
        super(By.xpath(BUSINESS_PAGE_LOCATOR));
    }
}
