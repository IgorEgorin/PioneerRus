package ru.PioneerRusPagesLocators;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.PioneerRusBase.BasePageObject;

/**
 * Created by 1 on 27.05.2018.
 */
public class MainPage extends BasePageObject<MainPage> {

    private By headerLogInBtn = By.id("block-pioneer-header-blocks-header-login");
    private By headerFieldLogIn = By.id("edit-name");
    private By headerFieldPass = By.id("edit-pass");
    private By headerSubmitLogInForm = By.id("edit-submit--2");
    private By unvalidMailMessageLogInForm = By.xpath("(//div[@class='description'])[1]");
    private By unvalidPasswordMessageLogInForm = By.xpath("(//div[@class='description'])[2]");

    public MainPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void clickLogInBtnHeader() {
        find(headerLogInBtn).click();
    }

    public void enterDataLogInFormOnHeaderAndSubmit(String logIn, String password) {
        find(headerFieldLogIn).sendKeys(logIn);
        find(headerFieldPass).sendKeys(password);
        click(headerSubmitLogInForm);
    }
    public String getActualUnvalidMailMess() {
        return find(unvalidMailMessageLogInForm).getText();
    }

    public String getActualUnvalidPasswordMess() {
        return find(unvalidPasswordMessageLogInForm).getText();
    }



}
