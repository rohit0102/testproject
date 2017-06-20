package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static Common.Driver.driver;

/**
 * Created by rohitsamala on 20/06/2017.
 */
public class HomePage {

    @FindBy(how = How.CSS, using = ".icons.glyph")
    private WebElement Contacts;

    public void  clickPage(String pageName){

        WebElement myDynamicElement =
                (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".navigation__menu__item>a>span")));


        List<WebElement> homePageTabs  = driver.findElements(By.cssSelector(".navigation__menu__item>a>span"));

        for (WebElement page:homePageTabs
             ) {
            String name = page.getText();
            if (name.equals(pageName)){
                page.click();
                break;
            }

        }

    }


    public void clickOnContacts(){
        Contacts.click();
    }

    public boolean checkLatestNews(){

        boolean latestNewsPresent = false;

        List<WebElement> headings  = driver.findElements(By.cssSelector(".block-header__heading"));

        for (WebElement page:headings
                ) {
            String name = page.getText();
            if (name.equals("LATEST NEWS")){
                page.click();
                latestNewsPresent = true;
                break;
            }

        }
        return latestNewsPresent;
    }
}
