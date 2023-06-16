import org.testng.annotations.Test;

public class RegistrationTests extends TestBase
{



    @Test
    public void negTestPsw(){
     init();
        openLoginForm();
        int i = (int) (System.currentTimeMillis() / 1000) / 3600;
        FillForm("h1"+i+"@h.ru","hsdgjwh" );
        submitReg();

        pause(500);
        isElementAlert();


        pause(5000);

    }
}
