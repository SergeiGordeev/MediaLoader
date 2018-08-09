package driver;

import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverFactory {

    public RemoteWebDriver getDriver(Driver driver)
    {
        if(driver.equals(Driver.CHROME))
        {
            return new ChromeWebDriver().getWebDriver();
        }
        if(driver.equals(Driver.FIREFOX))
        {
            return new FireFoxWebDriver().getWebDriver();
        }
        return null;
    }
}
