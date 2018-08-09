package driver;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

class InternetExplorerWebDriver implements BrowserDriver
{
    public RemoteWebDriver getDriver() {
        System.setProperty("webdriver.ie.driver", DriversPathConstants.INTERNET_EXPLORER_WEB_DRIVER_LOCAL_PATH);
        return new InternetExplorerDriver();
    }
}
