import Common.Driver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

/**
 * Created by rohitsamala on 20/06/2017.
 */
@RunWith(Cucumber.class)
@CucumberOptions(

        format = {"pretty","html:target/Destination"} )
public class CukesRunner {

    @BeforeClass
    public static void setup(){

        Driver.initialiseDriver();


    }

    @AfterClass
    public static void teardown(){
        Driver.driver.quit();
    }
}

