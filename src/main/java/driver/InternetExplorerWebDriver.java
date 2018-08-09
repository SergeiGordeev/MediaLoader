package driver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class InternetExplorerWebDriver implements BrowserWebDriver
{
    public RemoteWebDriver getWebDriver() {
        System.setProperty("webdriver.chrome.driver", DriversPathConstants.CHROME_WEB_DRIVER_LOCAL_PATH);
        return new ChromeDriver();
    }
}
