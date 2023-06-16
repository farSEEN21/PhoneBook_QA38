package tests;

import org.testng.annotations.Test;

public class RegistrationTests extends TestBase
{



    @Test
    public void negTestPsw(){
        app.getUsers(). areLogin();
        app.getUsers().  openLoginForm();
        int i = (int) (System.currentTimeMillis() / 1000) / 3600;
        app.getUsers().    FillForm("h1"+i+"@h.ru","hsdgjwh" );
        app.getUsers().   submitReg();

        app.getUsers().    pause(500);
        app.getUsers().    isElementAlert();


        app.getUsers().  pause(5000);

    }
}
