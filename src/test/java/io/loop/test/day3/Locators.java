package io.loop.test.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators {
    public static void main(String[] args) throws InterruptedException {

        //create an option to avoid google capture
        ChromeOptions options =new ChromeOptions();
        options.addArguments("--disable-blink-features=AutomationControlled");



        //create driver object
        WebDriver driver = new ChromeDriver(options);

        //maximize
        driver.manage().window().maximize();

        //navigate to google
        driver.get("https://www.google.com");

        //locate the element
        WebElement searchBoxWithID = driver.findElement(By.id("APjFqb"));

        //get a text to search
        String textToSearch = "Nina Montersil";


        //send the text to the input

        searchBoxWithID.sendKeys(textToSearch);

        //add some wait
        Thread.sleep(3000);


        //clear the box
        searchBoxWithID.clear();

        //click enter
        searchBoxWithID.sendKeys("Nina is nice" + Keys.ENTER);


        //navigate back
        driver.navigate().back();

        Thread.sleep(3000);

        //locate search box with name
        WebElement searchBoxWithName = driver.findElement(By.name("q"));

        //send text to the search box with name
        searchBoxWithName.sendKeys(textToSearch + Keys.ENTER);

        Thread.sleep(3000);

        //navigate back again
        driver.navigate().back();

        Thread.sleep(3000);

        //locate about with using linkText
        WebElement aboutLink = driver.findElement(By.linkText("About"));

        //click that link
        aboutLink.click();
    }
}
