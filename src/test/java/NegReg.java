import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class NegReg {

    WebDriver wd;

    @BeforeTest
    public void intial(){
        wd = new ChromeDriver();
        wd.navigate().to("https://telranedu.web.app/home");
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Test
    public void NegTestWithOut2 (){

        wd.findElement(By.xpath("//*[.='LOGIN']")).click();
        int i = (int) (System.currentTimeMillis() / 1000) / 3600;

        WebElement emailinput = wd.findElement(By.xpath("//input[1]"));
        emailinput.click();
        emailinput.clear();
        emailinput.sendKeys("h1'+i+'h.ru");

        WebElement pswinput = wd.findElement(By.xpath("//input[2]"));
        pswinput.click();
        pswinput.clear();
        pswinput.sendKeys("Sd@aswx11");

        wd.findElement(By.xpath("//button[2]")).click();
      //  wd.close();

    }

    @AfterTest
    public void tears() {

       // wd.quit();
    }
}
