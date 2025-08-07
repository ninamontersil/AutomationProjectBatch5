package day4;

import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class interview {
    public static void main(String[] args) {

        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

// Get and print the title of the page
        String actualTitle = driver.getTitle();
        System.out.println("Page title is: " + actualTitle);
    }
}
