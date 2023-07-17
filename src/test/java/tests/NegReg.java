package tests;
import manager.ProvideData;

import manager.ProvideData;
import model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import tests.TestBase;

import java.util.concurrent.TimeUnit;

public class NegReg extends TestBase {

    WebDriver wd;

    @BeforeTest(alwaysRun = true)
    public void intial(){
        wd = new ChromeDriver();
        wd.navigate().to("https://telranedu.web.app/home");
        wd.manage().window().maximize();
                wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Test(dataProvider = "UserDTOCSV",dataProviderClass =ProvideData.class )
    public void NegTestWithOut2(User user) {


        wd.findElement(By.xpath("//*[.='LOGIN']")).click();
//        int i = (int) (System.currentTimeMillis() / 1000) / 3600;
    app.getUsers().FillForm(user);
//        WebElement emailinput = wd.findElement(By.xpath("//input[1]"));
//        emailinput.click();
//        emailinput.clear();
//        emailinput.sendKeys("h1"+i+"h.ru");
//
//        WebElement pswinput = wd.findElement(By.xpath("//input[2]"));
//        pswinput.click();
//        pswinput.clear();
//        pswinput.sendKeys("Sd@aswx11");
        app.getUsers().submitReg();
        app.getUsers().pause(500);
        Assert.assertTrue(wd.findElements(By.xpath("//*[.='Sign Out']")).size() > 0);

        app.getUsers().pause(500);
//        wd.findElement(By.xpath("//button[2]")).click();
      // firebase
        // wd.close();

    }

    @AfterTest(alwaysRun = true)
    public void tears() {

       // wd.quit();
    }
}
