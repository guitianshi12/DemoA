package com.cnki1;

import org.testng.annotations.*;

/**
 * Created by Administrator on 2017/8/26 0026.
 */
public class PracticeTestNG1 {
    @BeforeTest
    public void beforeTest() {
        System.out.println("beforeTest");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("beforeclass");

    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("beforemethod");
    }

    @Test
    public void aFastTest() {
        System.out.println("practicel:aFastTest");
    }

    @Test(groups = {"test1"})
    public void bSlowTest() {
        System.out.println("bslowtest");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("aftermethod");
    }

    @AfterClass
    public void AfterClass() {
        System.out.println("afterclass");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("afterTest");
    }

}
