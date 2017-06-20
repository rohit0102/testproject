package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by rohitsamala on 20/06/2017.
 */
public class Driver {

    public static WebDriver driver;

    public static void initialiseDriver(){

        System.setProperty("webdriver.gecko.driver","src/test/java/common/geckodriver");

        driver = new FirefoxDriver();
    }
}
