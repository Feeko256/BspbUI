package browser;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum BrowserFactory {
    CHROME {
        @Override
        public WebDriver createDriver(List<String> args, PageLoadStrategy strategy) {
            return new ChromeDriver(configureChromium(new ChromeOptions(), args, strategy));
        }
    },
    EDGE {
        @Override
        public WebDriver createDriver(List<String> args, PageLoadStrategy strategy) {
            return new EdgeDriver(configureChromium(new EdgeOptions(), args, strategy));
        }
    },
    FIREFOX {
        @Override
        public WebDriver createDriver(List<String> args, PageLoadStrategy strategy) {
            FirefoxOptions options = new FirefoxOptions();
            options.addArguments(args);
            options.setPageLoadStrategy(strategy);
            return new FirefoxDriver(options);
        }
    };

    public abstract WebDriver createDriver(List<String> args, PageLoadStrategy strategy);

    private static <T extends ChromiumOptions<T>> T configureChromium(T options, List<String> args, PageLoadStrategy strategy) {
        options.addArguments(args);
        options.setPageLoadStrategy(strategy);

        Map<String, Object> prefs = new HashMap<>();
        prefs.put("profile.default_content_setting_values.geolocation", 2);
        options.setExperimentalOption("prefs", prefs);

        return options;
    }
}
