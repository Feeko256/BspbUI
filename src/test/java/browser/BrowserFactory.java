package browser;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.List;

public enum BrowserFactory {
    CHROME {
        @Override
        public WebDriver createDriver(List<String> args, PageLoadStrategy strategy) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments(args);
            options.setPageLoadStrategy(strategy);
            return new ChromeDriver(options);
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
    },
    EDGE {
        @Override
        public WebDriver createDriver(List<String> args, PageLoadStrategy strategy) {
            EdgeOptions options = new EdgeOptions();
            options.addArguments(args);
            options.setPageLoadStrategy(strategy);
            return new EdgeDriver(options);
        }
    };

    public abstract WebDriver createDriver(List<String> args, PageLoadStrategy strategy);
}
