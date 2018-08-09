package driver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

class FireFoxWebDriver implements BrowserDriver {

    public RemoteWebDriver getDriver() {
        System.setProperty("webdriver.gecko.driver", DriversPathConstants.FIRE_FOX_WEB_DRIVER_LOCAL_PATH);
        return new FirefoxDriver();
    }
}
