package io.loop.test.day_6;

import static org.testng.Assert.*;

import org.testng.Assert;
import org.testng.ITest;
import org.testng.annotations.*;

public class T3_testing_intro {

    @Test (priority = 1)
    public void test2() {
        System.out.println("Test 2 is running");
        String actual1 = "Nina";
        String expected = "Ali";
        Assert.assertEquals(actual1, expected,"Actual does not match expected value");
    }
    @Test (priority = 2)
    public void test1() {
        System.out.println("Test 1 is running");
        String actual1 = "Feyruz";
        String expected = "Nadir";
        Assert.assertEquals(actual1, expected,"This message will show only if test fails");

    }
    @BeforeMethod
    public void setUpMethod() {
        System.out.println("Before Method is running");
    }

    @AfterMethod
    public void tearDownMethod() {
        System.out.println("After Method is running");

    }

    @BeforeClass
    public void setup() {
        System.out.println("Before Class is running");
    }
    @AfterClass
    public void tearDown() {
        System.out.println("After Class is running");
    }





    }


