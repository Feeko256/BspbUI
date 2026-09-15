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
}
