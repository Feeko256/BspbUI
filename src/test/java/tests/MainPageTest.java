package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.BusinessPage;
import pages.MainPage;

public class MainPageTest extends BaseTest {

    @Test
    void checkClientsTypePageTest(){
        MainPage main = new MainPage();
        BusinessPage businessPage = new BusinessPage();

        Assertions.assertTrue(main.isDisplayed());

        main.businessButtonClick();
        Assertions.assertTrue(businessPage.isDisplayed());
    }

    @Test
    void regionSelectTest(){
        MainPage main = new MainPage();
        Assertions.assertTrue(main.isDisplayed());

        Assertions.assertEquals("Вне региона", main.regionSelectorText());
        main.selectRegionButtonClick();
        main.selectRegion();
        Assertions.assertEquals("Санкт-Петербург", main.regionSelectorText());

    }
}
