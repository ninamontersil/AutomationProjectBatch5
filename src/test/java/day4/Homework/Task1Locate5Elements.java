package day4.Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task1Locate5Elements {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://loopcamp.vercel.app/forgot-password.html");
        driver.manage().window().maximize();

        WebElement loopcampLink = driver.findElement(By.cssSelector("a[href='https://www.loopcamp.io/']"));

        if (loopcampLink.isDisplayed()) {
            System.out.println("LOOPCAMP footer link is displayed ✅");
        } else {
            System.out.println("LOOPCAMP footer link is NOT displayed ❌");
        }

        Thread.sleep(5000);
        driver.quit();
    }
}





