package day_8;

import io.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.time.Duration;
import java.util.Set;

import static org.testng.Assert.assertEquals;

public class T2_Windows extends TestBase {

    /*
    1. Open a chrome browser
    2. Go to : http://the-internet.herokuapp.com/windows
    3. Assert: Title is “The Internet”
    4. Click to: “Click Here” link
    5. Switch to new Window.
    6. Assert: Title is “New Window”
     */

    @Test
    public void text_window_handle() {
        driver.get("http://the-internet.herokuapp.com/windows");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // Assert: Title is "the internet"
        assertEquals(driver.getTitle(), "The Internet", "Actual does not much expected");

        //print out the current window handle
        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandles());

        //4 . click to: "Click here" link
        WebElement clickHere = driver.findElement(By.xpath("//a[text()='Click Here']"));
        clickHere.click();

        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandles());



        //get original window handle
        String originalWindow=driver.getWindowHandle();


        //get all window handles
        Set<String> windowHandles = driver.getWindowHandles();

        //loop through and stay at the last window
        for (String each : windowHandles) {
            System.out.println("each window handle: " + each);
            driver.switchTo().window(each);

            }
        System.out.println("driver.getTitle() = " + driver.getTitle());

        //switch to original window
        driver.switchTo().window(originalWindow);
        System.out.println("driver.getTitle() = " + driver.getTitle());
        }





    }

