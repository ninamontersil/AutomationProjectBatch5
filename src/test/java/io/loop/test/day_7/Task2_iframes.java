package io.loop.test.day_7;

import io.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Task2_iframes extends TestBase {

    /*
    1. open a chrome browser
    2 go to : htpps://loopcamp.vercel.app/iframe.html
    3
    clear text from comment body
    4 type the loop academy in a comment
    5 verify loop acadamy text is written
    6 verify headed "An iFrame containing the TinyMCE WYSIWYG Editor' is displayed
     */


    @Test
    public void iframeTest() {
        driver.get("https://loopcamp.vercel.app/iframe.html");

        // Switch to iframe by index
        // driver.switchTo().frame(0);

        // Switch to iframe by name or id
        driver.switchTo().frame("mce_0_ifr");

        WebElement someText = driver.findElement(By.xpath("//p[.='Your content goes here.']"));
        System.out.println("someText.getText() = " + someText.getText());
    }

        @Test
        public void nestedFrame(){
            driver.get("https://loopcamp.vercel.app/nested-frames.html");
            // Find all frames
            List<WebElement> iframes;
            iframes = driver.findElements(By.xpath("//frame"));
            System.out.println("iframe size = " + iframes.size());
        }

    }



