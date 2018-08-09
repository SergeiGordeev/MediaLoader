package driver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

class InternetExplorerWebDriver implements BrowserWebDriver
{
    public RemoteWebDriver getWebDriver() {
        System.setProperty("webdriver.chrome.driver", DriversPathConstants.INTERNET_EXPLORER_WEB_DRIVER_LOCAL_PATH);
        return new ChromeDriver();
    }
}
