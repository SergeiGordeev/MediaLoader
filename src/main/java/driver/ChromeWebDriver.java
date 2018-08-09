package driver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

class ChromeWebDriver implements BrowserDriver {

    public RemoteWebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", DriversPathConstants.CHROME_WEB_DRIVER_LOCAL_PATH);
        return new ChromeDriver();
    }
}
