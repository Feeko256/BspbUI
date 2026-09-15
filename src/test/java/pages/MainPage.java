package pages;

import elements.Button;
import org.openqa.selenium.By;

public class MainPage extends BasePage{
    private static final String MAIN_PAGE_LOCATOR = "//*[text()='Выберите свой продукт']";
    private final Button businessButton = new Button(By.xpath("//nav//*[text()='Бизнесу']"));
    private final Button regionSelectButton = new Button(By.xpath("//*[contains(@id, \"menu-button\")]"));
    private final Button regionToSelect = new Button(By.xpath("//*[contains(@id, \"menu-list\")]//*[text()='Санкт-Петербург']"));
    public MainPage() {
        super(By.xpath(MAIN_PAGE_LOCATOR));
    }

    public void businessButtonClick(){
        businessButton.buttonClick();
    }

    public void selectRegionButtonClick(){
        regionSelectButton.buttonClickWithAtr("aria-expanded");
    }

    public String regionSelectorText(){
        return regionSelectButton.getButtonText();
    }

    public void selectRegion(){
        regionToSelect.buttonClick();
    }
}
