package tests;

import browser.Driver;
import config.Config;
import io.qameta.allure.Step;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public abstract class BaseTest {

    @Step("Инициализация драйвера и переход на страницу")
    @BeforeEach
    protected void init() {
        Driver.getDriver().get(Config.URL);
    }

    @Step("Закрытие драйвера")
    @AfterEach
    protected void tearDown() {
        Driver.closeDriver();
    }
}
