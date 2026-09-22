package pages;

import elements.Button;
import org.openqa.selenium.By;
import utils.ActionsManager;

public class MainPage extends BasePage {
    private static final String MAIN_PAGE_LOCATOR = "//*[text()='Выберите свой продукт']";
    private static final String REGION_BUTTON_ATTR = "aria-expanded";
    private static final String REGION_NAME_LOCATOR = "//*[contains(@id, \"menu-list\")]//*[text()='%s']";

    private static final String PAGE_NAME = "MainPage";

    private final Button businessButton = new Button(By.xpath("//nav//*[text()='Бизнесу']"), "businessButton");
    private final Button regionSelectButton = new Button(By.xpath("//*[contains(@id, \"menu-button\")]"), "regionSelectButton");
    private final Button depositMenuButton = new Button(By.xpath("//*[contains(@class, \"chakra-link\")]//*[text()='Вклады']"), "depositMenuButton");
    private final Button OsenMenuButton = new Button(By.xpath("//*[contains(@class, \"chakra-link\")]//*[text()='Вклады']/following::*[text()='Осень']"), "OsenMenuButton");


    // private final Button depositFormButton = new Button(By.xpath("//button[contains(@role, \"tab\")][text()='Вклад']"));

    public MainPage() {
        super(By.xpath(MAIN_PAGE_LOCATOR), PAGE_NAME);
    }

    public void businessButtonClick() {
        businessButton.buttonClick();
    }

    public String changeRegion(String regionName) {
        regionSelectButton.buttonClick(REGION_BUTTON_ATTR);

        var regionToSelect = new Button(By.xpath(String.format(REGION_NAME_LOCATOR, regionName)), "regionMenuButton");
        regionToSelect.buttonClick();
        return regionSelectButton.getButtonText();
    }

    public void depositMenuButtonClick() {
        depositMenuButton.buttonClick();
    }

    public void openOsenPage() {
        var element = depositMenuButton.getElement();
        ActionsManager.moveToElement(element);
        OsenMenuButton.buttonClick();
    }
}
