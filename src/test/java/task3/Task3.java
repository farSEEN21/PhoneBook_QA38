package task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task3 {
    WebDriver wd;

    @BeforeTest
    public void pretest() {
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait    (5, TimeUnit.SECONDS);
        wd.get("http://www.leumi.co.il");
    }

    @Test
    public void findEl(){
        System.out.println( wd.findElement(By.cssSelector("li[class='first'] a:nth-of-type(1)")).getText());
 
    }

}
