package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperUser extends HelperBase{

    public HelperUser(WebDriver wd) {
        super(wd);
    }

    public void openLoginForm() {
        wd.findElement(By.xpath("//*[.='LOGIN']")).click();

    }

    public void FillForm(String log, String psw) {

        type(By.xpath("//input[1]"), log);
        type(By.xpath("//input[2]"), psw);

    }

    public void submitReg() {
        click(By.xpath("//button[2]"));
    }
    public void submitlog() {
        click(By.xpath("//button[1]"));
    }

    public void logout(){
        click(By.xpath("//*[.='Sign Out']"));
    }
    public boolean areLogin(){
        return isElementPresent(By.xpath("//*[.='Sign Out']"));
    }
}