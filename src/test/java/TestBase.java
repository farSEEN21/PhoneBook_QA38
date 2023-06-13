import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class TestBase {


    WebDriver wd;

    @BeforeSuite
    public void init() {
        wd = new ChromeDriver();
        wd.navigate().to("https://telranedu.web.app/home");
      //  wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }


    @AfterSuite
    public void tears() {

        wd.quit();
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void type(By locator, String text) {
        WebElement element = wd.findElement(locator);
        element.click();
        element.clear();
        element.sendKeys(text);

    }

    public void pause(int mils) {
        try {
            Thread.sleep(mils);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    public void openLoginForm() {
        wd.findElement(By.xpath("//*[.='LOGIN']")).click();

    }

    public void FillForm(String log, String psw) {

        type(By.xpath("//input[1]"), log);
        type(By.xpath("//input[2]"), psw);

    }
public void submitReg(){
        click(By.xpath("//button[2]"));
}
public boolean isElementPresent(By locator){
    return wd.findElements(locator).size() > 0;

}
}
