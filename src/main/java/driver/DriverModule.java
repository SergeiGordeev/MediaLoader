package driver;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import driver.annotations.Chrome;
import driver.annotations.FireFox;
import driver.annotations.InternetExplorer;

public class DriverModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(BrowserDriver.class).annotatedWith(Chrome.class).to(ChromeWebDriver.class).in(Singleton.class);
        bind(BrowserDriver.class).annotatedWith(FireFox.class).to(FireFoxWebDriver.class).in(Singleton.class);
        bind(BrowserDriver.class).annotatedWith(InternetExplorer.class).to(InternetExplorerWebDriver.class).in(Singleton.class);
    }
}
