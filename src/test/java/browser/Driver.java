package browser;

import config.Config;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class Driver {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = Config.BROWSER_TYPE.createDriver(Config.OPTIONS, Config.STRATEGY);
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
