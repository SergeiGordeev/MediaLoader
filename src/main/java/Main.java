import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import driver.BrowserDriver;
import driver.DriverModule;
import driver.annotations.Chrome;
import org.openqa.selenium.WebDriver;

public class Main
{
    @Inject
    @Chrome
    private BrowserDriver chrome;

    public static void main(String[] args) {

        Injector injector = Guice.createInjector(new DriverModule());
        Main mainInstance = injector.getInstance(Main.class);

        WebDriver chromeDriver = mainInstance.chrome.getDriver();
        chromeDriver.get("http://www.google.com");
        System.out.println(chromeDriver.getTitle());
        chromeDriver.quit();
    }
}
