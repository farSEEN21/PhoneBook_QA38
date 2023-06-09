import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTests {
    WebDriver wd;
    @BeforeTest
    public void prelogin(){
        wd=new ChromeDriver();
wd.navigate().to("https://telranedu.web.app/home");
    }


    @Test
    public void loginPositiv(){
wd.findElement(By.xpath("//*[.='LOGIN']")).click();
        WebElement emailinput = wd.findElement(By.xpath("//input[1]"));
emailinput.click();
emailinput.clear();
emailinput.sendKeys("h@h.ru");
        WebElement pswinput = wd.findElement(By.xpath("//input[2]"));
pswinput.click();
pswinput.clear();
 pswinput.sendKeys("Sd@aswx11");

 wd.findElement(By.xpath("//button[1]")).click();

        Assert.assertTrue(wd.findElements(By.xpath("//*[.='Sign Out']")).size()>0);

    }



   @AfterTest
 public void tears() throws InterruptedException {
       // wd.wait(50);
        wd.quit();}






}
