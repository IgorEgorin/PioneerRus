package ru.PioneerRusRunTestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.PioneerRusBase.BaseTest;
import ru.PioneerRusPagesLocators.Header;

/**
 * Created by 1 on 27.05.2018.
 */
public class LogInTest extends BaseTest {

    private String expectedUnvalidMailMessage = "Введите ваш e-mail.";
    private String expectedUnvalidPasswordMessage = "Введите пароль, который пришел Вам на e-mail.";


    @Test(groups = {"disable test"})
    public void LogInFormUnvalidEmail() throws Exception {
        Header header = new Header(driver, log);
        header.clickLogInBtnHeader();
        header.enterDataLogInFormOnHeaderAndSubmit("", "2d");
        Assert.assertTrue(expectedUnvalidMailMessage.equals(header.getActualUnvalidMailMess()),
                "\nExpected message is: " + expectedUnvalidMailMessage + "\nActualMessage is: " +
                        header.getActualUnvalidMailMess());

    }

    @Test
    public void LogInFormUnvalidPassword() throws Exception {
        Header header = new Header(driver, log);
        header.clickLogInBtnHeader();
        header.enterDataLogInFormOnHeaderAndSubmit("www@mail.com","");
        Assert.assertTrue(expectedUnvalidPasswordMessage.equals(header.getActualUnvalidPasswordMess()),
                "\nExpected message is: " + expectedUnvalidPasswordMessage + "\nActualMessage is: " +
                        header.getActualUnvalidPasswordMess());

    }
}
