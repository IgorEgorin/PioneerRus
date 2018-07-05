package ru.PioneerRusPagesLocators;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.PioneerRusBase.BasePageObject;

/**
 * Created by 1 on 29.05.2018.
 */
public class WhereToBuy extends BasePageObject<WhereToBuy>{

    private By whereToBuyFieldEnterCity = By.id("edit-distance-origin");
    private By whereToBuyButtonSearchCity = By.id("edit-submit-locator");
    private By whereToBuyGoToOneOfStoreWebPage = By.xpath("(//div[@class='views-field views-field-field-store-website'])[4]");

    protected WhereToBuy(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void clickWhereToBuyFieldEnterCity() {
        type("Санкт",whereToBuyFieldEnterCity);
        click(whereToBuyButtonSearchCity);
    }

    public void clickWhereToBuyGoToOneOfStoreWebPage() {
        click(whereToBuyGoToOneOfStoreWebPage);
    }
}


