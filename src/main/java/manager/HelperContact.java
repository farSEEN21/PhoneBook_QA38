package manager;

import model.Contact;
import model.UserLombok;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelperContact extends HelperBase {
    Logger logger = LoggerFactory.getLogger(HelperContact.class);

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

    public boolean isContcatCreated(Contact contact) {

        String phoen = wd.findElement(By.xpath("//div[@class='contact-item_card__2SOIM'][last()]//h3")).getText();
        return phoen.equals(contact.getPhone());
    }

    public int checknumber() {
        int number = wd.findElements(By.xpath("//div[@class='contact-item_card__2SOIM']")).size();
        return number;
    }

    public void deletecontact() {
        wd.findElement(By.xpath("//div[@class='contact-item_card__2SOIM'][last()]")).click();
        wd.findElement(By.xpath("//button[normalize-space()='Remove']")).click();

    }

    public int removeOneContact() {
        int countBefore = countContacts();
        logger.info("Amount of contacts before is " + countBefore);
        click(By.xpath("//div[@class='contact-item_card__2SOIM']"));
        click(By.xpath("//button[.='Remove']"));
        pause(5000);
        int countAfter = countContacts();
        logger.info("Amount of contacts after is " + countAfter);
        return countAfter - countBefore;
    }

    public int countContacts() {
        return wd.findElements(By.xpath("//div[@class='contact-item_card__2SOIM']")).size();
    }

    public void removeAllContacts() {
        while (wd.findElements(By.xpath("//div[@class='contact-item_card__2SOIM']")).size() > 0) {
            removeOneContact();
        }
    }

    public boolean isContact() {

        return wd.findElements(By.xpath("//div[@class='contact-item_card__2SOIM']")).size() == 0;
    }
}
