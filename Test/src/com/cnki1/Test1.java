package com.cnki1;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2017/10/22 0022.
 */
public class Test1 {
    @Parameters("username")
    @Test(groups = {"all", "test1", "test2"})
    public void test11(@Optional("ll") String s) {
        System.out.println(s);
        Assert.assertEquals(1, 1);
    }

    @Test(groups = {"all", "test1"})
    public void test2() {
        Assert.assertEquals(2, 2);
    }

    @Test(groups = {"all", "test3"})
    public void test3() {
        Assert.assertEquals(3, 3);
    }

    @DataProvider(name = "Test-provider")
    public Object[][] rangeData() {
        int lower = 5;
        int upper = 10;
        return new Object[][]{{lower, lower, upper, false},
                {lower, lower, upper, true}};
    }

    @Test(dataProvider = "Test-provider")
    public void testProvider(int n, int i, int upper, boolean exp) {
        System.out.println("" + n + i + upper + exp);
    }
}
