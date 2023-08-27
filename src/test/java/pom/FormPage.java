package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormPage {

    private WebDriver driver;

    public FormPage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getFirstNameField(){
        return driver.findElement(By.id("ff_3_names_first_name_"));
    }

    public WebElement getLastNameField(){
        return driver.findElement(By.id("ff_3_names_last_name_"));
    }

    public WebElement getEmailField(){
        return driver.findElement(By.id("ff_3_email"));
    }

    public WebElement getSubjectField(){
        return driver.findElement(By.id("ff_3_subject"));
    }

    public WebElement getMessageField(){
        return driver.findElement(By.id("ff_3_message"));
    }

    public WebElement getSubmitButton(){
        return driver.findElement(By.xpath("//button[text()='Submit Form']"));
    }
}
