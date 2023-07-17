package tests;

import model.UserLombok;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RemoveContactTest extends TestBase {
    Logger logger= LoggerFactory.getLogger(AddNewContactTests.class);

    @BeforeMethod(alwaysRun = true)
    public void precondition() {
        if (!app.getUsers().isLogin()) {
            UserLombok userLom = UserLombok.builder().email("a@a1.ru").psw("DJS@sda1").build();
            app.getUsers().openLoginForm();
            app.getUsers().FillForm(userLom);
            app.getUsers().submitlog();
            app.getUsers().pause(5000);
        }
    }
    @Test

    public void removeContact(){

       int i= app.getHelperContact().checknumber();
        app.getHelperContact().deletecontact();
        app.getHelperContact(). pause(3000);
        int z=app.getHelperContact().checknumber();
        System.out.println("result = "+i+"-"+z);
        Assert.assertEquals(i-1,z);
    }
@Test
    public void removeoneContactPot(){
        app.getHelperContact().removeOneContact();
        Assert.assertEquals( app.getHelperContact().removeOneContact() ,-1);
}


@Test
    public void removeallContactPosit(){
    app.getHelperContact().removeAllContacts();
    Assert.assertTrue( app.getHelperContact().isContact());
}


}
