package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    static String baseUrl = "https://courses.ultimateqa.com/";

    @Before
    public void setup(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        //click on the ‘Sign In’ link
        WebElement signInLink = driver.findElement(By.linkText("Sign In"));
        signInLink.click();
        //Verify the text ‘Welcome Back!’
        String expectedMessage = "Welcome Back!";
        WebElement actualTextElement = driver.findElement(By.xpath("//h2[@class='page__heading']"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals("Welcome Back!", expectedMessage, actualText);
    }
    @Test
    public void verifyTheErrorMessage(){
        //click on the ‘Sign In’ link
        WebElement signInLink = driver.findElement(By.linkText("Sign In"));
        signInLink.click();
        //Find username filed element and enter "shilpasharma@yahoo.com" username
        WebElement Username = driver.findElement(By.id("user[email]"));
        Username.sendKeys("shilpasharma@yahoo.com");
        //Find password filed element and enter “shi123456” password
        WebElement Password = driver.findElement(By.id("user[password]"));
        Password.sendKeys("shi12345685");
        //Find Click on button and ‘LOGIN’
        WebElement loginButtonElement = driver.findElement(By.xpath("//button[@class='button button-primary g-recaptcha']"));
        loginButtonElement.click();
        //Verify the error message ‘Invalid email or password.’
        String expectedMessage = "Invalid email or password";
        WebElement actualTextElement = driver.findElement(By.xpath("//li[@class='form-error__list-item']"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals("Invalid username and password is not matching", expectedMessage, actualText);
    }
    @After
    public void tearDown()
    {
        closeBrowser();
    }
}


