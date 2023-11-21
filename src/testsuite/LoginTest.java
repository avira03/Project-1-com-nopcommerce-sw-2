package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    static String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {

        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        String expectedResult = "Welcome, Please Sign In!";
        WebElement login = driver.findElement(By.xpath("//a[text() = 'Log in']"));
        login.click();

        WebElement welcome = driver.findElement(By.xpath("//h1[text() ='Welcome, Please Sign In!']"));
        String actualResult = welcome.getText();

        Assert.assertEquals("Not redirected to Login page", expectedResult, actualResult);

    }


    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        String expectedResult = "Log out";
        String email = "abc@gmail.com";
        String pass = "123456";
        WebElement login = driver.findElement(By.xpath("//a[text() = 'Log in']"));
        login.click();

        WebElement loginEmail = driver.findElement(By.id("Email"));
        loginEmail.sendKeys(email);

        WebElement loginPass = driver.findElement(By.id("Password"));
        loginPass.sendKeys(pass);


        WebElement loginIn = driver.findElement(By.xpath("//button[text()='Log in']"));
        loginIn.click();

        WebElement loggedIn = driver.findElement(By.xpath("//a[text()='Log out']"));
        String actualResult = loggedIn.getText();

        Assert.assertEquals("Not redirected to Login page", expectedResult, actualResult);

    }


    @Test
    public void verifyTheErrorMessage() {
        String expectedResult = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String email = "xyz@gmail.com";
        String pass = "123456";
        WebElement login = driver.findElement(By.xpath("//a[text() = 'Log in']"));
        login.click();

        WebElement loginEmail = driver.findElement(By.id("Email"));
        loginEmail.sendKeys(email);

        WebElement loginPass = driver.findElement(By.id("Password"));
        loginPass.sendKeys(pass);


        WebElement loginIn = driver.findElement(By.xpath("//button[text()='Log in']"));
        loginIn.click();

        WebElement errorMessage = driver.findElement(By.xpath("//div[contains(text(),'Login was unsuccessful')]"));
        String actualResult = errorMessage.getText();

        Assert.assertEquals("Not redirected to Login page", expectedResult, actualResult);

    }

    @After
    public void tearDown() {

        closeBrowser();

    }
}
