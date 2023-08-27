package testcases;

import data.Global;
import factory.BaseTest;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {

    @Test
    public void test1() {

        driver.get(Global.googleUrl);

        System.out.println("First test");
    }

    @Test
    public void test2() {

        driver.get(Global.googleUrl);

        System.out.println("Second test");
    }
}
