package pages;

import elements.Button;
import org.openqa.selenium.By;

public class MainPage extends BasePage {
    private static final String MAIN_PAGE_LOCATOR = "//*[text()='Выберите свой продукт']";
    private static final String REGION_BUTTON_ATTR = "aria-expanded";
    private static final String REGION_NAME_LOCATOR = "//*[contains(@id, \"menu-list\")]//*[text()='%s']";
    private final Button businessButton = new Button(By.xpath("//nav//*[text()='Бизнесу']"));
    private final Button regionSelectButton = new Button(By.xpath("//*[contains(@id, \"menu-button\")]"));

    public MainPage() {
        super(By.xpath(MAIN_PAGE_LOCATOR));
    }

    public void businessButtonClick() {
        businessButton.buttonClick();
    }

    public String changeRegion(String regionName) {
        regionSelectButton.buttonClick(REGION_BUTTON_ATTR);
        var regionToSelect = new Button(By.xpath(String.format(REGION_NAME_LOCATOR, regionName)));
        regionToSelect.buttonClick();
        return regionSelectButton.getButtonText();
    }
}
