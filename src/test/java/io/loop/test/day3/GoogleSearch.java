package io.loop.test.day3;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

    public static void main(String[] args) {

        // In Selenium 3, we had to set up the driver with WebDriverManager:
        // WebDriverManager.chromedriver().setup(); ← Uncomment if needed

        // Create the driver object
        WebDriver driver = new ChromeDriver();

        // Navigate to Google
        driver.get("https://www.google.com");

        // Expected
        String expectedTitle = "Google";

        // Actual
        String actualTitle = driver.getTitle();

        // Validation
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Actual title: " + actualTitle + ", matches expected title: " + expectedTitle + ". => TEST PASS");
        } else {
            System.out.println("Actual title: " + actualTitle + ", DOES NOT match expected title: " + expectedTitle + ". => TEST FAIL");
        }



        // expected URL
        String  expectedURL = "https://www.google.com";

        // actual URL
        String actualURL = driver.getCurrentUrl();

        if(actualURL.contains(expectedURL)){
            System.out.println("Actual url: " + actualURL + ", matches expected URL: " + expectedURL + ". => TEST PASS");
        } else {
            System.err.println("Actual url: " + actualURL + ", DOES NOT match expected URL: " + expectedURL + ". => TEST FAIL");
        }

        driver.quit();
    }

}



