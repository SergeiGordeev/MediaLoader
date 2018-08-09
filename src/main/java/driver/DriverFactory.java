package driver;

import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverFactory {

    public RemoteWebDriver getDriver(Driver driver)
    {
        switch (driver)
        {
            case CHROME:
                return new ChromeWebDriver().getWebDriver();
            case FIREFOX:
                return new FireFoxWebDriver().getWebDriver();
            case INTERNET_EXPLORER:
                return new InternetExplorerWebDriver().getWebDriver();
        }
        return null;
    }
}
