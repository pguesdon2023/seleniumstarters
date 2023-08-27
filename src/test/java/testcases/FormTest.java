package testcases;

import data.Global;
import factory.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.FormPage;

public class FormTest extends BaseTest {

    private FormPage formPage;

    @BeforeMethod
    public void setClass(){
        formPage = new FormPage(driver);
    }

    @Test
    public void test3() {
        driver.get(Global.formUrl);
        formPage.getFirstNameField().sendKeys("test");
        formPage.getLastNameField().sendKeys("test");
        formPage.getEmailField().sendKeys("en@jd.fr");
        formPage.getSubjectField().sendKeys("test");
        formPage.getMessageField().sendKeys("toto");

        formPage.getSubmitButton().click();

        System.out.println("third test");
    }

    @Test
    public void test4() {
        driver.get(Global.formUrl);
        formPage.getFirstNameField().sendKeys("Toto");
        formPage.getLastNameField().sendKeys("Tutu");
        formPage.getEmailField().sendKeys("toto@jd.fr");
        formPage.getSubjectField().sendKeys("test");
        formPage.getMessageField().sendKeys("toto");

        formPage.getSubmitButton().click();

        System.out.println("third test");
    }
}
