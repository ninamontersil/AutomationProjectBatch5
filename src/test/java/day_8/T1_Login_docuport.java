package day_8;

import io.loop.test.base.TestBase;
import io.loop.test.utilities.DocuportUtils;
import org.testng.annotations.Test;

public class T1_Login_docuport extends TestBase {

    @Test
    public void test_login_logout_docuport() throws InterruptedException {
        driver.get("https://beta.docuport.app/");
        DocuportUtils.login(driver, "client");
        DocuportUtils.logout(driver);
    }
}



