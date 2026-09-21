package utils;

import browser.Driver;
import config.Config;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitManager {

    public static WebDriverWait getWait() {
        return new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(Config.WAIT_TIME));
    }
}
