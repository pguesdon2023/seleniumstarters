package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SecondClassTest {

    @Test
    public static void test3() {
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        System.out.println("third test");

        driver.close();
    }
}
