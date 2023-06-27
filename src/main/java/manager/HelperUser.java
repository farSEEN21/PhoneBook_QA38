package manager;

import model.User;
import model.UserLombok;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
    public void FillForm(UserLombok user)
    {

        type(By.xpath("//input[1]"), user.getEmail());
        type(By.xpath("//input[2]"), user.getPsw());

    }   public void FillForm(User user)
    {

        type(By.xpath("//input[1]"), user.getEmail());
        type(By.xpath("//input[2]"), user.getPsw());

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

    public boolean isAlertPresent() {
        //var 1
//        WebDriverWait wait = new WebDriverWait(wd, 15);
//        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//        String text = alert.getText();
//        alert.accept();
        // var 2
        Alert alert =new WebDriverWait(wd,10).until(ExpectedConditions.alertIsPresent());
        if (alert==null) return false;
        wd.switchTo().alert();

                alert.accept();
                return true;

    }
public boolean isWrongFormatMessage(){
    Alert alert =new WebDriverWait(wd,10).until(ExpectedConditions.alertIsPresent());
    return alert.getText().contains("Wrong email or password ");
}


}
