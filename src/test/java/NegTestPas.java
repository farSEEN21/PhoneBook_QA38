import org.testng.Assert;
import org.testng.annotations.Test;

public class NegTestPas extends TestBase1 {

    @Test
    public void registNegWrongEmail2() {
        int i = (int) (System.currentTimeMillis() / 1000) / 3600;

        String email = "abc"+i+"kdf.ru",
        psw = "DJS@sda1";
        openLoginForm();
        FillForm(email, psw);

        submitReg();
       // Assert.assertTrue(isElementPresent("//Button1"));

    }


}
