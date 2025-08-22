package io.loop.test.day4;

import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.LoopcampConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


//public static void main(String[] args) {
//
//}
//
//    /*
//    go to url: https://loopcamp.vercel.app/registration_form.html
//    validate header text expected:  Registration form
//    validate placeholder attribute value for first name expected - first name
//     */
//
//        // go to the url
//        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);
//        driver.manage().window().maximize();
//        driver.navigate().to(LoopcampConstants.REGISTRATION_FORM_URL);
//
//        // spy / locate the element - header
//        WebElement header = driver.findElement(By.tagName("h2"));
//
//        // use getText() method
//        String actualHeaderForForm = header.getText();
//        // validation
//        if(actualHeaderForForm.equals(LoopcampConstants.EXPECTED_HEADER_FOR_FORM)){
//            System.out.println("expected header for form: \""
//                    + LoopcampConstants.EXPECTED_HEADER_FOR_FORM + "\", matches actual header: \"" + actualHeaderForForm + "\" => TEST PASS");
//        } else {
//            System.out.println("expected header for form: \""
//                    + LoopcampConstants.EXPECTED_HEADER_FOR_FORM + "\", DOES NOT match actual header: \"" + actualHeaderForForm + "\" => TEST FAIL");
//        }
//
//        // use get attribute method which will return the value of the attribute, not the text
//        WebElement firstNamePlaceholder = driver.findElement(By.name("firstname"));
//        String actualPlaceholderForFirstname = firstNamePlaceholder.getAttribute("placeholder");
//
//        // validation
//        if(actualPlaceholderForFirstname.equals(LoopcampConstants
//                .EXPECTED_PLACEHOLDER_FOR_FIRSTNAME)){
//            System.out.println("expected placeholder for form: \""
//                    + LoopcampConstants.EXPECTED_PLACEHOLDER_FOR_FIRSTNAME + "\", matches actual placeholder: \"" + actualHeaderForForm + "\" => TEST PASS");
//        } else {
//            System.out.println("expected placeholder for form: \""
//                    + LoopcampConstants.EXPECTED_PLACEHOLDER_FOR_FIRSTNAME + "\", DOES NOT match actual placeholder: \"" + actualHeaderForForm + "\" => TEST FAIL");
//        }
//    }
//
//}