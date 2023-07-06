package tests;

import model.Contact;
import model.UserLombok;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddNewContactTests extends TestBase {
Logger logger= LoggerFactory.getLogger(AddNewContactTests.class);


    @BeforeMethod
    public void precondition() {
        if (!app.getUsers().isLogin()) {
            UserLombok userLom = UserLombok.builder().email("a@a1.ru").psw("DJS@sda1").build();
            app.getUsers().openLoginForm();
            app.getUsers().FillForm(userLom);
            app.getUsers().submitlog();
            app.getUsers().pause(5000);
        }
    }

    @Test(invocationCount = 5)
    public void addNewContactPositiv() {
        int i = (int) (System.currentTimeMillis() / 1000) % 3600;
        Contact contact = Contact.builder()
                .name("Jonny" + i / 2).Lastname("wefsds").address("dfsf" + i)
                .phone(i + "231511").email("dsf" + i + "sdfs@fdssfd.ru")
                .build();
        logger.info("Phone number is "+ contact.getPhone());
        app.getHelperContact().openContactForm();
        app.getHelperContact().FillContactForm(contact);
        app.getHelperContact().submitContctForm();
        app.getHelperContact().pause(5000);
        Assert.assertTrue(app.getHelperContact().isContcatCreated(contact));
    }


}
