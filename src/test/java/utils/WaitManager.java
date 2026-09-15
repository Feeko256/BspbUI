package utils;

import browser.Driver;
import config.Config;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitManager {
    private static WebDriverWait wait = null;

    public static WebDriverWait getWait() {
        if (wait == null) {
            wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(Config.WAIT_TIME));
        }
        return wait;
    }

    public static void clearWait() {
        wait = null;
    }
}
