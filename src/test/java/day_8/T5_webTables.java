package day_8;

import io.loop.test.base.TestBase;
import io.loop.test.utilities.DocuportConstants;
import io.loop.test.utilities.DocuportUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static io.loop.test.utilities.DocuportConstants.ADVISOR;

public class T5_webTables extends TestBase {

    /*
    1. login as an advisor
    2. go to users
    3. validate that full name for alex.de.souza@gmail.com is Alex De Souza
    4. validate that user name for alex.de.souza@gmail.com is alexdesouze
    5. validate that phone number for alex.de.souza@gmail.com is +994512060042
    6. validate that role for alex.de.souza@gmail.com is client
    7. validate that advisor for alex.de.souza@gmail.com is  Batch1 Group1
     */

    @Test
    public void test_webTables() throws InterruptedException {
        DocuportUtils.login(driver, DocuportConstants.ADVISOR);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement users = driver.findElement(By.xpath("//span[contains(text(), 'Users')]"));
        users.click();

        String expectedFullName = "AAlex De Souza";
        String actualFullName = DocuportUtils.returnAnyFieldFromTable(driver, "alex.de.souza@gmail.com", "Full name");

        Assert.assertEquals(actualFullName, expectedFullName, "Actual does not match expected");

        System.out.println("actualFullName = " + actualFullName);
    }

    public static String returnAnyFieldFromTable(WebDriver driver, String emailAddress, String field) throws InterruptedException {
        String xpath = "//td[text()='" + emailAddress + "']/following-sibling::td";
        WebElement element = driver.findElement(By.xpath(xpath));
        return element.getText().trim();


    }


}