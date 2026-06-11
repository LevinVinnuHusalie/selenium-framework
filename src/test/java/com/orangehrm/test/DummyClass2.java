package com.orangehrm.test;

import org.testng.annotations.Test;

import com.orangehrm.base.BaseClass;

public class DummyClass2 extends BaseClass {

    @Test
    public void dummyTest2() {
        String title = driver.getTitle();

        assert title.equals("OrangeHRM") : "Test Failed - Incorrect title";

        System.out.println("Test Passed");

    }
}
