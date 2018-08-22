import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import driver.BrowserDriver;
import injector.InjectorModule;
import injector.annotations.Chrome;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import utils.Constants;

import java.util.List;

public class Main
{
    @Inject
    @Chrome
    private BrowserDriver chrome;
    private static RemoteWebDriver driver;
    public static String oldAlt = null;


    public static void main(String[] args) {

        Injector injector = Guice.createInjector(new InjectorModule());
        Main mainInstance = injector.getInstance(Main.class);

        driver = mainInstance.chrome.getDriver();
        driver.get(Constants.DOMAIN_PATH);
        firstTest();
        driver.quit();
    }

    public static void firstTest()
    {
        WebElement postersBlockElement  = driver.findElement(By.xpath("//div[@class='viewport']/ul"));
        List<WebElement> liElements  = postersBlockElement.findElements(By.tagName("li"));
        for(WebElement li : liElements)
        {
            String newAlt = li.findElement(By.xpath("//span[@class='image']/img")).getAttribute("alt");

            if(oldAlt == newAlt)
            {
                return;
            }
            else {
                oldAlt = newAlt;
                System.out.println(newAlt);
            }
        }
    }
}
