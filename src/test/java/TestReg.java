import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import tests.TestBase;

public class TestReg extends TestBase {


    WebDriver wd;


    public class LoginTests {
//        WebDriver wd;

        @BeforeTest
        public void prelogin() {
//            wd = new ChromeDriver();
//            wd.navigate().to("https://telranedu.web.app/home");
//            wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        }

        public void regPositiv() {
            wd.findElement(By.xpath("//*[.='LOGIN']")).click();
            int i = (int) (System.currentTimeMillis() / 1000) / 3600;

            WebElement emailinput = wd.findElement(By.xpath("//input[1]"));
            emailinput.click();
            emailinput.clear();
            emailinput.sendKeys("h1'+i+'@h.ru");

            WebElement pswinput = wd.findElement(By.xpath("//input[2]"));
            pswinput.click();
            pswinput.clear();
            pswinput.sendKeys("Sd@aswx11");

            wd.findElement(By.xpath("//button[2]")).click();
//pause(50000);
            Assert.assertTrue(wd.findElements(By.xpath("//*[.='Sign Out']")).size() > 0);
//Assert.assertTrue(is);
        }








        @AfterTest
        public void tears() {

            wd.quit();
        }

    }
}