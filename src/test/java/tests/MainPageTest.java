package tests;

import config.TestData;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;
import pages.BusinessPage;
import pages.DepositPage;
import pages.MainPage;
import pages.OsenDepositPage;

import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

public class MainPageTest extends BaseTest {

    @Step("Тест перехода на страницу для бизнеса")
    @Test
    void checkClientsTypePageTest() {
        MainPage main = new MainPage();
        BusinessPage businessPage = new BusinessPage();

        assertThat(main.isDisplayed()).as("Главная страница  должна быть открыта").isTrue();
        main.businessButtonClick();
        assertThat(businessPage.isDisplayed()).as("Страница для бизнеса должна быть открыта").isTrue();
    }

    @Step("Тест выбор региона (full soft)")
    @Test
    void regionSelectTest() {
        MainPage main = new MainPage();
        assertThat(main.isDisplayed()).as("Главная страница  должна быть открыта").isTrue();
        step("Последовательная проверка смены регионов", () -> {
            assertSoftly(softly -> {
                softly.assertThat(main.changeRegion(TestData.REGION_TO_SELECT))
                        .as(String.format("Выбранный регион не [%s]", TestData.REGION_TO_SELECT))
                        .isEqualTo(TestData.REGION_TO_SELECT);
                softly.assertThat(main.changeRegion(TestData.REGION_TO_SELECT_1))
                        .as(String.format("Выбранный регион не [%s]", TestData.REGION_TO_SELECT_1))
                        .isEqualTo(TestData.REGION_TO_SELECT_1);
                softly.assertThat(main.changeRegion(TestData.REGION_TO_SELECT_2))
                        .as(String.format("Выбранный регион не [%s]", TestData.REGION_TO_SELECT_2))
                        .isEqualTo(TestData.REGION_TO_SELECT_2);
            });
        });
    }

    @Step("Тест перехода на страницу вкладов")
    @Test
    void depositMenuClickTest() {
        MainPage main = new MainPage();
        DepositPage depositPage = new DepositPage();

        assertThat(main.isDisplayed()).as("Главная страница  должна быть открыта").isTrue();
        main.depositMenuButtonClick();
        assertThat(depositPage.isDisplayed()).as("Страница вкладов должна быть открыта").isTrue();
    }

    @Step("Тест перехода на страницу вклада Осень")
    @Test
    void openOsenDepositPage() {
        MainPage main = new MainPage();
        OsenDepositPage osenDepositPage = new OsenDepositPage();

        assertThat(main.isDisplayed()).as("Главная страница  должна быть открыта").isTrue();
        main.openOsenPage();
        assertThat(osenDepositPage.isDisplayed()).as("Вклад Осень должен был открыться").isTrue();
    }
}
