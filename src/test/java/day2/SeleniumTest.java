package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumTest {

    public static void main(String[] args) throws InterruptedException {

        //setting up the driver
        WebDriver driver = new ChromeDriver();


        //older version of selenium you need to set up web driver manager

        //WebDriverManager.chromedriver().setup(); - this is coming from boni garcia

        //maximize the window
        driver.manage().window().maximize();


        //just wait
        Thread.sleep(3000);

        //navigate to the page
        driver.get("https://www.loopcamp.io");


        //navigate to the page
        driver.navigate().to("https://google.com");

        //just wait
        Thread.sleep(3000);

        //navigate back to page
        driver.navigate().back();

        //navigate forward
        driver.navigate().forward();

        //refresh
        driver.navigate().refresh();

        //quitting the browser/driver
        driver.quit();








    }

}
