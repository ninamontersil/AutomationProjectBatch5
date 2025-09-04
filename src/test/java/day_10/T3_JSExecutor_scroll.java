package day_10;

import io.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

public class T3_JSExecutor_scroll {
    @Test
    public void loopcampScroll(){
        Driver.getDriver().get("https://loopcamp.vercel.app/index.html");

        WebElement link = Driver.getDriver().findElement(By.xpath("//a[@href='https://www.loopcamp.io/']"));

        //how to scroll
        //#1 use the actions class move to element
        Actions actions = new Actions(Driver.getDriver());
        //  actions.moveToElement(link).perform();
        //  actions.scrollToElement(link).perform(); // same thing as moveToElement()

        System.out.println("....................................");

        //#2 use key press
        //actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN, Keys.PAGE_DOWN).perform();

        //#3 move horizontally or vertically
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        // js.executeScript("window.scroll(0, 5000)");

        //#4 move scroll to view
        js.executeScript("arguments[0].scrollIntoView(true)", link);

        js.executeScript("arguments[0].click()", link);
        js.executeScript("window.scroll(0, 500)");
    }


}
/*

Go to https://loopcamp.vercel.app/index.html
Scroll down to the link*/