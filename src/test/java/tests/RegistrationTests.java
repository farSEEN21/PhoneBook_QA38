package tests;

import manager.TestNGListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(TestNGListener.class)
public class RegistrationTests extends TestBase {


    @Test
    public void negTestPsw() {
        app.getUsers().areLogin();
        app.getUsers().openLoginForm();
        int i = (int) (System.currentTimeMillis() / 1000) / 3600;
        app.getUsers().FillForm("h1" + i + "h.ru", "hsdgjwh");
        app.getUsers().submitReg();

        app.getUsers().pause(500);
    Assert.assertTrue(app.getUsers().isWrongFormatMessage());
        Assert.assertTrue(app.getUsers().isAlertPresent());



    }
}
