import org.testng.Assert;

/**
 * Created by Administrator on 2017/7/29 0029.
 */
public class Test {
    public void main(String[] args) {

    }

    @org.testng.annotations.Test
    public void test_01() {
        Assert.assertTrue(false);
        System.out.println("testcase1");
    }

    @org.testng.annotations.Test
    public void test_02() {
        Assert.assertTrue(true);
        System.out.println("testcase2");
    }
}
