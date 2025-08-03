package day4;

import io.loop.test.utilities.DocuportConstants;
import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.LoopcampConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_css_practtice {


    /*
    go to docuport app
    identify docuport with css
    get value of the attribute
    validate if it is "Docuport"

    the rest is home work
    locate:
    username
    password
    login
        with css
    login to docuport
    locate home icon of docuport after login or any other element after login
    validated that you logged in

     */

    public static void main(String[] args) {

        //go to the docuport url
        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);
        driver.manage().window().maximize();
        driver.navigate().to(DocuportConstants.DOCUPORT_TEST);

        //locate the element with css

        WebElement logo = driver.findElement(By.cssSelector("img[src='/img/logo.d7557277.svg']"));

        //get value of the attribute
        String actualLogoDocuport = logo.getDomAttribute("alt");
        System.out.println("docuport = " + actualLogoDocuport);

        //validation
        if (DocuportConstants.EXPECTED_LOGO_DOCUPORT.equals(actualLogoDocuport)) {
            System.out.println("expected logo: \"" + LoopcampConstants.EXPECTED_PLACEHOLDER_FOR_FIRSTNAME+ "\", matches actual placeholder: \"" + actualLogoDocuport + "\" => TEST PASS");
        } else {
            System.out.println("expected placeholder for form: \""
                    + LoopcampConstants.EXPECTED_PLACEHOLDER_FOR_FIRSTNAME + "\", DOES NOT match actual placeholder: \"" + actualLogoDocuport + "\" => TEST FAIL");


        }


    }
}