package day_8;

import io.loop.test.base.TestBase;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

public class T3_new_methods_windows  extends TestBase {

    @Test
    public void T3_new_methods_windows(){

        driver.get("https://www.google.com");

        //open a new tab
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://loopcamp.io");

        // open a new window
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.amazon.com");

    }
}
