package config;

import browser.BrowserFactory;
import org.openqa.selenium.PageLoadStrategy;

import java.util.List;

public class Config {
    public static final BrowserFactory BROWSER_TYPE = BrowserFactory.CHROME;
    public static final List<String> OPTIONS = List.of("--incognito", "--lang=ru", "--start-maximized", "--ignore-certificate-errors", "--allow-running-insecure-content");
    public static final PageLoadStrategy  STRATEGY = PageLoadStrategy.EAGER;
    public static final Integer  WAIT_TIME = 10;
    public static final String  URL = "https://www.bspb.ru/";
}
