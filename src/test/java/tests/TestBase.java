package tests;

import manager.ApplicationManger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {


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

   static ApplicationManger app= new ApplicationManger();





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
