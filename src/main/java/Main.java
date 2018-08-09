import driver.DriverFactory;
import driver.Driver;
import org.openqa.selenium.WebDriver;

public class Main
{
    public static void main(String[] args) {
        WebDriver driver = new DriverFactory().getDriver(Driver.CHROME);
        driver.get("http://www.google.com");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
