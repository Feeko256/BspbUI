package tests;

import browser.Driver;
import config.Config;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import utils.WaitManager;

public abstract class BaseTest {

    @BeforeEach
    protected void init() {
        Driver.getDriver().get(Config.URL);
    }

    @AfterEach
    protected void tearDown() {
        Driver.closeDriver();
        WaitManager.clearWait();
    }
}
