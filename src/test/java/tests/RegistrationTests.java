package tests;

import manager.ProvideData;
import manager.TestNGListener;
import model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(TestNGListener.class)
public class RegistrationTests extends TestBase {
    WebDriver wd;


    @Test()
    public void negTestPsw(User user) {
        app.getUsers().isLogin();
        app.getUsers().openLoginForm();
//        int i = (int) (System.currentTimeMillis() / 1000) / 3600;

//        app.getUsers().FillForm("h1" + i + "h.ru", "hsdgjwh");
        app.getUsers().FillForm(user);
        app.getUsers().submitReg();
        Assert.assertTrue(wd.findElements(By.xpath("//*[.='Sign Out']")).size() > 0);

        app.getUsers().pause(500);
//    Assert.assertTrue(app.getUsers().isWrongFormatMessage());
//        Assert.assertTrue(app.getUsers().isAlertPresent());



    }

    @Test(dataProvider = "UserDTOCSV",dataProviderClass = ProvideData.class)
    public void LoginTest1(User user){
        app.getUsers().openLoginForm();
        app.getUsers().FillForm(user);
        app.getUsers().submitReg();
        app.getUsers().pause(200);
        app.getUsers().logout();
    }



    
}
