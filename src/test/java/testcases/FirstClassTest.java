package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstClassTest {

    @Test
    public static void test1() {
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        System.out.println("First test");

        driver.close();
    }

    @Test
    public static void test2() {
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        System.out.println("Second test");

        driver.close();
    }
}
