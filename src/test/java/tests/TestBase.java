package tests;

import manager.ApplicationManger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.Method;

public class TestBase {
    Logger logger= LoggerFactory.getLogger(TestBase.class);
    static ApplicationManger app= new ApplicationManger();

//    WebDriver wd;
//
    @BeforeSuite
    public void setUp() {
app.init();
    }


    @AfterSuite
 public void stop(){
        app.tears();
    }
@BeforeMethod
    public void startLogger(Method method){
        logger.info(method.getName()+"is started");
}

@AfterMethod
    public void end(){

        logger.info("++++++++++==========================++++++++++++++++++++++++++++");




















































































}





//    public void click(By locator) {
//        wd.findElement(locator).click();
//    }
//
//    public void type(By locator, String text) {
//        WebElement element = wd.findElement(locator);
//        element.click();
//        element.clear();
//        element.sendKeys(text);
//
//    }
//
//    public void pause(int mils) {
//        try {
//            Thread.sleep(mils);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }


    }

//    public void openLoginForm() {
//        wd.findElement(By.xpath("//*[.='LOGIN']")).click();
//
//    }
//
//    public void FillForm(String log, String psw) {
//
//        type(By.xpath("//input[1]"), log);
//        type(By.xpath("//input[2]"), psw);
//
//    }
//
//    public void submitReg() {
//        click(By.xpath("//button[2]"));
//    }
//    public void submitlog() {
//        click(By.xpath("//button[1]"));
//    }
//    public boolean isElementPresent(By locator) {
//        return wd.findElements(locator).size() > 0;
//
//    }

//    public void isElementAlert() {
//        WebDriverWait wait = new WebDriverWait(wd, 15);
//        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//        String text = alert.getText();
//        alert.accept();
//    }
//    public void logout(){
//        click(By.xpath("//*[.='Sign Out']"));
//    }
//    public boolean areLogin(){
//        return isElementPresent(By.xpath("//*[.='Sign Out']"));
//    }
