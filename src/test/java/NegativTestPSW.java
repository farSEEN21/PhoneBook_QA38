import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NegativTestPSW extends TestBase
{
WebDriver wd;
@BeforeTest
public void open(){
    init();
}


    @Test
    public void negTestPsw(){
    click(By.xpath("//*[.='LOGIN']"));
        int i = (int) (System.currentTimeMillis() / 1000) / 3600;
    type(By.xpath("//input[1]"), "h1'+i+'@h.ru");
    }
}
