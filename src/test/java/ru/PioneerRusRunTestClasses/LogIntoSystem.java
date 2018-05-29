package ru.PioneerRusRunTestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.PioneerRusBase.BaseTest;
import ru.PioneerRusPagesLocators.MainPage;

/**
 * Created by 1 on 27.05.2018.
 */
public class LogIntoSystem extends BaseTest {

    private String expectedUnvalidMailMessage = "Введите ваш e-mail.";
    private String expectedUnvalidPasswordMessage = "Введите пароль, который пришел Вам на e-mail.";


    @Test(groups = {"disable test"})
    public void LogInFormUnvalidEmail() throws Exception {
        MainPage mainPage = new MainPage(driver, log);
        mainPage.clickLogInBtnHeader();
        mainPage.enterDataLogInFormOnHeaderAndSubmit("", "2d");
        Assert.assertTrue(expectedUnvalidMailMessage.equals(mainPage.getActualUnvalidMailMess()),
                "\nExpected message is: " + expectedUnvalidMailMessage + "\nActualMessage is: " +
                        mainPage.getActualUnvalidMailMess());

    }

    @Test
    public void LogInFormUnvalidPassword() throws Exception {
        MainPage mainPage = new MainPage(driver, log);
        mainPage.clickLogInBtnHeader();
        mainPage.enterDataLogInFormOnHeaderAndSubmit("www@mail.com","");
        Assert.assertTrue(expectedUnvalidPasswordMessage.equals(mainPage.getActualUnvalidPasswordMess()),
                "\nExpected message is: " + expectedUnvalidPasswordMessage + "\nActualMessage is: " +
                        mainPage.getActualUnvalidPasswordMess());

    }
}
