package tests;

import browser.Driver;
import config.TestData;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    @BeforeEach
    void init() {
        Driver.getDriver().get(TestData.URL);
    }

    @AfterEach
    void tearDown() {
        // Driver.closeDriver();
    }
}
