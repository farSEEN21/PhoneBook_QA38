package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{



    @BeforeMethod
    public void precon(){
        if (app.getUsers().areLogin())
        {
            app.getUsers().logout();
        }

    }

//    @BeforeTest
//    public void prelogin(){
//        wd=new ChromeDriver();
//wd.navigate().to("https://telranedu.web.app/home");
//wd.manage().timeouts().implicitlyWait(5, TimeUnit.DAYS);
//    }


//    @Test
//    public void loginPositiv(){
//
//        wd.findElement(By.xpath("//*[.='LOGIN']")).click();
//
//        WebElement emailinput = wd.findElement(By.xpath("//input[1]"));
//emailinput.click();
//emailinput.clear();
//emailinput.sendKeys("h@h.ru");
//        WebElement pswinput = wd.findElement(By.xpath("//input[2]"));
//pswinput.click();
//pswinput.clear();
// pswinput.sendKeys("Sd@aswx11");
//
// wd.findElement(By.xpath("//button[1]")).click();
//        app.getUsers().pause(5000);
//        Assert.assertTrue(wd.findElements(By.xpath("//*[.='Sign Out']")).size()>0);
//
//    }
//    @Test
//    public void loginNegEmail(){
//
//        wd.findElement(By.xpath("//*[.='LOGIN']")).click();
//        WebElement emailinput = wd.findElement(By.xpath("//input[1]"));
//        emailinput.click();
//        emailinput.clear();
//        emailinput.sendKeys("hh.ru");
//        WebElement pswinput = wd.findElement(By.xpath("//input[2]"));
//        pswinput.click();
//        pswinput.clear();
//        pswinput.sendKeys("Sd@aswx11");
//
//
//
//
//
//    }



//   @AfterTest
// public void tears()
//   {
//       // wd.wait(50);
////        wd.quit();}
//   }

//    public static class NegTestPas   {
//
////        @Test
////        public void registNegWrongEmail2() {
////            int i = (int) (System.currentTimeMillis() / 1000) / 3600;
////
////            String email = "abc"+i+"kdf.ru",
////            psw = "DJS@sda1";
////            openLoginForm();
////            FillForm(email, psw);
////
////            submitReg();
////           // Assert.assertTrue(isElementPresent("//Button1"));
////
////        }
//
//
//    }

//    @Test
//    public void NegLogin(){
//
//       // init();
//        openLoginForm();
//        FillForm("h@h.ru","osdao");
//        submitlog();
//        isElementAlert();
//        pause(5000);
//    }

@Test
    public void LoginPositTestBase(){
    app.getUsers().openLoginForm();
    app.getUsers().FillForm("a@a1.ru","DJS@sda1");
    app.getUsers().    submitlog();
    app.getUsers().pause(5000);

        Assert.assertTrue(app.getUsers().isElementPresent(By.xpath("//*[.='Sign Out']")));
        app.getUsers().pause(5000);
}

}

