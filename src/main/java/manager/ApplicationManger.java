package manager;

import model.Contact;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class ApplicationManger {

//    WebDriver wd;
     HelperUser users;
     HelperContact contact;
Logger logger= LoggerFactory.getLogger(ApplicationManger.class);
    EventFiringWebDriver wd;
    public HelperUser getUsers() {
        return users;
    }
    public HelperContact getHelperContact() {
        return contact;
    }

    @BeforeSuite
    public void init() {
//        wd = new ChromeDriver();
        wd=new EventFiringWebDriver(new ChromeDriver());
        wd.register(new WDListener());
       contact =new HelperContact(wd) ;
        users=new HelperUser(wd);
        wd.navigate().to("https://telranedu.web.app/home");
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }


    @AfterSuite
    public void tears() {

//        wd.quit();
    }

}
