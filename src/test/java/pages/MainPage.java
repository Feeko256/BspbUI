package pages;

import elements.Button;
import org.openqa.selenium.By;

public class MainPage extends BasePage{
    private static final String MAIN_PAGE_LOCATOR = "//*[text()='Выберите свой продукт']";
    private final Button businessButton = new Button(By.xpath("//nav//*[text()='Бизнесу']"));
    public MainPage() {
        super(By.xpath(MAIN_PAGE_LOCATOR));
    }

    public void businessButtonClick(){
        businessButton.buttonClick();
    }
}
