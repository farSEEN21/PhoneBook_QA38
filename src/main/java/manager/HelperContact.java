package manager;

import model.Contact;
import model.UserLombok;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperContact extends HelperBase {
    public HelperContact(WebDriver wd) {
        super(wd);
    }


    public void openContactForm() {
        wd.findElement(By.xpath("//*[.='ADD']")).click();

    }
    public void FillContactForm(Contact user) {

        type(By.xpath("//input[@placeholder='Name']"), user.getName());
        type(By.xpath("//input[@placeholder='Last Name']"), user.getLastname());
        type(By.xpath("//input[@placeholder='Phone']"), user.getPhone());
        type(By.xpath("//input[@placeholder='email']"), user.getEmail());
        type(By.xpath("//input[@placeholder='Address']"), user.getAddress());
    }

    public void submitContctForm() {
        click(By.xpath("//button[.='Save']"));
    }

    public boolean isContcatCreated(Contact contact){

        String phoen = wd.findElement(By.xpath("//div[@class='contact-item_card__2SOIM'][last()]//h3")).getText();
        return phoen.equals(contact.getPhone());
    }

    public int checknumber(){
      int number=  wd.findElements(By.xpath("//div[@class='contact-item_card__2SOIM']")).size();
    return number;}
    public void deletecontact(){
        wd.findElement(By.xpath("//div[@class='contact-item_card__2SOIM'][last()]")).click();
        wd.findElement(By.xpath("//button[normalize-space()='Remove']")).click();

    }


}
