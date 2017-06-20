package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static Common.Driver.driver;

/**
 * Created by rohitsamala on 20/06/2017.
 */
public class ContactsPage {

    public int findOfficeCount(){

        WebElement myDynamicElement =
                (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".contactheader")));

        return driver.findElements(By.cssSelector(".contactcities>li>a:nth-child(2)")).size();

    }
}
