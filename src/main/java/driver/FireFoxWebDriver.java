package driver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FireFoxWebDriver implements BrowserWebDriver {

    public RemoteWebDriver getWebDriver() {
        System.setProperty("webdriver.chrome.driver", DriversPathConstants.FIRE_FOX_WEB_DRIVER_LOCAL_PATH);
        return new ChromeDriver();
    }
}
