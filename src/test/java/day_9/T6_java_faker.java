package day_9;

import org.openqa.selenium.firefox.FirefoxDriver;
import com.github.javafaker.Faker;
import org.testng.annotations.Test;
public class T6_java_faker {
    @Test
    public void java_faker() {
        Faker faker = new Faker();

        System.out.println("faker.name().fullname() = " + faker.name().fullName());

    }

}